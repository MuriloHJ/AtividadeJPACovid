package com.br.Atividade_Covid.entity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


@Entity
@Table(name = "excess_mortality_observation", schema = "covid")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ExcessMortalityObservation
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

    @Column(name = "excess_mortality_cumulative_absolute")
    private BigDecimal excessMortalityCumulativeAbsolute;

    @Column(name = "excess_mortality_cumulative")
    private BigDecimal excessMortalityCumulative;

    @Column(name = "excess_mortality")
    private BigDecimal excessMortality;

    @Column(name = "excess_mortality_cumulative_per_million")
    private BigDecimal excessMortalityCumulativePerMillion;
}


