package com.turisticka.agencija.repository;

import com.turisticka.agencija.entity.Radnik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "radnik", path="radnik")
public interface RadnikRepository extends JpaRepository<Radnik,Integer> {
}
