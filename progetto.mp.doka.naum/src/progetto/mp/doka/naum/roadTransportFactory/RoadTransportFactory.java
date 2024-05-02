package progetto.mp.doka.naum.roadTransportFactory;

import progetto.mp.doka.naum.transport.Transport;
import progetto.mp.doka.naum.transportFactory.TransportFactory;
import progetto.mp.doka.naum.truck.Truck.TruckBuilder;
import progetto.mp.doka.naum.van.Van.VanBuilder;

//Concrete Factories
public class RoadTransportFactory implements TransportFactory {
	// Override del metodo per creare un trasporto su strada (Truck)
	@Override
	public Transport createTransport() {
		return TruckBuilder.createBuilder("TRUCK-VIN", "OPTIMUS PRIME").withTruckID("TRUCK-VIN")
				.withTruckName("OPTIMUS PRIME").build();
	}
	
	// Static Factory Method per creare un trasporto su strada (Van)
 public static Transport createVan() {
     return VanBuilder.createBuilder("VAN-VIN", "BUMBLEBEE").withVanID("VAN-VIN").build();
 }
}
