package Products;

public class Mouse extends Product {
    // Optical / Laser
    private String sensorType;
    // Wired / Wireless
    private String connection;
    private int maxDpi;

    public Mouse(String name, double price, int stock, String sensorType, String connection, int maxDpi) {
        super(name, price, stock);
        this.sensorType = sensorType;
        this.connection = connection;
        this.maxDpi = maxDpi;
    }

    @Override
    public String getSpecificDetails() {
        return String.format("Sensor: %s | Connection: %s | Max DPI: %d", sensorType, connection, maxDpi);
    }

    // Getters
    public String getSensorType() {
        return sensorType;
    }

    public String getConnection() {
        return connection;
    }

    public int getMaxDpi() {
        return maxDpi;
    }

    public void getSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    // Setters
    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public void setMaxDpi(int maxDpi) {
        this.maxDpi = maxDpi;
    }
}
