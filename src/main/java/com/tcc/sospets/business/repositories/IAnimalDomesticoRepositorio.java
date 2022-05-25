package com.tcc.sospets.business.repositories;

import com.tcc.sospets.business.models.entities.AnimalDomestico;
import com.tcc.sospets.business.models.entities.CorAnimal;
import com.tcc.sospets.business.models.entities.Especie;
import com.tcc.sospets.business.models.entities.RacaCachorro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IAnimalDomesticoRepositorio extends JpaRepository<AnimalDomestico, String>{
    List<AnimalDomestico> findByPorteAndEspecieAndCorAnimalAndAcessorioAndCondicaoAnimalAndLocalizacaoAndGenero(
            String porte,
            Especie especie,
            CorAnimal corAnimal,
            String acessorio,
            String condicaoAnimal,
            String localizacao,
            String genero
    );


}

