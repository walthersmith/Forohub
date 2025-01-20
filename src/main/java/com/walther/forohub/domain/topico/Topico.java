package com.walther.forohub.domain.topico;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity(name = "Topico")
@Table(name = "topicos")


public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fecha;
    private String autor;
    private Boolean status;
    private String curso;

    public Topico(TopicoDTO topicoDTO) {
        this.titulo = topicoDTO.titulo();
        this.mensaje = topicoDTO.mensaje();
        this.fecha = LocalDateTime.now();
        this.autor = topicoDTO.autor();
        this.status = true;
        this.curso = topicoDTO.curso();
    }

    public void actualizarDatos(TopicoDTO topicoDTO) {
        this.titulo = topicoDTO.titulo();
        this.mensaje = topicoDTO.mensaje();
        this.autor = topicoDTO.autor();
        this.curso = topicoDTO.curso();
    }


    public Topico() {
    }

    public Topico(Long id, String titulo, String mensaje, LocalDateTime fecha, String autor, Boolean status, String curso) {
        this.id = id;
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.fecha = fecha;
        this.autor = autor;
        this.status = status;
        this.curso = curso;
    }

    public String getTitulo() {
        return titulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
