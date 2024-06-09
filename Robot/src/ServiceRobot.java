class ServiceRobot extends Robot {
    private double batteryCapacity;
    private double chargingRate;

    public ServiceRobot(String name, Integer yearBuilt, double batteryCapacity, double chargingRate) {
        super(name, yearBuilt);
        this.batteryCapacity = batteryCapacity;
        this.chargingRate = chargingRate;
    }
               
    @Override
    public void display() {
        super.display();
        System.out.println("Battery Capacity: " + batteryCapacity + " Ah with a charging rate of " + chargingRate);
    }                                                                           
    @Override
    public double calculateDistanceTraveled(int noOfMovements) {
        double totalDistance = 0;
        for (int i = 0; i < noOfMovements; i++) {
            double distance = Math.abs(getx1() - getx2()) + Math.abs(gety1() - gety2());
            totalDistance += distance;
        }
        return Math.round(totalDistance);
    }

    public double calculateTimeToRecharge() {
        double timeToRecharge = batteryCapacity / chargingRate;
        return Math.round(timeToRecharge);
    }
}

