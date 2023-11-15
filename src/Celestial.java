public class Celestial {
    String name;
    double distFromParent;

    public Celestial(String name, double distFromParent) {
        this.name = name;
        this.distFromParent = distFromParent; // in millions of KM
    }

    public String getName() {return name;}
    public double getDistFromParent() {return distFromParent;}
    public String setName(String name) {this.name = name; return name;}
    public double setDistFromParent(double distFromParent) {this.distFromParent = distFromParent; return distFromParent;}

    public int convertToAU(int kilometres) {return (kilometres / 150000000);}
    public int convertToKM(int astronomicalUnits) {return (astronomicalUnits * 150000000);}


}
