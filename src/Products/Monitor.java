package Products;

public class Monitor extends Product {
    private double inches;
    // 1080p / 1440p / 2K / 4K / 8K
    private String resolution;
    // 60Hz / 120Hz / 144Hz / 240Hz
    private int refreshRateHz;

    public Monitor(String name, double price, int stock, double inches, String resolution, int refreshRateHz) {
        super(name, price, stock);
        this.inches = inches;
        this.resolution = resolution;
        this.refreshRateHz = refreshRateHz;
    }

    @Override
    public String getSpecificDetails() {
        return String.format("Inches: %.1f | Resolution: %s | Refresh Rate: %dHz",
                inches, resolution, refreshRateHz);
    }

    // Getters
    public double getInches() {
        return inches;
    }

    public String getResolution() {
        return resolution;
    }

    public int getRefreshRateHz() {
        return refreshRateHz;
    }

    // Setters
    public void setInches(double inches) {
        this.inches = inches;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setRefreshRateHz(int refreshRateHz) {
        this.refreshRateHz = refreshRateHz;
    }
}
