package progetto.mp.doka.naum.seaTransportFactory;

import progetto.mp.doka.naum.ship.Ship;
import progetto.mp.doka.naum.transport.Transport;
import progetto.mp.doka.naum.transportFactory.TransportFactory;

//Concrete Factory 2
public class SeaTransportFactory implements TransportFactory {

	@Override
	public Transport createTruck() {
		throw new UnsupportedOperationException("RoadTransportFactory does not create trucks");
	}

	@Override
	public Transport createShip() {
		return new Ship.ShipBuilder()
				.withShipID("SHIP-IMO")
				.withShipName("BLACK PEARL")
				.build();
	}
}
