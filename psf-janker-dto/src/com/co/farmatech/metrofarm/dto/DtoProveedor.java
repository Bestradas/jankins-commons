package com.co.farmatech.metrofarm.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DtoProveedor {
    
    String Nit, Rut, Nombre, Representante, contacto, Direccion, Telefono, Celular, Fax, Cuenta, Banco, Correo;

    public String getNit() {
        return Nit;
    }
    @XmlElement
    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public String getRut() {
        return Rut;
    }
    @XmlElement
    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public String getNombre() {
        return Nombre;
    }
    @XmlElement
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRepresentante() {
        return Representante;
    }
    @XmlElement
    public void setRepresentante(String Representante) {
        this.Representante = Representante;
    }

    public String getContacto() {
        return contacto;
    }
    @XmlElement
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDireccion() {
        return Direccion;
    }
    @XmlElement
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }
    @XmlElement
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCelular() {
        return Celular;
    }
    @XmlElement
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getFax() {
        return Fax;
    }
    @XmlElement
    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    public String getCuenta() {
        return Cuenta;
    }
    @XmlElement
    public void setCuenta(String Cuenta) {
        this.Cuenta = Cuenta;
    }

    public String getBanco() {
        return Banco;
    }
    @XmlElement
    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    public String getCorreo() {
        return Correo;
    }
    @XmlElement
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

	@Override
	public String toString() {
		return "DtoProveedor [Nit=" + Nit + ", Rut=" + Rut + ", Nombre="
				+ Nombre +", Representante=" + Representante + ", contacto=" + contacto + ", Direccion="
				+ Direccion + ", Telefono=" + Telefono + ", Celular=" + Celular + ", Fax="
				+ Fax +", Cuenta=" + Cuenta + ", Banco=" + Banco + ", Correo="
				+ Correo + "]";
	}
    
}
