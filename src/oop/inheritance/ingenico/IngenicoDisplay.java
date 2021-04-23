package oop.inheritance.ingenico;

public class IngenicoDisplay {

    private static IngenicoDisplay uniqueInstance;

    private IngenicoDisplay(){

    }

    public static IngenicoDisplay getInstance(){

        if(uniqueInstance == null)
            uniqueInstance = new IngenicoDisplay();
        return uniqueInstance;
    }

    /**
     * Prints a message to specied position
     *
     * @param x       horizontal position
     * @param y       vertical position
     * @param message message to be printed
     */
    public void showMessage(int x, int y, String message) {
    }

    /**
     * Clears the screen
     */
    public void clear() {

    }
}
