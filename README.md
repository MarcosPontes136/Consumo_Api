<h2><center>Metodo GET retorna lista de carros:</center></h2>
<p><br>
Na pasta ConsumirApi usando um CMD iniciar Spring com:
</p><br>

```shell script
mvn spring-boot:run 
```
<p>Ou</p>

```shell script
Direto na IDEA dar um start no ConsumirApiCarsApplication.java.
```
<br><p>Após iniciar a aplicação, retornar em seu navegador:</p>

```shell script
http://localhost:8080/api/listCars
```
<br><h2><center>Metodo POST cria um carro:</center></h2><br>
<p>Nesse caso precisamos usar o Postman para criar um registro na API externa Acesse:</p>

https://www.postman.com

<br><p>Precisamos também usar no postman esse enredeço:</p>
```shell script
http://localhost:8080/api/createCar
```
<p>Usando o Body/raw com o tipo JSON, dentro do Body usando a seguinte aquisição:</p>

```shell script
{
  "title": "string",
  "brand": "string",
  "price": "0",
  "age": 0
}
```