package progetto.mp.doka.naum.roadTransportFactoryTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import progetto.mp.doka.naum.roadTransportFactory.RoadTransportFactory;
import progetto.mp.doka.naum.transport.Transport;

class RoadTransportFactoryTest {

	@Test
	public void testCreateTransport() {
		// Create a road transport (Truck) using factory method from
		// RoadTransportFactory
		Transport roadTransport = new RoadTransportFactory().createTransport();

		// Check if road transport instance is not null
		assertNotNull(roadTransport);

		// Perform delivery
		roadTransport.deliver();
	}

	@Test
	public void testCreateVan() {
		// Create a road transport (Van) using static factory method from
		// RoadTransportFactory
		Transport van = RoadTransportFactory.createVan();

		// Check if van instance is not null
		assertNotNull(van);

		// Perform delivery
		van.deliver();
	}
}
