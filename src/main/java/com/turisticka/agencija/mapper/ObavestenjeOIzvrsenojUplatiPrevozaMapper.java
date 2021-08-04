package com.turisticka.agencija.mapper;

import com.turisticka.agencija.dto.ObavestenjeOIzvrsenojUplatiPrevozaDTO;
import com.turisticka.agencija.entity.ObavestenjeOIzvrsenojUplatiPrevoza;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface ObavestenjeOIzvrsenojUplatiPrevozaMapper {

    ObavestenjeOIzvrsenojUplatiPrevozaDTO toDTO(ObavestenjeOIzvrsenojUplatiPrevoza entity);

    ObavestenjeOIzvrsenojUplatiPrevoza toEntity(ObavestenjeOIzvrsenojUplatiPrevozaDTO dto);
}
