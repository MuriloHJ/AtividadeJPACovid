package com.br.Atividade_Covid.mapper;

import com.br.Atividade_Covid.dto.LocationResponse;
import com.br.Atividade_Covid.entity.Location;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LocationMapper
{
    public LocationResponse toResponse(Location location)
    {
        return new LocationResponse(
                location.getLocationId(),
                location.getIsoCode(),
                location.getName(),
                location.getContinent(),
                location.getLocationType(),
                location.getProfile()
        );
    }

    public List<LocationResponse> toResponseList(List<Location> locations)
    {
        return locations.stream()
                .map(this::toResponse)
                .toList();
    }
}
