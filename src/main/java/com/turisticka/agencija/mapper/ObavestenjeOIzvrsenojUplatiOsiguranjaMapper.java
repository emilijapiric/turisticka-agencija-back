package com.turisticka.agencija.mapper;

import com.turisticka.agencija.dto.ObavestenjeOIzvrsenojUplatiOsiguranjaDTO;
import com.turisticka.agencija.entity.ObavestenjeOIzvrsenojUplatiOsiguranja;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface ObavestenjeOIzvrsenojUplatiOsiguranjaMapper {

    ObavestenjeOIzvrsenojUplatiOsiguranjaDTO toDTO(ObavestenjeOIzvrsenojUplatiOsiguranja entity);

    ObavestenjeOIzvrsenojUplatiOsiguranja toEntity(ObavestenjeOIzvrsenojUplatiOsiguranjaDTO dto);

}
