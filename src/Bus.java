public  class Bus extends PublicTransport {
    public Bus(double distance) {
        super(distance);
    }

    @Override
    public void printInfo() {
        System.out.println("speed Bus:"+speedBus +"km/h");
        System.out.println("Arrival Time: "+arrivalTime()+"h");
    }

    @Override
    public double arrivalTime() {
        return distance/speedBus;
    }

    @Override
    public double speed() {
        return speedBus;
    }

}
