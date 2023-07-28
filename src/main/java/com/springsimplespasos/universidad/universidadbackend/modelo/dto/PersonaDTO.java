package com.springsimplespasos.universidad.universidadbackend.modelo.dto;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Direccion;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class PersonaDTO {
    private Integer id;
    private String nombre;
    private String apellido;
    @Pattern(regexp = "[0-9]+")
    @Size(min = 1, max = 10)
    private String dni;
    private Direccion direccion;


}
