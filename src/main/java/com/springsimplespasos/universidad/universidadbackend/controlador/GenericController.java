package com.springsimplespasos.universidad.universidadbackend.controlador;

import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.GenericoDAO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
public class GenericController <E, S extends GenericoDAO<E>> {

    protected final S service;
    protected String nombreEntidad;

    public GenericController(S service) {
        this.service = service;
    }

    //ResponseEntity
    @GetMapping
    public ResponseEntity <?>obtenerTodos(){
        Map<String, Object> mensaje = new HashMap<>();
        List<E> listado = (List<E>) service.findAll();
        if(listado.isEmpty()) {
            //throw new BadRequestException(String.format("No se han encontrado %ss", nombreEntidad));
            mensaje.put("succes", Boolean.FALSE);
            mensaje.put("mensaje", String.format("No existen %ss", nombreEntidad));
            return ResponseEntity.badRequest().body(mensaje);
        }
        mensaje.put("succes", Boolean.TRUE);
        mensaje.put("datos", listado);
        return ResponseEntity.ok(mensaje);
    }
}
