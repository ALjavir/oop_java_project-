class RacingBot extends Robot {
    private double initialVelocity;
    private double distanceTravelTime;

    public RacingBot(String name, Integer yearBuilt, double initialVelocity, double distanceTravelTime) {
        super(name, yearBuilt);
        this.initialVelocity = initialVelocity;
        this.distanceTravelTime = distanceTravelTime;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("With initial velocity of " + initialVelocity + " " + getName() +
                " took " + distanceTravelTime + " unit of time to move.");
    }

    @Override
    public double calculateDistanceTraveled(int noOfMovements) {
        double totalDistance = 0;
        for (int i = 0; i < noOfMovements; i++) {
            double distance = Math.sqrt(Math.pow((getx1() - getx2()), 2) + Math.pow((gety1() - gety2()), 2));
            totalDistance += distance;
        }
        return Math.round(totalDistance * 100.0) / 100.0;
    }

    public double calculateAcceleration(double accelerationTime, int noOfMovements) {
        double finalVelocity = calculateDistanceTraveled(noOfMovements) / distanceTravelTime;
        double acceleration = (finalVelocity - initialVelocity) / accelerationTime;
        return Math.round(acceleration * 100.0) / 100.0;
    }

}
