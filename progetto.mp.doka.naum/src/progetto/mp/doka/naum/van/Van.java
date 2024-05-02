package progetto.mp.doka.naum.van;

import java.time.LocalDateTime;

import progetto.mp.doka.naum.transport.Transport;
import progetto.mp.doka.naum.transport.TransportTracker;
import progetto.mp.doka.naum.transportUtils.TransportUtils;

//Concrete Product
public class Van implements Transport, TransportTracker {
	private final String vanID;
	private final String vanName;

	private Van(VanBuilder builder) {
		this.vanID = builder.vanID;
		this.vanName = builder.vanName;
	}

	@Override
	public void deliver() {
		System.out.println("Delivering by Van: " + vanID + "(" + vanName + ")");
	}

	@Override
	public String getLocation(double latitude, double longitude) {
		return TransportUtils.getLocation(latitude, longitude);
	}

	@Override
	public LocalDateTime getEstimatedArrivalTime() {
		return TransportUtils.getEstimatedArrivalTime();
	}

	// Builder pattern per costruire gli oggetti Van
	public static class VanBuilder {
		private String vanID;
		private String vanName;

		public VanBuilder(String vanID, String vanName) {
			this.vanID = vanID;
			this.vanName = vanName;
		}

		// Static factory method per creare un'istanza di VanBuilder
		public static VanBuilder createBuilder(String vanID, String vanName) {
			return new VanBuilder(vanID, vanName);
		}

		// Setter per vanID e vanName
		public VanBuilder withVanID(String vanID) {
			this.vanID = vanID;
			return this;
		}

		public VanBuilder withVanName(String vanName) {
			this.vanName = vanName;
			return this;
		}

		// Metodo Build per costruire un oggetto Van
		public Van build() {
			return new Van(this);
		}
	}
}

