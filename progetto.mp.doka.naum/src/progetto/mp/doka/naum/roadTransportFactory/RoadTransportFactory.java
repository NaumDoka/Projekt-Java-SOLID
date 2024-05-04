package progetto.mp.doka.naum.roadTransportFactory;

import progetto.mp.doka.naum.transport.Transport;
import progetto.mp.doka.naum.transportFactory.TransportFactory;
import progetto.mp.doka.naum.truck.Truck;

//Concrete Factory 1
public class RoadTransportFactory implements TransportFactory {

	@Override
	public Transport createTruck() {
		 return new Truck.TruckBuilder()
	                .withTruckID("TRUCK-VIN")
	                .withTruckName("OPTIMUS PRIME")
	                .build();
	}

	@Override
	public Transport createShip() {
		throw new UnsupportedOperationException("RoadTransportFactory does not create ships");
	}
}
