package com.locationweb.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

//import org.springframework.data.repository.CrudRepository;

import com.locationweb.Entity.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
