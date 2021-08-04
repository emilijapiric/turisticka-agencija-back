package com.turisticka.agencija.repository;

import com.turisticka.agencija.entity.NacinPlacanja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "nacin_placanja", path="nacin_placanja")
public interface NacinPlacanjaRepository extends JpaRepository<NacinPlacanja,Integer> {
}
