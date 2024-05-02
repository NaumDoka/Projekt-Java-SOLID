package progetto.mp.doka.naum.ship;
import java.time.LocalDateTime;

import progetto.mp.doka.naum.transport.Transport;
import progetto.mp.doka.naum.transport.TransportTracker;
import progetto.mp.doka.naum.transportUtils.TransportUtils;

//Concrete Product
public class Ship implements Transport, TransportTracker {
	private final String shipID;
	private final String shipName;

	private Ship(ShipBuilder builder) {
		this.shipID = builder.shipID;
		this.shipName = builder.shipName;
	}

	@Override
	public void deliver() {
		System.out.println("Delivering by Ship: " + shipID + "(" + shipName + ")");
	}

	@Override
	public String getLocation(double latitude, double longitude) {
		 return TransportUtils.getLocation(latitude, longitude);
	}

	@Override
	public LocalDateTime getEstimatedArrivalTime() {
		return TransportUtils.getEstimatedArrivalTime();
	}

	// Builder pattern per costruire gli oggetti Ship
	public static class ShipBuilder {
		private String shipID;
		private String shipName;

		public ShipBuilder(String shipID, String shipName) {
			this.shipID = shipID;
			this.shipName = shipName;
		}

		// Static factory method per creare un'istanza di ShipBuilder
		public static ShipBuilder createBuilder(String shipID, String shipName) {
			return new ShipBuilder(shipID, shipName);
		}

		// Setter per shipID e shipName
		public ShipBuilder withShipID(String shipID) {
			this.shipID = shipID;
			return this;
		}

		public ShipBuilder withShipName(String shipName) {
			this.shipName = shipName;
			return this;
		}

		// Metodo Build per costruire un oggetto Ship
		public Ship build() {
			return new Ship(this);
		}
	}
}

