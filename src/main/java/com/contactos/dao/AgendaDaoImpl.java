package com.contactos.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.contactos.model.Contacto;

import java.util.List;

@Repository //Para las clases de acceso a datos. Y para la capa de controladores @RestController
public class AgendaDaoImpl implements  AgendaDao{

    @Autowired
    AgendaJpaSpring agenda;


    @Override
    public void agregarContacto(Contacto contacto) {
        agenda.save(contacto);
    }

    @Override
    public Contacto recuperarContacto(String email) {
        return agenda.findByEmail(email);
    }

    @Override
    public void eliminarContacto(String email) {
        agenda.eliminarPorEmail(email);
    }

    @Override
    public List<Contacto> devolverContactos() {
        return agenda.findAll();
    }

    @Override
    public void eliminarContacto(int idContacto) {
        agenda.deleteById(idContacto);

    }

    @Override
    public Contacto recuperarContacto(int idContacto) {
        return agenda.findById(idContacto).orElse(null);
    } //En el caso de que el objeto no sea identificado

    @Override
    public void actualizarContacto(Contacto contacto) {
        agenda.save(contacto);

    }

}
