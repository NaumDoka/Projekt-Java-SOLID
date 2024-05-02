package progetto.mp.doka.naum.seaTransportFactory;

import progetto.mp.doka.naum.cargoShip.CargoShip.CargoShipBuilder;
import progetto.mp.doka.naum.ship.Ship.ShipBuilder;
import progetto.mp.doka.naum.transport.Transport;
import progetto.mp.doka.naum.transportFactory.TransportFactory;

//Concrete Factory
public class SeaTransportFactory implements TransportFactory {

	// Override del metodo per creare un trasporto via mare (Ship)
	@Override
	public Transport createTransport() {
		return ShipBuilder.createBuilder("SHIP-IMO", "BLACK PEARL").withShipID("SHIP-IMO").withShipName("BLACK PEARL")
				.build();

	}

	// Static Factory Method per creare un trasporto via mare (CargoShip)
	public static Transport createCargoShip() {
		return CargoShipBuilder.createBuilder("CARGOSHIP-IMO", "FLYING DUTCHMAN").withCargoShipID("CARGOSHIP-IMO").withCargoShipName("FLYING DUTCHMAN")
				.build();
	}
}
