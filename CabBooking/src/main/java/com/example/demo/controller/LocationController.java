package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Booking;
import com.example.demo.entity.User;
import com.example.demo.repository.LocationRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.Cab;
import com.example.demo.service.FindCabServices;

/* Request Booking:- http://localhost:8080/api/v1/save_location
 * Booking History:- http://localhost:8080/api/v1/history/1
 * Nearest Cab:- http://localhost:8080/api/v1/karvenagar
 */

@RestController
@RequestMapping("api/v1")
public class LocationController {

	@Autowired
	LocationRepository locationRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	FindCabServices findCabServices;

	@PostMapping("/save_location")
	public ResponseEntity<?> getLocationForRequestBooking(@RequestBody Booking booking) {

		List<Booking>bookingList=new ArrayList<Booking>();
		User user=userRepository.findByUserId(1);	
		booking.setUser(user);
		bookingList.add(booking);
		user.setBookings(bookingList);
		userRepository.save(user);

		return new ResponseEntity<String>("Booking successful!",HttpStatus.CREATED);
	}

	@GetMapping("history/{userId}")
	public List<Booking> getHistoryOfUser(@PathVariable Integer userId) {

		User user=userRepository.findByUserId(userId);

		List<Booking> bookings=user.getBookings();

		return bookings;
	}	

	@GetMapping("/{picklocation}")
	public ResponseEntity<List<Cab>> getPickupLoc(@PathVariable String picklocation) {
		return new ResponseEntity<List<Cab>>(findCabServices.getCab(picklocation), HttpStatus.OK);
	}	
}