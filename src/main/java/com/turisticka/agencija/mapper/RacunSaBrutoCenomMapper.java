package com.turisticka.agencija.mapper;

import com.turisticka.agencija.dto.RacunSaBrutoCenomDTO;
import com.turisticka.agencija.entity.RacunSaBrutoCenom;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {
        NacinPlacanjaMapper.class,
        MestoIzdavanjaMapper.class,
        StavkaRacunaMapper.class,
        RadnikMapper.class}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface RacunSaBrutoCenomMapper {

    RacunSaBrutoCenomDTO toDTO(RacunSaBrutoCenom entity);

    RacunSaBrutoCenom toEntity(RacunSaBrutoCenomDTO dto);
}
