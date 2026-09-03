package com.br.Atividade_Covid.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "location_type", schema = "covid")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class LocationType
{

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "location_type_code", length = 30)
    private String locationTypeCode;

    @Column(name = "description", nullable = false, length = 150)
    private String description;

    @OneToMany(mappedBy = "locationType")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Location> locations;
}


