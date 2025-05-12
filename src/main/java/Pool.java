public class Pool{
    private String poolName;
    private float width;
    private float height;
    private float chlorine;
    private float pH;
    private TempSensor waterSensor;

    //Constructor

    public Pool(String poolName,float width,float height){
        waterSensor = new TempSensor("Temperature sensor");
        chlorine = (float)(Math.random() * 5);
        pH = (float)(Math.random() * 6.5+2);
        this.width = width;
        this.height = height;
    }

    //Setter

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setChlorine(float chlorine) {
        this.chlorine = chlorine;
    }

    public void setpH(float pH) {
        this.pH = pH;
    }

    //Getter

    public String getPoolName() {
        return poolName;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
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

    //toString

    public String toString() {
        return "Pool{" +
                "poolName='" + poolName + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", chlorine=" + chlorine +
                ", pH=" + pH +
                ", waterTemperature=" + waterSensor.getTemp() +
                '}';
    }
}