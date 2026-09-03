package com.br.Atividade_Covid.entity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "hospitalization_observation", schema = "covid")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class HospitalizationObservation
{
    @EmbeddedId
    @EqualsAndHashCode.Include
    private ObservationId id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId
    @JoinColumns({
            @JoinColumn(name = "location_id", referencedColumnName = "location_id"),
            @JoinColumn(name = "observation_date", referencedColumnName = "observation_date")
    })
    private ObservationDay observationDay;


    @Column(name = "icu_patients")
    private BigDecimal icuPatients;

    @Column(name = "icu_patients_per_million")
    private BigDecimal icuPatientsPerMillion;

    @Column(name = "hosp_patients")
    private BigDecimal hospPatients;

    @Column(name = "hosp_patients_per_million")
    private BigDecimal hospPatientsPerMillion;

    @Column(name = "weekly_icu_admissions")
    private BigDecimal weeklyIcuAdmissions;

    @Column(name = "weekly_icu_admissions_per_million")
    private BigDecimal weeklyIcuAdmissionsPerMillion;

    @Column(name = "weekly_hosp_admissions")
    private BigDecimal weeklyHospAdmissions;

    @Column(name = "weekly_hosp_admissions_per_million")
    private BigDecimal weeklyHospAdmissionsPerMillion;
}
