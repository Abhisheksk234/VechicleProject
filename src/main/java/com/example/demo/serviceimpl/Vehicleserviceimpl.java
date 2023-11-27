package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ResourceException.ResourceException;
import com.example.demo.module.Vehicle;
import com.example.demo.repo.Vehiclerepo;
import com.example.demo.service.Vehicleservice;

@Service
public class Vehicleserviceimpl implements Vehicleservice{

	@Autowired
	Vehiclerepo repo;


	@Override
	public Vehicle addVehicle(Vehicle v) {
		return repo.save(v);
	}


	@Override
	public Vehicle deleteVehicle(Integer id) {
		Vehicle v=repo.findById(id).orElse(null);
		if(v !=null)
		{
			repo.deleteById(id); 
			return v;
		}else {

			throw new ResourceException("Vehicle","id",id);
		}

	}

	@Override
	public Vehicle getVehicleById(Integer id) {
		return 	repo.findById(id).orElseThrow(()->new ResourceException("Vehicle", "id", id));
	}


	@Override
	public List<Vehicle> GetVehcleByColour(String color) {
		return  repo.GetVehcleByColour(color);
	}


	@Override
	public Vehicle VehicleUpdate(Vehicle v) {
		Vehicle v1= repo.findById(v.getId()).orElse(null);
		if(v1!=null) {
			v1.setName(v.getName());
			v1.setColor(v.getColor());
			v1.setModel(v.getModel());
			v1.setPrice(v.getPrice());
			return repo.save(v1);
		}else {
			throw new ResourceException("Vehicle", "id", v.getId());
		}
	}


	@Override
	public List<Vehicle> lessThanVehicle(double price) {
		return repo.lessThanVehicle(price);
	}


	@Override
	public List<Vehicle> getAll() {
		return repo.findAll();
	}


	@Override
	public List<Vehicle> sortByName() {
       return repo.sortByName();
	}


	@Override
	public List<Vehicle> sortByColor() {
		return repo.sortByColor();
	}


	@Override
	public List<Vehicle> sortByPriceColor() {
		return repo.sortByPriceColor();
	}


	
}
