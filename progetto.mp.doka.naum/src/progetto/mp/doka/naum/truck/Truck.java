package progetto.mp.doka.naum.truck;

import progetto.mp.doka.naum.routeStrategy.RouteStrategy;
import progetto.mp.doka.naum.transport.Transport;

//Concrete Product
public class Truck implements Transport {
	private RouteStrategy routeStrategy;
	private final String truckID;
	private final String truckName;

	private Truck(TruckBuilder builder) {
		this.truckID = builder.truckID;
		this.truckName = builder.truckName;
	}
	
	@Override
	public void setRoutestrategy(RouteStrategy strategy) {
		this.routeStrategy = strategy;
	}

	@Override
	public void deliver() {
		if (routeStrategy != null) {
			routeStrategy.buildRoute();
		System.out.println("Delivering by Truck: " + truckID + "(" + truckName + ")");
		} else {
			System.out.println("No route strategy set for truck");
		}
	}

	// Builder pattern
	public static class TruckBuilder {
		private String truckID;
		private String truckName;

		// Setter per truckID e truckName
		public TruckBuilder withTruckID(String truckID) {
			this.truckID = truckID;
			return this;
		}

		public TruckBuilder withTruckName(String truckName) {
			this.truckName = truckName;
			return this;
		}

		// Metodo Build per costruire un oggetto Truck
		public Truck build() {
			return new Truck(this);
		}
	}
}
