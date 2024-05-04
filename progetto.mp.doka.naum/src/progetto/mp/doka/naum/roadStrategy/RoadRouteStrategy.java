package progetto.mp.doka.naum.roadStrategy;

import progetto.mp.doka.naum.routeStrategy.RouteStrategy;

//Concrete Strategy
public class RoadRouteStrategy implements RouteStrategy {

	@Override
	public void buildRoute() {
		System.out.println("Routing by road...");
	}
}
