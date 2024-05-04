package progetto.mp.doka.naum.transportFactory;

import progetto.mp.doka.naum.transport.Transport;

//Abstract Factory
public interface TransportFactory {
	Transport createTruck();
	Transport createShip();
}
