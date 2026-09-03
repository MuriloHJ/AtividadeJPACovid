package com.br.Atividade_Covid.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "location")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Location
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "location_id")
    private Long locationId;

    @Column(name = "iso_code", nullable = false, length = 12)
    private String isoCode;

    @Column(name = "name", nullable = false, length = 120)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "continent_id")
    @ToString.Exclude
    private Continent continent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_type_code", nullable = false)
    @ToString.Exclude
    private LocationType locationType;

    @OneToOne(
            mappedBy = "location",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @ToString.Exclude
    private LocationProfile profile;

    @OneToMany(mappedBy = "location")
    @ToString.Exclude
    private List<ObservationDay> observationDays;

    @OneToMany(mappedBy = "location")
    @ToString.Exclude
    private List<EpidemiologyObservation> epidemiologyObservations;

    @OneToMany(mappedBy = "location")
    @ToString.Exclude
    private List<HospitalizationObservation> hospitalizationObservations;

    @OneToMany(mappedBy = "location")
    @ToString.Exclude
    private List<TestingObservation> testingObservations;

    @OneToMany(mappedBy = "location")
    @ToString.Exclude
    private List<VaccinationObservation> vaccinationObservations;

    @OneToMany(mappedBy = "location")
    @ToString.Exclude
    private List<PolicyObservation> policyObservations;

    @OneToMany(mappedBy = "location")
    @ToString.Exclude
    private List<ExcessMortalityObservation> excessMortalityObservations;
}
