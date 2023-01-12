package com.factory.design;

public class FirstTier implements Booking {

	@Override
	public String toString() {
		return "FirstTier [getAcClassTyes()=" + getAcClassTyes() + "]";
	}

	@Override
	public String getAcClassTyes() {
		// TODO Auto-generated method stub
		return "FirstTier AC Seat Availability 8";
	}

}
