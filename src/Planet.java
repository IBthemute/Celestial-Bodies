import java.util.ArrayList;

public class Planet extends Celestial {
    boolean atmosphere;
    ArrayList<Celestial> moons;

    public Planet(String name, int distFromParent, boolean atmosphere, ArrayList<Celestial> moons) {
        super(name, distFromParent);
        this.atmosphere = atmosphere;
        this.moons = moons;
    }

    public boolean getAtmosphere() {return atmosphere;}
    public ArrayList<Celestial> getMoons() {return moons;}
    public boolean setAtmosphere(boolean atmosphere) {this.atmosphere = atmosphere; return atmosphere;}
    public ArrayList<Celestial> setMoons() {this.moons = moons; return moons;}

    public ArrayList<Celestial> addMoon(Celestial moon) {moons.add(moon); return moons;}
}
