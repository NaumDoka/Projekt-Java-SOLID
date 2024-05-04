package progetto.mp.doka.naum.seaStrategy;

import progetto.mp.doka.naum.routeStrategy.RouteStrategy;

// Concrete strategy
public class SeaRouteStrategy implements RouteStrategy {

	@Override
	public void buildRoute() {
		System.out.println("Routing by sea...");
	}
}
