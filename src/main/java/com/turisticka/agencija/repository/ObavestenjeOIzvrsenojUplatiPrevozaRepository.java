package com.turisticka.agencija.repository;

import com.turisticka.agencija.entity.ObavestenjeOIzvrsenojUplatiPrevoza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "obavestenje_o_izvrsenoj_uplati_prevoza", path="obavestenje_o_izvrsenoj_uplati_prevoza")
public interface ObavestenjeOIzvrsenojUplatiPrevozaRepository extends JpaRepository<ObavestenjeOIzvrsenojUplatiPrevoza,Integer> {
}
