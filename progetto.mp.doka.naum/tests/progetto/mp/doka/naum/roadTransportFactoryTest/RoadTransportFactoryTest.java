package progetto.mp.doka.naum.roadTransportFactoryTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import progetto.mp.doka.naum.roadTransportFactory.RoadTransportFactory;
import progetto.mp.doka.naum.transportFactory.TransportFactory;

class RoadTransportFactoryTest {

	@Test
	void testRoadTransportFactory() {
		TransportFactory roadFactory = new RoadTransportFactory();
		assertNotNull(roadFactory.createTruck());
		assertThrows(UnsupportedOperationException.class, roadFactory::createShip);
	}
}
