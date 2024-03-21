package org.example.domain.dto;

public class AseguradoDTO {
    public long codigoAsegurado;
    public String rut;
    public String nombre;
    public String apellido;
    public String telefono;

    public long getCodigoAsegurado() {
        return codigoAsegurado;
    }

    public void setCodigoAsegurado(long codigoAsegurado) {
        this.codigoAsegurado = codigoAsegurado;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
