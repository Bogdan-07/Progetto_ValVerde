public abstract class Sensor{
    private boolean status;

    public Sensor(){
        status=false;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //abstract String toString();
}