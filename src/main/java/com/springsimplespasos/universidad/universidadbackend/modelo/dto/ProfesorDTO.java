package com.springsimplespasos.universidad.universidadbackend.modelo.dto;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Direccion;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.*;

import java.math.BigDecimal;
@Getter
@Setter
@NoArgsConstructor
public class ProfesorDTO extends PersonaDTO{
    private BigDecimal sueldo;

    public ProfesorDTO(Integer id, String nombre, String apellido, String dni, Direccion direccion) {
        super(id, nombre, apellido, dni, direccion);
    }
}
