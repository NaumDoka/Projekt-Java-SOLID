package progetto.mp.doka.naum.seaTransportTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import progetto.mp.doka.naum.seaTransportFactory.SeaTransportFactory;
import progetto.mp.doka.naum.transportFactory.TransportFactory;

class SeaTransportFactoryTest {

	@Test
	void testSeaTransportFactory() {
		TransportFactory seaFactory = new SeaTransportFactory();
		assertNotNull(seaFactory.createShip());
		assertThrows(UnsupportedOperationException.class, seaFactory::createTruck);
	}
}
