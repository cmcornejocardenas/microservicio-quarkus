package org.example.application.controller;

import org.example.domain.dto.AseguradoDTO;
import org.example.domain.puertoEntrada.getAsegurado_PuertoEntrada;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class AseguradoController {

    @Inject
    private getAsegurado_PuertoEntrada getAsegurado_puertoEntrada;

    public AseguradoDTO getAsegurado(Long id){
        return getAsegurado_puertoEntrada.getAsegurado(id);
    }

}
