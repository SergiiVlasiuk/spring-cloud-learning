package com.vlasiuk.learning.reactivespringlearning.model;

@lombok.Data
public class CoinBaseResponse {

  private Data data;

  @lombok.Data
  public static class Data {
    private String base;
    private String currency;
    private String amount;

  }
}
