package progetto.mp.doka.naum.truck;
import java.time.LocalDateTime;

import progetto.mp.doka.naum.transport.Transport;
import progetto.mp.doka.naum.transport.TransportTracker;
import progetto.mp.doka.naum.transportUtils.TransportUtils;

//Concrete Product
public class Truck implements Transport, TransportTracker {
	private final String truckID;
	private final String truckName;

	private Truck(TruckBuilder builder) {
		this.truckID = builder.truckID;
		this.truckName = builder.truckName;
	}

	@Override
	public void deliver() {
		System.out.println("Delivering by Truck: " + truckID + "(" + truckName + ")");
	}

	@Override
	public String getLocation(double latitude, double longitude) {
		return TransportUtils.getLocation(latitude, longitude);
	}

	@Override
	public LocalDateTime getEstimatedArrivalTime() {
		return TransportUtils.getEstimatedArrivalTime();
	}

	// Builder pattern per costruire gli oggetti Truck
	public static class TruckBuilder {
		private String truckID;
		private String truckName;

		public TruckBuilder(String truckID, String truckName) {
			this.truckID = truckID;
			this.truckName = truckName;
		}

		// Static factory method per creare un'istanza di TruckBuilder
		public static TruckBuilder createBuilder(String truckID, String truckName) {
			return new TruckBuilder(truckID, truckName);
		}

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

