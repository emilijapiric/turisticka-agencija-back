package com.turisticka.agencija.mapper;

import com.turisticka.agencija.dto.ObavestenjeOSvimIzvrsenimUplatamaDTO;
import com.turisticka.agencija.entity.ObavestenjeOSvimIzvrsenimUplatama;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {
        ObavestenjeOIzvrsenojUplatiPrevozaMapper.class,
        ObavestenjeOIzvrsenojUplatiHotelaMapper.class,
        ObavestenjeOIzvrsenojUplatiOsiguranjaMapper.class,
        RadnikMapper.class,
        KorisnikMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ObavestenjeOSvimIzvrsenimUplatamaMapper {

    ObavestenjeOSvimIzvrsenimUplatamaDTO toDTO(ObavestenjeOSvimIzvrsenimUplatama entity);

    ObavestenjeOSvimIzvrsenimUplatama toEntity(ObavestenjeOSvimIzvrsenimUplatamaDTO dto);
}
