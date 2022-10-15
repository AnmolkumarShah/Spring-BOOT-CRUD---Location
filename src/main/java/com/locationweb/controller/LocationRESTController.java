package com.locationweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locationweb.Entity.Location;
import com.locationweb.Service.LocationService;

@RestController
@RequestMapping("/location")
public class LocationRESTController {
	
	@Autowired
	LocationService theLocationService;
	
	@GetMapping
	public List<Location> getAllLocation(){
		return theLocationService.getAllLocation(); 
	}
	
	@PostMapping
	public Location createLocation(@RequestBody Location theLocation) {
		return theLocationService.saveLocation(theLocation);
	}
	
	@PutMapping
	public Location updateLocation(@RequestBody Location theLocation) {
		return theLocationService.saveLocation(theLocation);
	}
	
	@DeleteMapping("/{id}")
	public void deleteLocation(@PathVariable("id") int id) {
		Location temp = new Location();
		temp.setId(id);
		theLocationService.deleteLocation(temp);
	}
	
	@GetMapping("/{id}")
	public Location getOneLocation(@PathVariable("id") int id) {
		try {
			return theLocationService.getLocationById(id);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

}
