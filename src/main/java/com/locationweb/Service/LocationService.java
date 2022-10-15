package com.locationweb.Service;

import java.util.List;

import com.locationweb.Entity.Location;

public interface LocationService {

	Location saveLocation(Location location);

	Location updateLocation(Location location);

	void deleteLocation(Location location);

	Location getLocationById(int id);

	List<Location> getAllLocation();
}
