package com.map_interface.hospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HospitalService {

	List<Hospital> list = new ArrayList<>();
	HashMap<Integer, String> map = new HashMap<>();

	public int addHospital(Hospital hospital) {

		list.add(hospital);

		return hospital.getHospitalCode();

	}

	public HashMap<Integer, String> getHospitals() {

		for (int i = 0; i <list.size(); i++) {
			map.put(list.get(i).getHospitalCode(), list.get(i).getHospitalName());
		}

		return map;
	}

	public Hospital getHospitalDetails(Integer code) {

		for (Hospital hospital : list) {
			if (hospital.getHospitalCode() == code) {
				return hospital;
			}
		}
		return null;
	}

}
