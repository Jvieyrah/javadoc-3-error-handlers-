package com.trybe.acc.java.excecaomaioridade;

/**
 * custom exception.
 *
 */
public class PessoaMenorDeIdadeException extends Exception {
  private static final long serialVersionUID = 1L;

  public PessoaMenorDeIdadeException() {
    super("Pessoa menor de 18 anos! Operação não permitida");
  }

}
