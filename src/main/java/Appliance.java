public class Appliance extends Amenities {
    private String type;          // es. "Lavatrice", "Frigorifero", "Forno"
    private int wattage;          // consumo energetico in watt (come intero)

    // Costruttore

    public Appliance(String deviceName, String type, int wattage) {
        super(deviceName);
        this.type = type;
        this.wattage = wattage;
    }

    // Getter e Setter
    public String getTipo() {
        return type;
    }

    public int getConsumo() {
        return wattage;
    }

    public void setConsumo(int wattage) {
        this.wattage = wattage;
    }
    public String toString() {
        return super.toString() + 
               "\nTipo: " + type +
               "\nConsumo: " + wattage + "W";
    }
}