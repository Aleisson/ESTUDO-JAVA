package com.cars.api_web.dto;

public record CarDTO(
    String modelo,
    String fabricante,
    String dataFabricacao,
    Double valor,
    int ano
    ) {
}
