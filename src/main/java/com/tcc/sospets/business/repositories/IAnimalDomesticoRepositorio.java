package com.tcc.sospets.business.repositories;

import com.tcc.sospets.business.models.entities.AnimalDomestico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAnimalDomesticoRepositorio extends JpaRepository<AnimalDomestico, String>{
}
