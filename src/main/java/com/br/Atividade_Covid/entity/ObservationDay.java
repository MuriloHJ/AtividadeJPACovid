package com.br.Atividade_Covid.entity;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "observation_day", schema = "covid")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ObservationDay
{
    @EmbeddedId
    @EqualsAndHashCode.Include
    private ObservationId id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("locationId")
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;
}
