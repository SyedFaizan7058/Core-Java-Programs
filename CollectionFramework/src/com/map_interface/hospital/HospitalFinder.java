package com.map_interface.hospital;

import java.util.List;


public class HospitalFinder {

	public static void main(String[] args) {
		

		HospitalService hospitalService = new HospitalService();

		Hospital hospital1 = new Hospital("YASHODA", List.of("Cardiac", "ENT", "Ortho", "Pediatric", "Gastro"),
				"MATHEWS", "9848222222", "Sec");
		hospitalService.addHospital(hospital1);

		Hospital hospital2 = new Hospital("ABC Hospital", List.of("Dermatology", "Ophthalmology", "Dental"), "John Doe",
				"9876543210", "City Center");
		hospitalService.addHospital(hospital2);

		System.out.println("Hospital Codes and Names: " + hospitalService.getHospitals());

		int searchCode = 101;

		Hospital foundHospital = hospitalService.getHospitalDetails(searchCode);
		
		if (foundHospital != null) {
			System.out.println("Hospital Details: " + foundHospital);
		} else {
			System.out.println("Hospital with code " + searchCode + " not found");
		}
		

	}

}
