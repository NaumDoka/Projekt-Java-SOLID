package progetto.mp.doka.naum.truckTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import progetto.mp.doka.naum.transportUtils.TransportUtils;
import progetto.mp.doka.naum.truck.Truck;

class TruckTest {
	@Test
	public void testTruckDelivery() {
		// Create a Truck instance
		Truck truck = new Truck.TruckBuilder("TRUCK-VIN", "OPTIMUS PRIME").build();

		// Check if truck instance is not null
		assertNotNull(truck);

		// Perform delivery
		truck.deliver();
	}
	
	@Test
    public void testGetLocation() {
        // Mock latitude and longitude
        double latitude = 40.7128;
        double longitude = -74.0060;

        // Get location for Truck
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
