package com.turisticka.agencija.mapper;

import com.turisticka.agencija.dto.MestoIzdavanjaDTO;
import com.turisticka.agencija.entity.MestoIzdavanja;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface MestoIzdavanjaMapper {

    MestoIzdavanjaDTO toDTO(MestoIzdavanja entity);

    MestoIzdavanja toEntity(MestoIzdavanjaDTO dto);
}
