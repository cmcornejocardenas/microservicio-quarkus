package org.example.infraestructure.repository;

import org.example.infraestructure.entities.AseguradoEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class AseguradoRepository implements PanacheRepository<AseguradoEntity>{
    public AseguradoRepository(){}
}
