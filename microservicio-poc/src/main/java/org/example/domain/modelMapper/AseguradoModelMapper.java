package org.example.domain.modelMapper;
 import org.example.domain.dto.AseguradoDTO;
 import org.example.domain.model.Asegurado;
public class AseguradoModelMapper {


    public static AseguradoDTO toDto(Asegurado asegurado){
        AseguradoDTO dto = new AseguradoDTO();

        dto.setCodigoAsegurado(asegurado.codigoAsegurado);
        dto.setRut(asegurado.rut);
        dto.setNombre(asegurado.nombre);
        dto.setApellido(asegurado.apellido);
        dto.setTelefono(asegurado.telefono);

        return dto;
    }
}
