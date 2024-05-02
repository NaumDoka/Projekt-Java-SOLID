package progetto.mp.doka.naum.cargoShip;
import java.time.LocalDateTime;

import progetto.mp.doka.naum.transport.Transport;
import progetto.mp.doka.naum.transport.TransportTracker;
import progetto.mp.doka.naum.transportUtils.TransportUtils;


public class CargoShip implements Transport, TransportTracker {
	private final String cargoShipID;
	private final String cargoShipName;

	private CargoShip(CargoShipBuilder builder) {
		this.cargoShipID = builder.cargoShipID;
		this.cargoShipName = builder.cargoShipName;
	}

	@Override
	public void deliver() {
		System.out.println("Delivering by CargoShip" + cargoShipID + "(" + cargoShipName + ")");
	}

	@Override
	public String getLocation(double latitude, double longitude) {
		return TransportUtils.getLocation(latitude, longitude);
	}

	@Override
	public LocalDateTime getEstimatedArrivalTime() {
		return TransportUtils.getEstimatedArrivalTime();
	}

	// Builder pattern per costruire gli oggetti CargoShip
	public static class CargoShipBuilder {
		private String cargoShipID;
		private String cargoShipName;

		public CargoShipBuilder(String cargoShipID, String cargoShipName) {
			this.cargoShipID = cargoShipID;
			this.cargoShipName = cargoShipName;
		}

		// Static factory method per creare un'istanza di CargoShipBuilder
		public static CargoShipBuilder createBuilder(String cargoShipID, String cargoShipName) {
			return new CargoShipBuilder(cargoShipID, cargoShipName);
		}

		// Setter per cargoShipID e cargoShipName
		public CargoShipBuilder withCargoShipID(String cargoShipID) {
			this.cargoShipID = cargoShipID;
			return this;
		}

		public CargoShipBuilder withCargoShipName(String cargoShipName) {
			this.cargoShipName = cargoShipName;
			return this;
		}

		// Metodo Build per costruire un oggetto CargoShip
		public CargoShip build() {
			return new CargoShip(this);
		}
	}
}

