package com.br.Atividade_Covid.dto;

import com.br.Atividade_Covid.entity.Continent;
import com.br.Atividade_Covid.entity.LocationProfile;
import com.br.Atividade_Covid.entity.LocationType;

public record LocationResponse(
    Long locationId,
    String isoCode,
    String name,
    Continent continent,
    LocationType locationType,
    LocationProfile locationProfile
) {
}
