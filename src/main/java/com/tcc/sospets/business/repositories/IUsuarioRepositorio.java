package com.tcc.sospets.business.repositories;


import com.tcc.sospets.business.models.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IUsuarioRepositorio extends JpaRepository<Usuario, String> {


}
