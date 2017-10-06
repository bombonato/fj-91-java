Para testar no navegador use:

http://localhost:8080/webservices-rest/pedido/1


Para atualizar o endereco do pedido enviamos um PUT:

curl -i -H "Content-type: application/xml" -X PUT -d '<endereco><id>2</id><rua>Rua do Ouvidor 22</rua><numero>1</numero><cidade>Brasil</cidade><estado>RJ</estado></endereco>' http://localhost:8080/webservices-rest/pedido/1/enviar


Para pagar o pedido enviamos um POST com query string:

curl -i -H "Content-type: text/plain" -X POST http://localhost:8080/webservices-rest/pedido/1/pagar?numeroCartao=1234



Para cancelar o pedido um POST com query string:

curl -i -H "Content-type: text/plain" -X POST http://localhost:8080/webservices-rest/pedido/1/cancelar?observacao=negado


