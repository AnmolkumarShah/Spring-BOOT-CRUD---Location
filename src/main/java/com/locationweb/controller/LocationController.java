package com.locationweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.locationweb.Entity.Location;
import com.locationweb.Service.LocationService;

@Controller
public class LocationController {
	
	@Autowired
	LocationService theLocationService;

	@RequestMapping("/createLocation")
	public String showCreateLocation(Model m) {
		m.addAttribute("newLocation", new Location());
		return "createLocation";
	}
	
	@RequestMapping("/saveLocation")
	public String saveLocation(@ModelAttribute("location") Location location, Model m) {
		Location savedLocation = theLocationService.saveLocation(location);
		String msg = "Location saved with id "+savedLocation.getId();
		
		m.addAttribute("msg", msg);
		m.addAttribute("newLocation", new Location());
		return "createLocation";
	}
	
	@RequestMapping("/displayAll")
	public String displayLocation(Model m) {
		List<Location> allLocation = theLocationService.getAllLocation();
		m.addAttribute("allLocation", allLocation);
		return "displayLocations";
	}
	
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") int id) {
		Location l = new Location();
		l.setId(id);
		theLocationService.deleteLocation(l);
		return "redirect:/displayAll";
	}
	
	@RequestMapping("/editLocation")
	public String editLocation(@RequestParam("id") int id,Model m) {
		Location locationById = theLocationService.getLocationById(id);
		m.addAttribute("newLocation", locationById);
		return "createLocation";
	}
	
	/*
	 * @RequestMapping("/updateLocation") public String
	 * updateLocation(@ModelAttribute("newLocation") Location location,Model m) {
	 * Location updatedLocation = theLocationService.saveLocation(location); String
	 * msg = "Location updated with id"+updatedLocation.getId();
	 * m.addAttribute("msg", msg); return "createLocation"; }
	 */
	
}
