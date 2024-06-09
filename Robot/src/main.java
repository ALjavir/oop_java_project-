import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        RacingBot ferrariBot = new RacingBot("FerrariBOT", 2016, 2.0, 2.0);
        ferrariBot.setCoordinates(1.0, 2.0, 3.0, 4.0);
        ServiceRobot wallE = new ServiceRobot("WallE", 2009, 200.0, 2.4);
        wallE.setCoordinates(1.0, 2.0, 8.0, 5.0);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of movements: ");
        int noOfMovements = scanner.nextInt();

        ferrariBot.display();
        System.out.println("Distance traveled by FerrariBOT: " + ferrariBot.calculateDistanceTraveled(noOfMovements));

        double accelerationTime = 10;
        System.out.println(
                "Acceleration of FerrariBOT: " + ferrariBot.calculateAcceleration(accelerationTime, noOfMovements));

        
        wallE.display();
        System.out.println("Distance traveled by WallE: " + wallE.calculateDistanceTraveled(noOfMovements));

        System.out.println("Time to recharge for WallE: " + wallE.calculateTimeToRecharge());

        
        printTotalRobots();

    }

    public static void printTotalRobots() {
        System.out.println("Total robots created: " + Robot.getRobotCounter());
    }

}
