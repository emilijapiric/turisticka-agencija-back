package com.turisticka.agencija.repository;

import com.turisticka.agencija.entity.MestoIzdavanja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "mesto_izdavanja", path="mesto_izdavanja")
public interface MestoIzdavanjaRepository extends JpaRepository<MestoIzdavanja,Integer> {
}
