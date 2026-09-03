package com.br.Atividade_Covid.dto;

import java.math.BigDecimal;

public record LocationProfileResponse(
        Long locationId,
        Long population,
        BigDecimal populationDensity,
        BigDecimal mediaAge
) {
}
