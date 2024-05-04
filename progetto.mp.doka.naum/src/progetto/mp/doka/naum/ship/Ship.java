package progetto.mp.doka.naum.ship;

import progetto.mp.doka.naum.routeStrategy.RouteStrategy;
import progetto.mp.doka.naum.transport.Transport;

//Concrete Product
public class Ship implements Transport {
	private RouteStrategy routeStrategy;
	private final String shipID;
	private final String shipName;

	private Ship(ShipBuilder builder) {
		this.shipID = builder.shipID;
		this.shipName = builder.shipName;
	}

	@Override
	public void setRoutestrategy(RouteStrategy strategy) {
		this.routeStrategy = strategy;
	}

	@Override
	public void deliver() {
		if (routeStrategy != null) {
			routeStrategy.buildRoute();
			System.out.println("Delivering by Ship: " + shipID + "(" + shipName + ")");
		} else {
			System.out.println("No route strategy set for ship");
		}
	}

	// Builder pattern
	public static class ShipBuilder {
		private String shipID;
		private String shipName;

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
