package org.example.infraestructure.entityMapper;
import org.example.domain.model.Asegurado;
import org.example.infraestructure.entities.AseguradoEntity;
public class AseguradoEntityMapper {

    public static Asegurado toModel(AseguradoEntity entity){
        Asegurado model = new Asegurado();

        model.codigoAsegurado = entity.codigoAsegurado;
        model.rut = entity.rut;
        model.nombre = entity.nombre;
        model.apellido = entity.apellido;
        model.telefono = entity.telefono;

        return model;
    }
}
