package com.vehicledekho.vehiclemanagement.data;

import java.util.List;

public class VehicleInformation { 

public static void vehicleInformationDisplay(List<Vehicle> vehicles) {
		for (Vehicle vehicle : vehicles) {
			System.out.println("------------------------------------");
			System.out.println("Display Name: " + vehicle.getVehicleCompany() + " " + vehicle.getVehicleName());
			System.out.println("Vehicle Id: " + vehicle.getVehicleId());
			System.out.println("Vehicle Type: " + vehicle.getVehicleType());
			System.out.println("State: " + vehicle.getVehicleRegistrationState());
			System.out.println("Registration Number: " + vehicle.getVehicleRegistrationNumber());
			System.out.println("Colour of Vehicle: " + vehicle.getVehicleColour());
			System.out.println("Power output: " + vehicle.getVehicleMaximumPower());
			System.out.println("Dimensions: " + vehicle.getVehicleDimensions());
			System.out.println("Engine Displacement: " + vehicle.getVehicleEngineDisplacement() + " cc");
			System.out.println("Fuel Capacity: " + vehicle.getVehicleFuelCapacity());
			System.out.println("Fuel Type: " + vehicle.getVehicleFuelType());
			System.out.println("Number of Gears: " + vehicle.getVehicleGearBox());
			System.out.println("Maximum Torque Output: " + vehicle.getVehicleMaximumTorque());
			System.out.println("Mileage: " + vehicle.getVehicleMileage());
			System.out.println("Range: " + vehicle.getVehicleRange());
			System.out.println("Shock Absorbers: " + vehicle.getVehicleShockAbsorbers());
			
			
			if(vehicle instanceof Cars) {
				Cars car = (Cars)vehicle;
				System.out.println("-----car list-----");
			} else if(vehicle instanceof Bikes) {
				Bikes bike = (Bikes)vehicle;
				System.out.println("-----bike list-----");
			}
			System.out.println("--------------------------------------" + "\n");
		}
	}
}