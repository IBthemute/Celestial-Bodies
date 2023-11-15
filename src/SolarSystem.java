public class SolarSystem {
    Celestial[] planets = { // to-do: switch to planet objects (too lazy to do moons right now)
            new Celestial("Mercury", 58),
            new Celestial("Venus", 108),
            new Celestial("Earth", 150),
            new Celestial("Mars", 228),
            new Celestial("Jupiter", 780),
            new Celestial("Saturn", 1425),
            new Celestial("Uranus", 2880),
            new Celestial("Neptune", 4515)
    };

    public void displayPlanets(String sort) {
        // no bubble sorting (I don't know how to do it)
        if (sort == "name") {
            //sort it alphabetically... somehow
        }
        else if (sort == "distance") {
            //sort it by distance... somehow
        }
    }

    public double distanceBetween(Celestial planet1, Celestial planet2) {
        double distBetween;
        double dist1 = planet1.getDistFromParent();
        double dist2 = planet2.getDistFromParent();

        if (dist1 > dist2) {distBetween = dist1 - dist2;}
        else {distBetween = dist2 - dist1;}

        return distBetween;
    }
}
