# microservice_spring
Para java utilizamos Spring Cloud Eureka Server
El concepto de Spring Cloud Eureka Server y sus capacidades de Discovery es una de las características principales de Spring Cloud a la hora de gestionar el registro y búsqueda de MicroServicios. Cuando tenemos varios MicroServicios es muy común querer invocar de unos a otros .
![Screenshot from 2023-06-29 12-33-50](https://github.com/LeandroTombe/microservice_spring/assets/57770761/8322162a-9ead-45b1-8836-5152c829f2f0)


En este ejemplo, lo que hacemos es tener un servidor central con eureka para poder gestionar los servicios que este caso tenemos 2. Uno que se encargar de escribir un "hola" a traves de la url "http://localhost:8082/hola" y otro servicio que recibe este mensaje y lo tranforma a mayuscula a traves del url http://localhost:8081/hola
