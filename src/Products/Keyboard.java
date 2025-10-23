package Products;

public class Keyboard extends Product {
    // Mechanical / Membrane
    private String switchType;
    // Full / TKL / 75% / 65% / 60%
    private String format;
    // True / False
    private boolean illumination;

    public Keyboard(String name, double price, int stock, String switchType, String format, boolean illumination) {
        super(name, price, stock);
        this.switchType = switchType;
        this.format = format;
        this.illumination = illumination;
    }

    @Override
    public String getSpecificDetails() {
        String lightStatus = illumination ? "Yes" : "No";
        return String.format("Switch: %s | Format: %s | Illumination: %s",
                switchType, format, lightStatus);
    }

    // Getters
    public String getSwitchType() {
        return switchType;
    }

    public String getFormat() {
        return format;
    }

    public boolean getIllumination() {
        return illumination;
    }

    // Setters
    public void setSwitchType(String switchType) {
        this.switchType = switchType;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setIllumination(boolean illumination) {
        this.illumination = illumination;
    }
}
