package com.turisticka.agencija.mapper;

import com.turisticka.agencija.dto.KorisnikDTO;
import com.turisticka.agencija.entity.Korisnik;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KorisnikMapper {

    KorisnikDTO toDTO(Korisnik entity);

    Korisnik toEntity(KorisnikDTO dto);
}
