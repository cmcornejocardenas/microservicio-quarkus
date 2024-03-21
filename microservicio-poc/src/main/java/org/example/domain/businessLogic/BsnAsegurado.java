package org.example.domain.businessLogic;
 import jakarta.enterprise.context.ApplicationScoped;
 import jakarta.inject.Inject;
 import org.example.domain.dto.AseguradoDTO;
 import org.example.domain.modelMapper.AseguradoModelMapper;
 import org.example.domain.model.Asegurado;
 import org.example.domain.puertoEntrada.getAsegurado_PuertoEntrada;
 import org.example.domain.puertoSalida.GetAsegurado_PuertoSalida;

@ApplicationScoped
public class BsnAsegurado implements getAsegurado_PuertoEntrada{

    @Inject
    private GetAsegurado_PuertoSalida getAsegurado_PuertoSalida;

    //@Override
    public AseguradoDTO getPais(Long id) { //todo get persona
        //dentro de esta capa deberia ir la logica de este caso de uso relacionada al negocio.
        AseguradoDTO asegurado = new AseguradoDTO();
        Asegurado aseguradoResult = getAsegurado_PuertoSalida.getAsegurado_PuertoSalida(id);
        asegurado = AseguradoModelMapper.toDto(aseguradoResult);
        return pais;
    }
}
