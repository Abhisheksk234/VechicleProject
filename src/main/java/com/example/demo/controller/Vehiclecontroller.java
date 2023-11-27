package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.module.Vehicle;
import com.example.demo.service.Vehicleservice;

@RestController
public class Vehiclecontroller {

	@Autowired
	Vehicleservice ser;

	// apis //localhost:8080/addVehicle
	@PostMapping("addVehicle")
	ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle v) {
		return new ResponseEntity<Vehicle>(ser.addVehicle(v), HttpStatus.CREATED);
	}

	// apis //localhost:8080/deleteVehicle
	@DeleteMapping("deleteVehicle")
	ResponseEntity<Vehicle> deleteVehicle(@RequestParam Integer id) {
		return new ResponseEntity<Vehicle>(ser.deleteVehicle(id), HttpStatus.OK);
	}

	// apis //localhost:8080/getVehicleById
	@GetMapping("getVehicleById")
	ResponseEntity<Vehicle> getVehicleById(@RequestHeader Integer id) {
		return new ResponseEntity<Vehicle>(ser.getVehicleById(id), HttpStatus.FOUND);
	}

	// localhost:8080/getVehcleByColour
	@GetMapping("getVehcleByColour")
	ResponseEntity<List<Vehicle>> getVehcleByColour(@RequestHeader String color) {
		return new ResponseEntity<List<Vehicle>>(ser.GetVehcleByColour(color), HttpStatus.FOUND);
	}

	// apis //localhost:8080/VehicleUpdate
	@PutMapping("VehicleUpdate")
	ResponseEntity<Vehicle> VehicleUpdate(@RequestBody Vehicle v) {
		return new ResponseEntity<Vehicle>(ser.VehicleUpdate(v), HttpStatus.OK);
	}

	// apis //localhost:8080/lessThanVehicle
	@GetMapping("lessThanVehicle")
	ResponseEntity<List<Vehicle>> lessThanVehicle(@RequestHeader double price) {
		return new ResponseEntity<List<Vehicle>>(ser.lessThanVehicle(price), HttpStatus.FOUND);
	}

	// apis //localhost:8080/getAll
	@GetMapping("getAll")
	ResponseEntity<List<Vehicle>> getAll() {
		return new ResponseEntity<List<Vehicle>>(ser.getAll(), HttpStatus.FOUND);
	}

	// apis //localhost:8080/sortByName
	@GetMapping("sortByName")
	ResponseEntity<List<Vehicle>> sortByName() {
		return new ResponseEntity<List<Vehicle>>(ser.sortByName(), HttpStatus.FOUND);
	}

	// apis //localhost:8080/sortByColor
	@GetMapping("sortByColor")
	ResponseEntity<List<Vehicle>> sortByColor() {
		return new ResponseEntity<List<Vehicle>>(ser.sortByColor(), HttpStatus.FOUND);
	}
	// apis //localhost:8080/sortByPriceColor
		@GetMapping("/sortByPriceColor")
		ResponseEntity<List<Vehicle>> sortByPriceColor() {
			return new ResponseEntity<List<Vehicle>>(ser.sortByPriceColor(), HttpStatus.FOUND);
		}

}
