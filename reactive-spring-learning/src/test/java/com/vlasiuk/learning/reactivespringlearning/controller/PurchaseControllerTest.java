package com.vlasiuk.learning.reactivespringlearning.controller;

import com.vlasiuk.learning.reactivespringlearning.model.Purchase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.reactive.server.WebTestClient.BodySpec;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class PurchaseControllerTest {

  @Autowired
  ApplicationContext context;

  private WebTestClient webTestClient;

  @Before
  public void setUp() throws Exception {
    webTestClient = WebTestClient.bindToApplicationContext(context)
        .build();
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void createPurchase() {
    BodySpec<Purchase, ?> purchaseBodySpec = webTestClient.get()
        .uri("/coin/purchase/v1/{id}", 123)
        .exchange()
        .expectStatus().isOk()
        .expectBody(Purchase.class);
  }
}