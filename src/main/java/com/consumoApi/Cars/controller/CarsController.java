package com.consumoApi.Cars.controller;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import com.consumoApi.Cars.model.Cars;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class CarsController {
	
	//private static final String GET_ALL_USERS_API = "http://api-test.bhut.com.br:3000/api/cars";
	//private static final String CREATE_USER_API = "http://api-test.bhut.com.br:3000/api/cars";
	private static Logger logger = LoggerFactory.getLogger(CarsController.class);
	
	RestTemplate template = new RestTemplate();
	
	String url = "http://api-test.bhut.com.br:3000/api/cars";	
	
	String log = "http://localhost:8080/api/createCar";
	
	                                 //metodo GET, retorna valores em "http://localhost:8080/api/listCars" 
	@GetMapping(value = "/listCars")
	public List<Object> getCars(){		
		Object[] listCars = template.getForObject(url, Object[].class);
		
		return Arrays.asList(listCars);
	}
	

                                       //metodo POST, cria um carro em "	"
	@PostMapping(value = "/createCar")
	public ResponseEntity<Cars> createCar(@RequestBody Cars cars){
		cars.set_id(UUID.randomUUID().toString().replace("-", "").substring(0,24));
		ResponseEntity<Cars> createCars = template.postForEntity(url, cars, Cars.class);		
		
		return createCars;
	}
	
		/*@GetMapping(value = "/logs")
		public List<Object> logCar(Cars cars){
			cars.get_id();
			Object[] logsCar = template.getForObject(log, Object[].class);
			return Arrays.asList(logsCar);
		}*/

}
