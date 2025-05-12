public class Appliance extends Amenities {
    private String type;
    private int wattage;

    // Costruttore

    public Appliance(String deviceName, String type, int wattage) {
        super(deviceName);
        this.type = type;
        this.wattage = wattage;
    }

    // Getter & Setter
    public String getType() {
        return type;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }
    public String toString() {
        return super.toString() + "Type: " + type +
               "\nConsumo: " + wattage + "W\n";
    }
}