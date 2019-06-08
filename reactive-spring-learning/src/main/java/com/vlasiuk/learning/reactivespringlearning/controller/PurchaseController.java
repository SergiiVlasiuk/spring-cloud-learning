package com.vlasiuk.learning.reactivespringlearning.controller;

import com.vlasiuk.learning.reactivespringlearning.model.Purchase;
import com.vlasiuk.learning.reactivespringlearning.service.CoinBaseService;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("coin/purchase/v1")
public class PurchaseController {

  @Autowired
  private CoinBaseService coinBaseService;

  @PostMapping(value = "{name}")
  public Mono<Purchase> createPurchase(@PathVariable String name) {
//    return Mono.fromSupplier(() -> new Purchase(name, "price", LocalDateTime.now()));
    return coinBaseService.createPurchase(name);
  }
}
