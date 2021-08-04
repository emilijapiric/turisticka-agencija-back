package com.turisticka.agencija.repository;

import com.turisticka.agencija.entity.Korisnik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "korisnik", path="korisnik")
public interface KorisnikRepository extends JpaRepository<Korisnik,Integer> {
}
