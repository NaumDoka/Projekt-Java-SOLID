package progetto.mp.doka.naum.transportUtils;

import java.time.LocalDateTime;

//Classe di utilità per le operazioni di trasporto
public class TransportUtils {
	 public static String getLocation(double latitude, double longitude) {
	        return "Current location: (" + latitude + ", " + longitude + ")";
	    }

	    public static LocalDateTime getEstimatedArrivalTime() {
	        return LocalDateTime.now().plusHours(6); // Tempo di arrivo stimato a 6 ore da oggi
	    }
}

