package com.tienda;

public class CostoEnvio {

    private static final double LIMITE_ENVIO_GRATIS = 1000;
    private static final double LIMITE_ENVIO_REDUCIDO = 500;

    private static final double COSTO_ENVIO_NORMAL = 100;
    private static final double COSTO_ENVIO_REDUCIDO = 50;
    private static final double COSTO_ENVIO_GRATIS = 0;

    public static double calcular(double importePedido) {
        return calcular(importePedido, false);
    }

    public static double calcular(double importePedido, boolean clientePremium) {
        if (clientePremium) {
            return COSTO_ENVIO_GRATIS;
        }

        if (importePedido < LIMITE_ENVIO_REDUCIDO) {
            return COSTO_ENVIO_NORMAL;
        } else if (importePedido < LIMITE_ENVIO_GRATIS) {
            return COSTO_ENVIO_REDUCIDO;
        } else {
            return COSTO_ENVIO_GRATIS;
        }
    }
}