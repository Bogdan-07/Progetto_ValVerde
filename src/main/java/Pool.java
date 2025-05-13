public class Pool{
    private String poolName;
    private float width;
    private float length;
    private float chlorine;
    private float pH;
    private TempSensor waterSensor;

    //Constructor

    public Pool(String poolName,float width,float length){
        poolName = poolName.toLowerCase();
        this.poolName = poolName;
        this.width = width;
        this.length = length;
        chlorine = (float)(Math.random() * 5);
        pH = (float)(Math.random() * 6.5+2);
        waterSensor = new TempSensor("Temperature sensor");

    }

    // Get

    public String getPoolName() {
        return poolName;
    }
    public float getWidth() {
        return width;
    }
    public float getLength() {
        return length;
    }
    public float getChlorine() {
        return chlorine;
    }
    public float getpH() {
        return pH;
    }
    public TempSensor getWaterTemperature(){
        return waterSensor;
    }

    // toString

    public String toString() {
        return "Pool{" +
                "poolName='" + poolName + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", chlorine=" + chlorine +
                ", pH=" + pH +
                ", waterTemperature=" + waterSensor.getTemp() +
                '}';
    }
}