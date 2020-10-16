// Following code follows a lessone called Day 2 of Code: Variables & Arithmetic from blondiebytes (YouTube/HackerRank)


public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;
    
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = 'Furiosa';

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    
    int numberOfPeopleInCar = 1;
    
    //Everything above under the class "Car" are considered instance variables.

    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }
    //Custom Car using set parameters

    /* Parameter order is important. Follow a 1-2-3/A-B-C format. First to last ordering.
        f(x) = x + 1;
            x = 5
        f(5) = 5 + 1 = 6
        f(x,y,z) = x +1/z-y;
    */

    public void printVariables() {
        System.out.println("This is the maxSpeed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }

    public void upgradeMinSpeed () {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public void getIn() {
        // numberOfPeopleInCar = numberOfPeopleInCar + 1; below line does the same thing. Increases by one.
        numberOfPeopleInCar++;
    }

    public void getOut() {
        // numberOfPeopleInCar = numberOfPeopleInCar - 1; below line does the same thing. Decreases by one.
        numberOfPeopleInCar--;
    }

    public double emptyTank() {
        return currentFuel * mpg; // Will give you how many miles until you run out of gas.
    }

    public double fullTank() {
        return maxFuel * mpg; // Tells us the max amount of mileage per fill up.
    }

    /*private static void main(String[] args) {
        //Code application logic below.
        Car familyCar = new Car();
        System.out.println("Family's Car");
        familyCar.printVariables();
        familyCar.upgradeMinSpeed();
        //Upgrade changes values of the initial car declarations.
        familyCar.printVariables();
    }*/

    //Commented out text from Day 1 examples for Day 2's lessons.

    // First portion of Day 2 lessons
    //private static void main(String[] args) {
        //Code application logic below.
        //System.out.println("Birthday Car");
        //Car birthdayPresent = new Car(500, 5000.545, true);
        //Variable Car's '10' value is linked to linked to function on line 23.
        //birthdayPresent.printVariables();
        // Below creates a second 'Car'.
        // System.out.println("Christmas Car");
        // Car christmasPresent = new Car(550, 2000, false);
        // christmasPresent.printVariables();
    }

    // Second portion of Day 2 lessons
    private static void main(String[] args) {
        //Code application logic below.
        Car birthdayPresent = new Car(500, 5000.545, true);
        System.out.println("Birthday Car v1");
        birthdayPresent.printVariables();
        birthdayPresent.getIn();
        birthdayPresent.getIn(); //These three represent 3 people getting into the car.
        birthdayPresent.getIn();
        System.out.println("Miles Left:" + birthdayPresent.emptyTank());
        System.out.println("Max Miles:" + birthdayPresent.fullTank());
        System.out.println("Birthday Car v2");
        birthdayPresent.printVariables();
        birthdayPresent.getOut();
        System.out.println("Birthday Car v3");
        birthdayPresent.printVariables();

}
