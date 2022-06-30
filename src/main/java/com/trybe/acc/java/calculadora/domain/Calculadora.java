package com.trybe.acc.java.calculadora.domain;

public class Calculadora {

  private double valor;

  /**
   * Instantiates a new calculadora.
   *
   * @param valor the valor
   */
  public Calculadora(double valor) {
    super();
    this.valor = valor;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

}
