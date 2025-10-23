package Products;

public class Headphones extends Product {
    // Over-ear / In-ear
    private String type;
    // True / False
    private boolean microphone;
    private int impedanceOhms;

    public Headphones(String name, double price, int stock, String type, boolean microphone, int impedanceOhms) {
        super(name, price, stock);
        this.type = type;
        this.microphone = microphone;
        this.impedanceOhms = impedanceOhms;
    }

    @Override
    public String getSpecificDetails() {
        String micStatus = microphone ? "Yes" : "No";
        return String.format("Type: %s | Microphone: %s | Impedance: %dΩ",
                type, micStatus, impedanceOhms);
    }

    // Getters
    public String getType() {
        return type;
    }

    public boolean getMicrophone() {
        return microphone;
    }

    public int getImpedanceOhms() {
        return impedanceOhms;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
    }

    public void setMicrophone(boolean microphone) {
        this.microphone = microphone;
    }

    public void setImpedanceOhms(int impedanceOhms) {
        this.impedanceOhms = impedanceOhms;
    }
}
