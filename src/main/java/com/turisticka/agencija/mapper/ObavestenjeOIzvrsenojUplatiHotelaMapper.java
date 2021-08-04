package com.turisticka.agencija.mapper;

import com.turisticka.agencija.dto.ObavestenjeOIzvrsenojUplatiHotelaDTO;
import com.turisticka.agencija.entity.ObavestenjeOIzvrsenojUplatiHotela;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface ObavestenjeOIzvrsenojUplatiHotelaMapper {

    ObavestenjeOIzvrsenojUplatiHotelaDTO toDTO(ObavestenjeOIzvrsenojUplatiHotela entity);

    ObavestenjeOIzvrsenojUplatiHotela toEntity(ObavestenjeOIzvrsenojUplatiHotelaDTO dto);
}
