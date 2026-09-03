package com.br.Atividade_Covid.service;

import com.br.Atividade_Covid.dto.LocationProfileResponse;
import com.br.Atividade_Covid.dto.LocationResponse;
import com.br.Atividade_Covid.entity.Location;
import com.br.Atividade_Covid.mapper.LocationMapper;
import com.br.Atividade_Covid.repository.LocationProfileRepository;
import com.br.Atividade_Covid.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService
{
    private LocationRepository locationRepository;
    private LocationProfileRepository locationProfileRepository;
    private LocationMapper locationMapper;

    public List<LocationResponse> listarLocations()
    {
        List<Location> locations = locationRepository.findAll();

        return locationMapper.toResponseList(locations);
    }

    public LocationResponse buscarPorCodigo(String isoCode)
    {
        return locationRepository.findByIsoCode(isoCode)
                .map(locationMapper :: toResponse)
                .orElseThrow(() ->
                        new RuntimeException("Location não encotrada com isoCode: " + isoCode));
    }

    public LocationProfileResponse buscarLocationProfilePorCodigo(String isoCode)
    {
        return locationProfileRepository.findByIsoCode(isoCode)
                .map( :: toResponse)
                .orElseThrow(() ->
                        new RuntimeException("Location não encotrada com isoCode: " + isoCode));
    }
}
