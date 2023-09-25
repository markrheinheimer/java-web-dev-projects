package technology;

public class SmartPhone extends Computer {

    private boolean hasCase;

    public SmartPhone(int screenSize, String type, boolean hasCase){
        super(screenSize, type);
        this.hasCase = hasCase;
    }



    public void installCase() {
        hasCase = true;
    }

    public boolean isHasCase() {
        return hasCase;
    }

    public void setHasCase(boolean hasCase) {
        this.hasCase = hasCase;
    }
}
