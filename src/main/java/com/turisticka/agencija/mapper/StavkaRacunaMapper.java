package com.turisticka.agencija.mapper;

import com.turisticka.agencija.dto.StavkaRacunaDTO;
import com.turisticka.agencija.entity.StavkaRacuna;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface StavkaRacunaMapper {

    StavkaRacunaDTO toDTO(StavkaRacuna entity);

    StavkaRacuna toEntity(StavkaRacunaDTO dto);
}
