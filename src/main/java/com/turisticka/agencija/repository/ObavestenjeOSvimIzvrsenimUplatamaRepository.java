package com.turisticka.agencija.repository;

import com.turisticka.agencija.entity.ObavestenjeOSvimIzvrsenimUplatama;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "obavestenje_o_svim_izvrsenim_uplatama", path="obavestenje_o_svim_izvrsenim_uplatama")
public interface ObavestenjeOSvimIzvrsenimUplatamaRepository extends JpaRepository<ObavestenjeOSvimIzvrsenimUplatama,Integer> {
}
