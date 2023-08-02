public class PublicTransport extends ListTransport {

    public PublicTransport(double distance) {
        this.distance = distance;
    }

    private  double distance;
    public static final double speedBus =20;
    public static final double speedTrain =40;
    public static final double speedPlane =80;

    @Override
    public void printInfo() {
        System.out.println("Bus Speed:" +speedBus+"km/h");
        System.out.println("Train Speed:"+speedTrain+"km/h");
        System.out.println("Plane Speed:"+speedPlane+"km/h");
        System.out.println("ArriveTimeBus:"+arrivalTimeBus()+" h");
        System.out.println("ArriveTimeTrain:"+arrivalTimeTrain()+" h");
        System.out.println("ArriveTimePlane:"+arrivalTimePlane()+" h");
    }

    @Override
    public double bus() {
        return speedBus;
    }

    @Override
    public double arrivalTimeBus() {
        return distance/speedBus ;
    }

    @Override
    public double train() {
        return speedTrain;
    }

    @Override
    public double arrivalTimeTrain() {
        return distance/speedTrain;
    }

    @Override
    public double plane() {
        return speedPlane;
    }

    @Override
    public double arrivalTimePlane() {
        return distance/speedPlane;
    }
}
