package com.tienda;

public class CostoEnvio {

    public static double calcular(double importePedido) {
        if (importePedido < 500) {
            return 100;
        } else if (importePedido < 1000) {
            return 50;
        } else {
            return 0;
        }
    }
}