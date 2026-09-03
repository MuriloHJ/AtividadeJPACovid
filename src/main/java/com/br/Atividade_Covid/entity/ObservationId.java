package com.br.Atividade_Covid.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Embeddable
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ObservationId implements Serializable
{
    @Column(name = "id")
    private Long locationId;

    @Column(name = "observation_date")
    private LocalDate observationDate;

}
