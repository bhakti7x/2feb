package com.vehicledekho.vehiclemanagement;

import java.util.ArrayList;
import java.util.List;

import com.vehicledekho.vehiclemanagement.data.Bikes;
import com.vehicledekho.vehiclemanagement.data.Cars;
import com.vehicledekho.vehiclemanagement.data.VehicleInformation;
import com.vehicledekho.vehiclemanagement.data.Vehicle;


public class VehicleDekhoMain {
	
	public static void main(String[] args) {
		
		Cars car = new Cars();
		car.setVehicleName("Urus");
		car.setVehicleCompany("Lamborghini");
		car.setVehicleType("SUV");
		car.setVehicleColour("Black");
	    car.setVehicleDimensions("4900mm X 1980mm X 750mm");
		car.setVehicleEngineDisplacement(1999);
		car.setVehicleFuelCapacity("80 Liters");
		car.setVehicleFuelType("Petrol");
		car.setVehicleGearBox("5 Speed Dual Clutch");
		car.setVehicleMaximumPower(1000);
		car.setVehicleMaximumTorque("950 Nm");
		car.setVehicleMileage("5 Kmpl");
		car.setVehicleNumberOfCylinders(8);
		car.setVehicleRange("720 Kilometers");
		car.setVehicleRegistrationNumber("MP48CA0414");
		car.setVehicleRegistrationState("Madhya Pradesh");
		car.setVehicleShockAbsorbers("MacPherson Strut");
	
	
		
		Bikes bike = new Bikes();
		bike.setVehicleName("Ninja");
		bike.setVehicleCompany("Kawasaki");
		bike.setVehicleType("Sportsbike");
		bike.setVehicleColour("Black");
		bike.setVehicleDimensions("2300mm X 360mm X 650mm");
		bike.setVehicleEngineDisplacement(999);
		bike.setVehicleFuelCapacity("25 Liters");
		bike.setVehicleFuelType("Petrol");
		bike.setVehicleGearBox("6 Speed");
		bike.setVehicleMaximumPower(200);
		bike.setVehicleMaximumTorque("300nm");
		bike.setVehicleMileage("10 Kmpl");
		bike.setVehicleNumberOfCylinders(4);
		bike.setVehicleRange("300 Kilometers");
		bike.setVehicleRegistrationNumber("MP14CA2001");
		bike.setVehicleRegistrationState("Madhya Pradesh");
		bike.setVehicleShockAbsorbers("MacPherson Strut");
		
		
		
		
		Vehicle vehicles[] = new Vehicle[2];
		vehicles[0] = car;
		vehicles[1] = bike;
		
		List<Vehicle> list = new ArrayList<Vehicle>();
		list.add(car);
		list.add(bike);
		VehicleInformation.vehicleInformationDisplay(list);
	}
}