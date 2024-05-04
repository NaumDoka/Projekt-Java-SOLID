package progetto.mp.doka.naum.transport;

import progetto.mp.doka.naum.routeStrategy.RouteStrategy;

//Abstract Product
public interface Transport {
	void setRoutestrategy(RouteStrategy strategy);
	void deliver();
}
