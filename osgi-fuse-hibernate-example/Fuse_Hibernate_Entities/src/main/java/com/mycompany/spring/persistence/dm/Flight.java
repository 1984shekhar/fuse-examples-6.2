package com.mycompany.spring.persistence.dm;
import java.io.Serializable;

import javax.persistence.*;

/**
 * A very simple entity class for a flight - every flight has:
 * - a flight number
 * - a departure airport
 * - an arrival airport
 */
@Entity
@Access(AccessType.FIELD)
@Table(name = "FLIGHTS")
public class Flight implements Serializable {

    @Id
    @Column(length = 12)
    private String flightNumber;
    public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	@Column(length = 20)
    private String departure;
    @Column(length = 20)
    private String arrival;

   

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    @Override
    public String toString() {
        return String.format("[flight %s from %s to %s]", flightNumber, departure, arrival);
    }

}