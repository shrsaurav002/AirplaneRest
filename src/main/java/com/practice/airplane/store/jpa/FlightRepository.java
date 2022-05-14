package com.practice.airplane.store.jpa;

import com.practice.airplane.store.entity.FlightEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<FlightEntity, String> {

}
