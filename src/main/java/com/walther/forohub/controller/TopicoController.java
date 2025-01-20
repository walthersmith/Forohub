package com.walther.forohub.controller;

import com.walther.forohub.domain.topico.Topico;
import com.walther.forohub.domain.topico.TopicoDTO;
import com.walther.forohub.domain.topico.TopicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    TopicoRepository topicoRepository;

    @PostMapping
    public ResponseEntity<TopicoDTO> addTopico(@RequestBody @Valid TopicoDTO topicoDTO, UriComponentsBuilder uri) {
        var topico = new Topico(topicoDTO);
        URI location = uri.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
        topicoRepository.save(topico);
        return ResponseEntity.created(location).body(topicoDTO);
    }

    @GetMapping
    public ResponseEntity<List<TopicoDTO>> getAllTopicos() {
        List<TopicoDTO> topicos = topicoRepository.findAll().stream()
                .map(TopicoDTO::new).toList();
        return ResponseEntity.ok(topicos);

    }

    @GetMapping("{id}")
    public ResponseEntity<TopicoDTO> getTopico(@PathVariable Long id) {
        TopicoDTO topico = new TopicoDTO(topicoRepository.getReferenceById(id));
        return ResponseEntity.ok(topico);
    }




    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<TopicoDTO> deleteTopico(@PathVariable Long id) {
        var topico = topicoRepository.findById(id).orElse(null);
        if (topico != null) {
            topicoRepository.deleteById(id);
        }
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<TopicoDTO> updateTopico(@PathVariable Long id, @RequestBody @Valid TopicoDTO topicoDTO) {
        var topico = topicoRepository.findById(id).orElse(null);
        if (topico != null) {
            topico.actualizarDatos(topicoDTO);
        }
        return ResponseEntity.ok(topicoDTO);
    }




}
