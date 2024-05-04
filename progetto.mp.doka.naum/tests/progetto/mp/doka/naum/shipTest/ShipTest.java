package progetto.mp.doka.naum.shipTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import progetto.mp.doka.naum.routeStrategy.RouteStrategy;
import progetto.mp.doka.naum.seaStrategy.SeaRouteStrategy;
import progetto.mp.doka.naum.ship.Ship;
import progetto.mp.doka.naum.transport.Transport;

class ShipTest {

	@Test
    void testShipDeliveryWithRouteStrategy() {
        RouteStrategy routeStrategy = new SeaRouteStrategy();
        Transport ship = new Ship.ShipBuilder()
                .withShipID("SHIP-IMO")
                .withShipName("BLACK PEARL")
                .build();
        ship.setRoutestrategy(routeStrategy);
        /* We redirect the System.out stream to capture the output of the deliver() method and then assert the expected output
         * This way, we're ensuring that the deliver() method behaves as expected
         */
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ship.deliver();
        String expectedOutput = "Routing by sea..." + System.lineSeparator() + "Delivering by Ship: SHIP-IMO(BLACK PEARL)" + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    void testShipDeliveryWithoutRouteStrategy() {
        Transport ship = new Ship.ShipBuilder()
                .withShipID("SHIP-IMO")
                .withShipName("BLACK PEARL")
                .build();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ship.deliver();
        String expectedOutput = "No route strategy set for ship" + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());
    }
}
