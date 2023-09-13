package technology;

public class Computer {

    private int screenSize;
    private String processorType;
    private boolean isWorking = true;

    public Computer(int screenSize, String type) {
        this.screenSize = screenSize;
        this.processorType = processorType;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getType() {
        return processorType;
    }

    public void setType(String type) {
        this.processorType = processorType;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public void hammer() {
        this.isWorking = false;
    }

    public void checkSpecs() {
        System.out.println("This is a " + processorType + "computer, with a " + screenSize + "\" screen, and is" + (isWorking ? "working." : "not working"));

    }

}
