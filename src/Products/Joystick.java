package Products;

public class Joystick extends Product {
    // PC / PS / Xbox
    private String platform;
    // True / False
    private boolean vibration;
    // USB / Bluetooth / Both
    private String connection;

    public Joystick(String name, double price, int stock, String platform, boolean vibration, String connection) {
        super(name, price, stock);
        this.platform = platform;
        this.vibration = vibration;
        this.connection = connection;
    }

    @Override
    public String getSpecificDetails() {
        String vibStatus = vibration ? "Yes" : "No";
        return String.format("Platform: %s | Vibration: %s | Connection: %s",
                platform, vibStatus, connection);
    }

    // Getters
    public String getPlatform() {
        return platform;
    }

    public boolean getVibration() {
        return vibration;
    }

    public String getConnection() {
        return connection;
    }

    // Setters
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setVibration(boolean vibration) {
        this.vibration = vibration;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }
}
