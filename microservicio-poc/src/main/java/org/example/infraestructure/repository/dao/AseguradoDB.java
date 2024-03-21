package org.example.infraestructure.repository.dao;

import org.eclipse.microprofile.faulttolerance.Retry;
import org.example.domain.model.Asegurado;
import org.example.domain.puertoSalida.GetAsegurado_PuertoSalida;
import org.example.infraestructure.repository.AseguradoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;
@ApplicationScoped
public class AseguradoDB implements GetAsegurado_PuertoSalida {

    @Inject
    AseguradoRepository panacheRepository;


    @Retry(maxRetries = 3, delay = 3000)
    @Transactional
    public Asegurado getAsegurado_PuertoSalida(Long id){

        List<Asegurado> asegurado = new ArrayList<>();

        asegurado.add(new Asegurado(123,"1234-6","Carolina","Cornejo","234567"));
        asegurado.add(new Asegurado(123,"1234-7","Crital","Cornejo","234567"));
        asegurado.add(new Asegurado(123,"1234-8","Rafael","Villar","234567"));
        asegurado.add(new Asegurado(123,"1234-9","Bertina","Cornejo","234567"));

        // Busca en la lista el asegurado con el ID proporcionado
        for (Asegurado ase : asegurados) {
            if (asegurado.getId().equals(id)) { // Asumiendo que hay un método getId(), o acceso directo a id
                return ase;
            }
        }
        return null; // Retorna null si no se encuentra el asegurado con el ID dado

    }


}
