public class Plane extends PublicTransport {
    public Plane(double distance) {
        super(distance);
    }

    @Override
    public void printInfo() {
        System.out.println("speed Plane:"+speedPlane +"km/h");
        System.out.println("Arrival Time: "+arrivalTime()+"h");
    }

    @Override
    public double arrivalTime() {
        return distance/speedPlane;
    }

    @Override
    public double speed() {
        return speedPlane;
    }
}
