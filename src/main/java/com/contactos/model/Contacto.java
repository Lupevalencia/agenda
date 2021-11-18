package com.contactos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "contacto")
//@NamedQuery(name="Contactos.findAll", query = "SELECT c FROM Contactos c \n ")
public class Contacto /*implements Serializable */{
    //private static final long serialVersionUID = 1L;


    private String nombre;
    private String email;
    private int edad;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContacto;

    public Contacto() {
    }

    public Contacto(String nombre, String email, int edad) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
    }

    //public static long getSerialVersionUID() {
      //  return serialVersionUID;
    //}

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdContacto() {
        return this.idContacto;
    }

    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

    @Override
    public String toString() {
        return "Contactos{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", edad=" + edad +
                ", idContacto=" + idContacto +
                '}';
    }
}
