public abstract class PublicTransport {
    public PublicTransport(double distance) {
        this.distance = distance;
    }
    public double distance;
    public  abstract void printInfo();
    public  abstract  double arrivalTime();
    public abstract double speed();
    public static final double speedBus =20;
    public static final double speedTrain =40;
    public static final double speedPlane =80;

}
