package com.turisticka.agencija.repository;

import com.turisticka.agencija.entity.RacunSaBrutoCenom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "racun", path="racun")
public interface RacunSaBrutoCenomRepository extends JpaRepository<RacunSaBrutoCenom,Integer> {
}
