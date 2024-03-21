package org.example.infraestructure.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ASEGURADO", schema = "PERSONAS")
public class AseguradoEntity {

    @Id
    @Column(name="CODIGO_ASEGURADO")
    public long codigoAsegurado;
    @Column(name="RUT")
    public String rut;
    @Column(name="NOMBRE")
    public String nombre;
    @Column(name="APELLIDO")
    public String apellido;
    @Column(name="TELEFONO")
    public String telefono;

    public AseguradoEntity(){

    }

    public AseguradoEntity(long codigoAsegurado, String rut, String nombre, String apellido, String telefono) {
        this.codigoAsegurado = codigoAsegurado;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
}
