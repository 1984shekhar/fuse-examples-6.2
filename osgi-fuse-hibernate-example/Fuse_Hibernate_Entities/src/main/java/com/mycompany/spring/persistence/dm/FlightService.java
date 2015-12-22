package com.mycompany.spring.persistence.dm;
import java.util.List;

public interface FlightService {

        public void addDummyFlights();
	public void add(Flight emp);
	public List<Object> getAll();
	public void deleteAll();

}