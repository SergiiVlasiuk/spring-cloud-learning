package com.vlasiuk.learning.reactivespringlearning.controller;

import com.vlasiuk.learning.reactivespringlearning.model.Purchase;
import com.vlasiuk.learning.reactivespringlearning.service.CoinBaseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PurchaseHandler {

  @Autowired
  private CoinBaseService coinBaseService;

  public Mono<ServerResponse> listPurchases(ServerRequest serverRequest) {
    final Mono<Purchase> purchase =
        coinBaseService.getPurchaseById(serverRequest.pathVariable("id"));
//        Mono.fromSupplier(() -> new Purchase("from functional endpoint", "123",
//            LocalDateTime.now()));
    return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
        .body(purchase, Purchase.class);
  }

  public Mono<ServerResponse> listAllPurchases(ServerRequest serverRequest) {
    final Flux<Purchase> purchaseFlux = coinBaseService.getAllPurchases();
    return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
        .body(purchaseFlux.collectList(), new ParameterizedTypeReference<List<Purchase>>() {
        });
  }
}
