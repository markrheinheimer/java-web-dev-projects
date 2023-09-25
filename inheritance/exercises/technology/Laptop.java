package technology;

public class Laptop extends Computer{

    private int chargeLevel;

    public Laptop(int screenSize, String type, int chargeLevel) {
        super(screenSize, type);
        this.chargeLevel = chargeLevel;
    }

    public void charge() {
        chargeLevel = 100;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public void setChargeLevel(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }
}
