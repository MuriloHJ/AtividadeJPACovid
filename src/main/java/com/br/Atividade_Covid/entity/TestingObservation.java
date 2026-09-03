package com.br.Atividade_Covid.entity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "testing_observation", schema = "covid")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class TestingObservation
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

    @Column(name = "total_tests")
    private BigDecimal totalTests;

    @Column(name = "new_tests")
    private BigDecimal newTests;

    @Column(name = "total_tests_per_thousand")
    private BigDecimal totalTestsPerThousand;

    @Column(name = "new_tests_per_thousand")
    private BigDecimal newTestsPerThousand;

    @Column(name = "new_tests_smoothed")
    private BigDecimal newTestsSmoothed;

    @Column(name = "new_tests_smoothed_per_thousand")
    private BigDecimal newTestsSmoothedPerThousand;

    @Column(name = "positive_rate")
    private BigDecimal positiveRate;

    @Column(name = "tests_per_case")
    private BigDecimal testsPerCase;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "test_unit_code")
    private TestUnit testUnit;
}
