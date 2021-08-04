package com.turisticka.agencija.mapper;

import com.turisticka.agencija.dto.NacinPlacanjaDTO;
import com.turisticka.agencija.entity.NacinPlacanja;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface NacinPlacanjaMapper {

    NacinPlacanjaDTO toDTO(NacinPlacanja entity);

    NacinPlacanja toEntity(NacinPlacanjaDTO dto);
}
