package com.br.Atividade_Covid.repository;


import com.br.Atividade_Covid.entity.Location;
import com.br.Atividade_Covid.entity.LocationProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LocationRepository extends JpaRepository<Location,Long>
{
    Optional<Location> findByIsoCode(String isoCode);

}
