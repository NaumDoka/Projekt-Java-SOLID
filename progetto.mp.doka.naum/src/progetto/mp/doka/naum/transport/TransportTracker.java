package progetto.mp.doka.naum.transport;

import java.time.LocalDateTime;

//Interfaccia per il tracciamento della posizione del trasporto e dell'orario di arrivo stimato
public interface TransportTracker {
 String getLocation(double latitude, double longitude);
 LocalDateTime getEstimatedArrivalTime();
}
