public class Train extends PublicTransport {
    public Train(double distance) {
        super(distance);
    }

    @Override
    public void printInfo() {
        System.out.println("speed Train:"+speedTrain +"km/h");
        System.out.println("Arrival Time: "+arrivalTime()+"h");
    }

    @Override
    public double arrivalTime() {
        return distance/speedTrain;
    }

    @Override
    public double speed() {
        return speedTrain;
    }
}
