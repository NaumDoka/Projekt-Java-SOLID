# Projekt-Java-SOLID
Programi JAVA perdor 4 design pattern-s: Abstract Factory, Factory Method, Builder dhe Strategy.
1. Abstract Factory pattern:
   Elementet:
   TransportFactory interface: Përfaqëson abstract factory, duke deklaruar metodat për krijimin e 
   produkteve.
   RoadTransportFactory dhe SeaTransportFactory: Implementojn interface-in TransportFactory dhe 
   siguroni implementime specifike për krijimin e produkteve (Truck e Ship).
2. Factory Method Pattern:
   Elementet:
   TransportFactory interface: Përmban metodat (createTruck() dhe createShip()) që nënklasat janë 
   përgjegjëse për zbatimin.
3. Strategy Pattern:
   Elementet:
   RouteStrategy interface: Përfaqëson strategjinë për ndërtimin e rrugëve, duke ofruar një interface 
   të përbashkët për të gjitha strategjitë konkrete.
   RoadRouteStrategy dhe SeaRouteStrategy: Implementojn RouteStrategy interface për të përcaktuar 
   strategji specifike të rrugëtimit.
4. Builder Pattern:
   Elementet:
   Truck dhe Ship: Perfaqesojne produktet konkrete që kërkojnë ndërtim përmes TruckBuilder dhe 
   ShipBuilder, qe ofrojne nje "interface" te rrjedhshme per ndertimin e objekteve Truck e Ship.
