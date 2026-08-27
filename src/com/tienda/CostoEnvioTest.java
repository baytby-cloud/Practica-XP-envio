package com.tienda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CostoEnvioTest {

    @Test
    void pedidoMenorA500Paga100() {
        assertEquals(100, CostoEnvio.calcular(400));
    }

    @Test
    void pedidoDe500Paga50() {
        assertEquals(50, CostoEnvio.calcular(500));
    }

    @Test
    void pedidoDe999_99Paga50() {
        assertEquals(50, CostoEnvio.calcular(999.99));
    }

    @Test
    void pedidoDe1000EsGratis() {
        assertEquals(0, CostoEnvio.calcular(1000));
    }
}