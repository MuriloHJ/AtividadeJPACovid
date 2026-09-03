package com.br.Atividade_Covid.entity;

import lombok.*;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "continent", schema = "covid")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Continent
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "continent_id")
    private Short continent_id;


    @Column(name = "name", length =  40, nullable = false, unique = true)
    private String nome;

}
