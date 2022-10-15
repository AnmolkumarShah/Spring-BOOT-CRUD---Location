package com.locationweb.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locationweb.Entity.Location;
import com.locationweb.Repos.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository theLocationRepository;

	@Override
	public Location saveLocation(Location location) {
		return theLocationRepository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return theLocationRepository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		theLocationRepository.delete(location);
	}

	@Override
	public Location getLocationById(int id) {
		Optional<Location> findByIdOptional = theLocationRepository.findById(id);
		return findByIdOptional.get();
	}

	@Override
	public List<Location> getAllLocation() {
		return theLocationRepository.findAll();
	}

}
