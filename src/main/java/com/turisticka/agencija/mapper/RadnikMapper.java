package com.turisticka.agencija.mapper;

import com.turisticka.agencija.dto.RadnikDTO;
import com.turisticka.agencija.entity.Radnik;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface RadnikMapper {

    RadnikDTO toDTO(Radnik entity);

    Radnik toEntity(RadnikDTO dto);
}
