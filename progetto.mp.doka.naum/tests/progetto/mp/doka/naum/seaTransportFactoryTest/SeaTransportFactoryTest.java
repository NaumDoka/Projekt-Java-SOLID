package progetto.mp.doka.naum.seaTransportFactoryTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import progetto.mp.doka.naum.seaTransportFactory.SeaTransportFactory;
import progetto.mp.doka.naum.transport.Transport;

class SeaTransportFactoryTest {

	@Test
    public void testCreateTransport() {
        // Create a sea transport (Ship) using factory method from SeaTransportFactory
        Transport seaTransport = new SeaTransportFactory().createTransport();

        // Check if sea transport instance is not null
        assertNotNull(seaTransport);

        // Perform delivery
        seaTransport.deliver();
    }
	
	@Test
    public void testCreateCargoShip() {
        // Create a sea transport (CargoShip) using static factory method from SeaTransportFactory
        Transport cargoShip = SeaTransportFactory.createCargoShip();

        // Check if cargoShip instance is not null
        assertNotNull(cargoShip);

        // Perform delivery
        cargoShip.deliver();
    }

}
