package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.module.Vehicle;

public interface Vehiclerepo extends JpaRepository<Vehicle, Integer> 
{

 @Query(value="select * from Vehicle where color=?",nativeQuery=true)
	List<Vehicle> GetVehcleByColour(String color);

 
 @Query(value = "select * from vehicle where price>=?",nativeQuery = true)
 List<Vehicle> lessThanVehicle(double price);
 
 @Query(value = "select * from vehicle order by name",nativeQuery = true)
 List<Vehicle> sortByName ();
 
 @Query(value = "select * from vehicle order by color",nativeQuery = true)
 List<Vehicle> sortByColor ();
 
 @Query(value = "select * from Vehicle order by price,color;",nativeQuery = true)
 List<Vehicle> sortByPriceColor();
 
 

}
