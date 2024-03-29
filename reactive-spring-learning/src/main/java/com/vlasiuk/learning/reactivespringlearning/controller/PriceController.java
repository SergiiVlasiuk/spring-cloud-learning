package com.vlasiuk.learning.reactivespringlearning.controller;

import com.vlasiuk.learning.reactivespringlearning.model.CoinBaseResponse;
import com.vlasiuk.learning.reactivespringlearning.service.CoinBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("coin/price/v1")
public class PriceController {

  @Autowired
  private CoinBaseService coinBaseService;

  @GetMapping(value = "{name}")
  public Mono<CoinBaseResponse> getPrice(@PathVariable String name) {
    return coinBaseService.getCryptoPrice(name);
  }
}
