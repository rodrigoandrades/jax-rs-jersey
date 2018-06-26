package com.javaee.rodrigoandrades.services;

import java.util.List;

import com.javaee.rodrigoandrades.domain.Vehicle;

public interface VehicleService {
	List<Vehicle> getAll();
	Vehicle findById(Integer id);
	Vehicle saveVehicle(Vehicle vehicle);
	void deleteById(Integer id);
}