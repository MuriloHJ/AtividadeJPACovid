package com.br.Atividade_Covid.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "test_unit", schema = "covid")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class TestUnit
{
    @Id
    @EqualsAndHashCode.Include
    @Column(name = "test_unit_code", length = 30)
    private String testUnitCode;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @OneToMany(mappedBy = "testUnit")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<TestingObservation> testingObservations;
}