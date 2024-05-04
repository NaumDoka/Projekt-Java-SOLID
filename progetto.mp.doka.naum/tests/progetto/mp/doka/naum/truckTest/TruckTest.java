package progetto.mp.doka.naum.truckTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import progetto.mp.doka.naum.roadStrategy.RoadRouteStrategy;
import progetto.mp.doka.naum.routeStrategy.RouteStrategy;
import progetto.mp.doka.naum.transport.Transport;
import progetto.mp.doka.naum.truck.Truck;

class TruckTest {

	@Test
    void testTruckDeliveryWithRouteStrategy() {
        RouteStrategy routeStrategy = new RoadRouteStrategy();
        Transport truck = new Truck.TruckBuilder()
                .withTruckID("TRUCK-VIN")
                .withTruckName("OPTIMUS PRIME")
                .build();
        truck.setRoutestrategy(routeStrategy);
        /* We redirect the System.out stream to capture the output of the deliver() method and then assert the expected output
         * This way, we're ensuring that the deliver() method behaves as expected
         */
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        truck.deliver();
        String expectedOutput = "Routing by road..." + System.lineSeparator() + "Delivering by Truck: TRUCK-VIN(OPTIMUS PRIME)" + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    void testTruckDeliveryWithoutRouteStrategy() {
        Transport truck = new Truck.TruckBuilder()
                .withTruckID("TRUCK-VIN")
                .withTruckName("OPTIMUS PRIME")
                .build();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        truck.deliver();
        String expectedOutput = "No route strategy set for truck" + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());
    }
}
