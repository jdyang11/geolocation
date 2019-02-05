package com.microservices.geolocation;

import java.util.List;

public interface GeoLocationService {
	public GeoLocation create(GeoLocation geoLocation);
	public List<GeoLocation> findAll();
}
