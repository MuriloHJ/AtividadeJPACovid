package com.br.Atividade_Covid.repository;

import com.br.Atividade_Covid.entity.Location;
import com.br.Atividade_Covid.entity.LocationProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LocationProfileRepository extends JpaRepository<Location, Long>
{
    Optional<LocationProfile> findByIsoCode(String isoCode);
}
