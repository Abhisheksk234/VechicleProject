package com.example.demo.service;

import java.util.List;

import com.example.demo.module.Vehicle;

public interface Vehicleservice 
{

	public Vehicle addVehicle(Vehicle v);
	
	public Vehicle deleteVehicle(Integer id);

	public Vehicle getVehicleById(Integer id);
	
	public List<Vehicle> GetVehcleByColour(String color);
	
	public  Vehicle VehicleUpdate(Vehicle v);
	
	public List<Vehicle> lessThanVehicle(double price);
	
	public List<Vehicle>getAll();
	
	public List<Vehicle>sortByName();
	
	public List<Vehicle>sortByColor();

	public List<Vehicle>sortByPriceColor();
	
	
}
