package com.contactos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.contactos.model.Contacto;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface AgendaJpaSpring extends JpaRepository<Contacto, Integer> {
    Contacto findByEmail(String email); //Para buscar el contacto por el email
    @Transactional //CONTEXTO TRANSACCIONAL PARA JPQL
    @Modifying ///PARA ACCIONES
    @Query("Delete from Contacto c Where c.email=?1") //instruccion JPQL
    void eliminarPorEmail(String email);

}
