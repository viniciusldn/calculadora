package com.trybe.acc.java.calculadora.service;

import com.trybe.acc.java.calculadora.domain.Calculadora;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

  /**
   * Calcular.
   *
   * @param x   the x
   * @param y   the y
   * @param opt the opt
   * @return the calculadora
   */
  public Calculadora calcular(String x, String y, String opt) {
    Double xx = Double.parseDouble(x);
    Double yy = Double.parseDouble(y);
    String lowOpt = opt.toLowerCase();
    switch (lowOpt) {
      case "adicao":
        return new Calculadora(xx + yy);
      case "subtracao":
        return new Calculadora(xx - yy);
      case "multiplicacao":
        return new Calculadora(xx * yy);
      case "divisao":
        return new Calculadora(xx / yy);
      default:
        return new Calculadora(0);
    }
  }

}
