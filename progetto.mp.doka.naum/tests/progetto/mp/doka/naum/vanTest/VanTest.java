package progetto.mp.doka.naum.vanTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import progetto.mp.doka.naum.transport.Transport;
import progetto.mp.doka.naum.transportUtils.TransportUtils;
import progetto.mp.doka.naum.van.Van;

class VanTest {

	@Test
    public void testVanDelivery() {
        // Create a Van instance
        Transport van = new Van.VanBuilder("VAN-VIN", "BUMBLEBEE").build();

        // Check if van instance is not null
        assertNotNull(van);

        // Perform delivery
        van.deliver();
    }
	
	 @Test
	    public void testGetLocation() {
	        // Mock latitude and longitude
	        double latitude = 51.5074;
	        double longitude = -0.1278;

	        // Get location for Van
	        String location = TransportUtils.getLocation(latitude, longitude);

	        // Check if location string is not null
	        assertNotNull(location);

	        // Check if location string contains latitude and longitude
	        assertTrue(location.contains(String.valueOf(latitude)));
	        assertTrue(location.contains(String.valueOf(longitude)));
	    }
	 
	 @Test
	    public void testGetEstimatedArrivalTime() {
	        // Get estimated arrival time
	        LocalDateTime estimatedArrivalTime = TransportUtils.getEstimatedArrivalTime();

	        // Check if estimated arrival time is not null
	        assertNotNull(estimatedArrivalTime);

	        // Check if estimated arrival time is within 24 hours from now
	        assertTrue(estimatedArrivalTime.isAfter(LocalDateTime.now()));
	        assertTrue(estimatedArrivalTime.isBefore(LocalDateTime.now().plusHours(24)));
	    }
}

