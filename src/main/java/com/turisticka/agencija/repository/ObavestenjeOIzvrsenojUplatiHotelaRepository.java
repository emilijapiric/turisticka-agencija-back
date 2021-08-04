package com.turisticka.agencija.repository;

import com.turisticka.agencija.entity.ObavestenjeOIzvrsenojUplatiHotela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "obavestenje_o_izvrsenoj_uplati_hotela", path="obavestenje_o_izvrsenoj_uplati_hotela")
public interface ObavestenjeOIzvrsenojUplatiHotelaRepository extends JpaRepository<ObavestenjeOIzvrsenojUplatiHotela,Integer> {
}
