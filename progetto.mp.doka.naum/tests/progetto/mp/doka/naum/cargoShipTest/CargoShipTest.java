package progetto.mp.doka.naum.cargoShipTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import progetto.mp.doka.naum.cargoShip.CargoShip;
import progetto.mp.doka.naum.transport.Transport;
import progetto.mp.doka.naum.transportUtils.TransportUtils;

class CargoShipTest {

	@Test
    public void testCargoShipDelivery() {
        // Create a CargoShip instance
        Transport cargoShip = new CargoShip.CargoShipBuilder("CARGOSHIP-IMO", "FLYING DUTCHMAN").build();

        // Check if cargoShip instance is not null
        assertNotNull(cargoShip);

        // Perform delivery
        cargoShip.deliver();
    }
	
	@Test
    public void testGetLocation() {
        // Mock latitude and longitude
        double latitude = 51.5074;
        double longitude = -0.1278;

        // Get location for CargoShip
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
