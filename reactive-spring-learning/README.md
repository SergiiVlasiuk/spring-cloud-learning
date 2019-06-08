
##

#### PriceController:

    curl -X GET "http://localhost:8080/coin/price/v1/anyprice"

#### PurchaseController:

    curl -X POST "http://localhost:8080/coin/purchase/v1/eth-usd"

#### WebConfig:

    curl -X GET "http://localhost:8080/coin/purchase/v1/eth-usd"

    curl -X GET "http://localhost:8080/coin/price/v1/BTC-USD"
    
    {"data":{"base":"BTC","currency":"USD","amount":"6265.72"}}

    curl -X POST "http://localhost:8080/coin/purchase/v1/BTC-USD"


    https://developers.coinbase.com/api/v2



    curl -X GET "http://localhost:8080/coin/purchase/v1/
    []

    curl -X POST "http://localhost:8080/coin/purchase/v1/BTC-USD"
    {"name":"BTC-USD","price":"8035.50","createdAt":[2019,6,8,8,29,29,149000000],"id":"5cfb47b901f08a67e4a6e441"}

    curl -X GET "http://localhost:8080/coin/purchase/v1/
    [{"name":"BTC-USD","price":"8035.50","createdAt":[2019,6,8,8,29,29,149000000],"id":"5cfb47b901f08a67e4a6e441"}]

    curl -X GET "http://localhost:8080/coin/purchase/v1/5cfb47b901f08a67e4a6e441
    {"name":"BTC-USD","price":"8035.50","createdAt":[2019,6,8,8,29,29,149000000],"id":"5cfb47b901f08a67e4a6e441"}
    
    