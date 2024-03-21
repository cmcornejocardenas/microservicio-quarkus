package org.example.domain.puertoSalida;


 import org.example.domain.model.Asegurado;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface GetAsegurado_PuertoSalida {
public Asegurado getAsegurado_PuertoSalida(long id);

}
