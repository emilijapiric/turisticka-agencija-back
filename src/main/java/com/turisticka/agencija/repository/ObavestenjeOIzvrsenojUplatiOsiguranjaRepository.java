package com.turisticka.agencija.repository;

import com.turisticka.agencija.entity.ObavestenjeOIzvrsenojUplatiOsiguranja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "obavestenje_o_izvrsenoj_uplati_osiguranja", path="obavestenje_o_izvrsenoj_uplati_osiguranja")
public interface ObavestenjeOIzvrsenojUplatiOsiguranjaRepository extends JpaRepository<ObavestenjeOIzvrsenojUplatiOsiguranja,Integer> {
}
