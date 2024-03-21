package org.example.application.rest;

import jakarta.inject.Inject;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.example.application.controller.AseguradoController;
import org.example.application.viewmodel.Wrapper;
import org.example.domain.dto.AseguradoDTO;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;



@Path("/api/template-base/pais")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional(Transactional.TxType.SUPPORTS)
public class AseguradoRest {

    @Inject
    AseguradoController aseguradoController;

    @GET
    @Path("/{id}")
    @Retry(maxRetries = 3, delay = 3000)
    @Fallback(fallbackMethod = "fallbackAseguradoNoEncontrado")
    public Response getAsegurado(@PathParam("id") Long id) {
        AseguradoDTO asegurado = new AseguradoDTO();
        AseguradoDTO aseguradoNull = new AseguradoDTO();
        Wrapper response = new Wrapper();
        asegurado = aseguradoController.getAsegurado(id);

        if (asegurado == null) {
            response.setData(aseguradoNull);
            response.setHttpCode(404);
            response.setDescripcion("no se encontro pais");
            return Response.status(404).entity(response).build();
        }
        response.setHttpCode(200);
        response.setDescripcion("consulta realizada correctamente");
        response.setData(asegurado);
        return Response.status(200).entity(response).build();
    }
    public Response fallbackAesuradoNoEncontrado(Long id) {
        return Response.status(503).build();
    }

}
