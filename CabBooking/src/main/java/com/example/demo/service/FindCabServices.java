package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class FindCabServices {
	
	static Map<String, List<Cab>> map1 = new HashMap<>();
	
	static {
	
	List<Cab> cabNearKarveNagar = new ArrayList<Cab>();
	cabNearKarveNagar.add(new Cab(1, "WagonR", "MH-12AF1234", "John", "9808918765"));
	cabNearKarveNagar.add(new Cab(2, "Swift", "MH-12GH5678", "Roman", "98765413456"));
	cabNearKarveNagar.add(new Cab(3, "Desire", "MH-12IO2345", "Katty", "9800000000"));
	
	List<Cab> cabsNearPuneStation = new ArrayList<Cab>();
	cabsNearPuneStation.add(new Cab(1, "Swift", "MH-12OP1212", "Alex", "981111111"));
	cabsNearPuneStation.add(new Cab(2, "WagonR", "MH-12KL5656", "Gill", "9822222222"));
	cabsNearPuneStation.add(new Cab(3, "Desire", "MH-12WE2334", "Mac", "9833333333"));
	
	List<Cab> cabsNearCorporation = new ArrayList<Cab>();
	cabsNearCorporation.add(new Cab(1, "Desire", "MH-12BN1111", "Carry", "9844444444"));
	cabsNearCorporation.add(new Cab(2, "Swift", "MH-12KP2222", "Peter", "9855555555"));
	cabsNearCorporation.add(new Cab(3, "WagonR", "MH-12WE3333", "Rock", "9866666666"));
	
	List<Cab> cabsNearChinchwad = new ArrayList<Cab>();
	cabsNearChinchwad.add(new Cab(1, "Desire", "MH-12NJ4444", "Sam", "9877777777"));
	cabsNearChinchwad.add(new Cab(2, "WagonR", "MH-12CV5555", "Rocky", "9888888888"));
	cabsNearChinchwad.add(new Cab(3, "Swift", "MH-12NN6666", "Danny", "9899999999"));
	

	map1.put("karvenagar", cabNearKarveNagar);
	map1.put("punestation", cabsNearPuneStation);
	map1.put("corporation", cabsNearCorporation);
	map1.put("chinchwad", cabsNearChinchwad);
	}
	
	public List<Cab> getCab(String pickLocation) {
		System.out.println("********************"+pickLocation);
		System.out.println(map1.keySet());

		switch (pickLocation) {
		case "karvenagar" :
			return map1.get(pickLocation);	
			
		case "punestation" :
			return map1.get(pickLocation);

		case "corporation" :
			return map1.get(pickLocation);

		case "chinchwad" :
			return map1.get(pickLocation);
			
		default:
				System.out.println("Not Found");

		}
		return map1.get(pickLocation);
		
	
		
}
}
