package com.turisticka.agencija.repository;

import com.turisticka.agencija.entity.StavkaRacuna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "stavka_racuna", path="stavka_racuna")
public interface StavkaRacunaRepository extends JpaRepository<StavkaRacuna,Integer> {
}
