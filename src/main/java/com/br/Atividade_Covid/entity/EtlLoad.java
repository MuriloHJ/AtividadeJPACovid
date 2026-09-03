package com.br.Atividade_Covid.entity;


import lombok.*;
import jakarta.persistence.*;
import org.hibernate.annotations.GenerationTime;

import java.time.OffsetDateTime;

@Entity
@Table(name = "etl_load", schema = "covid")
@Data
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EtlLoad
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "load_id")
    @EqualsAndHashCode.Include
    private Long loadId;

    @Column(name = "source_filename", nullable = false, length = 255)
    private String sourceFilename;

    @Column(name = "raw_row_count", nullable = false)
    private Long rawRowCount;

    @Column(name = "normalized_day_count", nullable = false)
    private Long normalizedDayCount;

    @Column(name = "complementary_duplicate_count", nullable = false)
    private Long complementaryDuplicateCount;

    @Column(name = "loaded_at", nullable = false, insertable = false, updatable = false)
    private OffsetDateTime loadedAt;
}