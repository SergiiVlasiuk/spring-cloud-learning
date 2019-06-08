package com.vlasiuk.learning.reactivespringlearning.service;

import com.vlasiuk.learning.reactivespringlearning.model.CoinBaseResponse;
import com.vlasiuk.learning.reactivespringlearning.model.Purchase;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CoinBaseService {

  Mono<CoinBaseResponse> getCryptoPrice(String priceName);

  Mono<Purchase> createPurchase(String priceName);

  Mono<Purchase> getPurchaseById(String id);

  Flux<Purchase> getAllPurchases();
}
