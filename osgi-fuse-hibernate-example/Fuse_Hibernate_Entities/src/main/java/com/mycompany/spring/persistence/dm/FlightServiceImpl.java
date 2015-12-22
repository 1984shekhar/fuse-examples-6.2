package com.mycompany.spring.persistence.dm;

import java.util.List;

import javax.persistence.*;

import org.apache.log4j.Logger;

public class FlightServiceImpl implements FlightService {

	private EntityManager entityManager;
	private Logger logger = Logger.getLogger(getClass());

	public void addDummyFlights() {
		logger.info("Creating Flight Object");
		Flight flight = new Flight();
		flight.setFlightNumber("217");
		flight.setArrival("9:00 PM");
		flight.setDeparture("11:05 AM");
		entityManager.persist(flight);
		entityManager.flush();
		logger.info("Flight: " + flight
				+ " Record is now stored in Database.");

	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void add(Flight emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Object> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}