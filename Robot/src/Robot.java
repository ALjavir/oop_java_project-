
class Robot {
    private String name;
    private int yearBuilt;
    private static int robotCounter = 0;
    private double x1, x2, y1, y2;


    public Robot(String name, Integer yearBuilt){
        this.name = name;
        this.yearBuilt = yearBuilt;
        robotCounter++;
    }


    public String getName() {
        return name;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setCoordinates(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    protected double getx1() {
        return x1;
    }

    protected double getx2() {
        return x2;
    }

    protected double gety1() {
        return y1;
    }

    protected double gety2() {
        return y2;
    }

    public double calculateDistanceTraveled(int noOfMovements) {
        System.out.println("This method will be overridden!");
        return 0;
    }

    public void display() {
        System.out.println("Robot: " + name);
        System.out.println("Year Built: " + yearBuilt);
    }

    public static int getRobotCounter() {
        return robotCounter;
    }
}


