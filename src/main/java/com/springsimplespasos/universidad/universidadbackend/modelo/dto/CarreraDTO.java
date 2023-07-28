package com.springsimplespasos.universidad.universidadbackend.modelo.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarreraDTO {

    private Integer codigo;
    @NotNull
    @NotEmpty
    @Size(min = 0, max = 80)
    private String nombre;
    @Positive(message = "El valor no puede ser negativo")
    private Integer cantidad_materias;
    @Positive
    private Integer cantidad_anios;


}
