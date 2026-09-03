package com.br.Atividade_Covid.entity;

import lombok.*;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "epidemiology_observation", schema = "covid")
public class EpidemiologyObservation {

    @EmbeddedId
    @EqualsAndHashCode.Include
    private ObservationId id;

    @MapsId("locationId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "location_id", referencedColumnName = "location_id"),
            @JoinColumn(name = "observation_date", referencedColumnName = "observation_date")
    })

    private ObeservationDay obeservationDay;

    @Column(name = "total_cases")
    private BigDecimal totalCases;

    @Column(name = "new_cases")
    private BigDecimal newCases;

    @Column(name = "new_cases_smoothed")
    private BigDecimal newCasesSmoothed;

    @Column(name = "total_deaths")
    private BigDecimal totalDeaths;

    @Column(name = "new_deaths")
    private BigDecimal newDeaths;

    @Column(name = "new_deaths_smoothed")
    private BigDecimal newDeathsSmoothed;

    @Column(name = "total_cases_per_million")
    private BigDecimal totalCasesPerMillion;

    @Column(name = "new_cases_per_million")
    private BigDecimal newCasesPerMillion;

    @Column(name = "total_deaths_per_million")
    private BigDecimal totalDeathsPerMillion;

    @Column(name = "new_deaths_per_million")
    private BigDecimal newDeathsPerMillion;

    @Column(name = "reproduction_rate")
    private BigDecimal reproductionRate;
}