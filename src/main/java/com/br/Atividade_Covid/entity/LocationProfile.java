package com.br.Atividade_Covid.entity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "location_profile", schema = "covid")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class LocationProfile
{
    @Id
    @Column(name = "location_id")
    @EqualsAndHashCode.Include
    private Long locationId;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId
    @JoinColumn(name = "location_id")
    private Location location;

    @Column(name = "population", nullable = false)
    private Long population;

    @Column(name = "population_density")
    private BigDecimal populationDensity;

    @Column(name = "median_age")
    private BigDecimal medianAge;

    @Column(name = "aged_65_older")
    private BigDecimal aged65Older;

    @Column(name = "aged_70_older")
    private BigDecimal aged70Older;

    @Column(name = "gdp_per_capita")
    private BigDecimal gdpPerCapita;

    @Column(name = "extreme_poverty")
    private BigDecimal extremePoverty;

    @Column(name = "cardiovasc_death_rate")
    private BigDecimal cardiovascDeathRate;

    @Column(name = "diabetes_prevalence")
    private BigDecimal diabetesPrevalence;

    @Column(name = "female_smokers")
    private BigDecimal femaleSmokers;

    @Column(name = "male_smokers")
    private BigDecimal maleSmokers;

    @Column(name = "handwashing_facilities")
    private BigDecimal handwashingFacilities;

    @Column(name = "hospital_beds_per_thousand")
    private BigDecimal hospitalBedsPerThousand;

    @Column(name = "life_expectancy")
    private BigDecimal lifeExpectancy;

    @Column(name = "human_development_index")
    private BigDecimal humanDevelopmentIndex;
}
