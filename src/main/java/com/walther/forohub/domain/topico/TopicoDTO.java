package com.walther.forohub.domain.topico;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record TopicoDTO(
        @NotBlank String titulo,
        @NotBlank String mensaje,
        @NotBlank String autor,
        @NotBlank String curso
) {
    public TopicoDTO(Topico topico) {
        this(topico.getTitulo(),topico.getMensaje(),topico.getAutor(),topico.getCurso());
    }
}
