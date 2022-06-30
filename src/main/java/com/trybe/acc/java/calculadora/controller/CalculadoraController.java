package com.trybe.acc.java.calculadora.controller;

import com.trybe.acc.java.calculadora.domain.Calculadora;
import com.trybe.acc.java.calculadora.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

  @Autowired
  CalculadoraService service;

  /**
   * Calculadora.
   *
   * @param x   the x
   * @param y   the y
   * @param opt the opt
   * @return the calculadora
   */
  @GetMapping
  public Calculadora calculadora(@RequestParam("primeiroValor") String x,
      @RequestParam("segundoValor") String y,
      @RequestParam("operacao") String opt) {
    if (opt.equalsIgnoreCase("divisao") & y.equals("0")) {
      return new Calculadora(0);
    }
    return service.calcular(x, y, opt);
  }

}
