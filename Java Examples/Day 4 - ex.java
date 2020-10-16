// public class Day 4 ex {
    
//}

// Following code follows a lessone called Day 2 of Code: Variables & Arithmetic from blondiebytes (YouTube/HackerRank)


public class Car {

    // Speed paramaters
    int maxSpeed = 100;
    int minSpeed = 0;

    // Weight parameters
    double weight = 4079;
    
    // Car's condition
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = 'Furiosa';

    // Car Fuel parameters
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    
    // Car capacity    
    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;

    public Car () {

    }
    
    //Everything above under the class "Car" are considered instance variables.
    //Below is a custom constructor that allows for seperate instances.
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

    // Day 4's coding tutorial starts below.
    // Getters and Setters (a cleaner way of writing code)

    public getMaxSpeed() {
        return this.maxSpeed;
    }

    // Setting a new Max Speed
    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }

    public int getMinSpeed() {
        return this.minSpeed;
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean isTheCarOn() {
        return this.isTheCarOn;
    }


    // Day 4's coding briefly stops here. 


    public void printVariables() {
        System.out.println("This is the maxSpeed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }

    // Changed in Day 4
    public void upgradeMaxSpeed () {
        setMaxSpeed(getMaxSpeed() + 10);
    } // Much easier for debugging and a lot cleaner.
    
    
    
    
    
    
    // Below was part of Day 3 and prior's info
    /*public void upgradeMinSpeed () {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }*/

    public void getIn() {
        // numberOfPeopleInCar = numberOfPeopleInCar + 1; below line does the same thing. Increases by one.
        // If there's room in the car...
        if (numberOfPeopleInCar < maxNumberOfPeopleInCar) {
            // someone else can get it...ELSE...
            numberOfPeopleInCar++;
        } else { //Notifies reader car is at capacity.
            // Message prints out that the car is full.
            System.out.println("The car is full!" + numberOfPeopleInCar + " = " + maxNumberOfPeopleInCar);
        }
    }

    public void getOut() {
        // numberOfPeopleInCar = numberOfPeopleInCar - 1; below line does the same thing. Decreases by one.
        // If there's people in the car...
        if (numberOfPeopleInCar > 0) { // Setting this to greater than 0 stops 'negative amounts' of people from leaving car.
            // then tell one person to get out...
            numberOfPeopleInCar--;
        } else {
            // otherwise no one can get out and it prints the message below.
            System.out.print("No one is in the car. " + numberOfPeopleInCar);
        }
        System.out.println(numberOfPeopleInCar) //Shows how many people have gotten out of the car.
    }

    public double emptyTank() {
        return currentFuel * mpg; // Will give you how many miles until you run out of gas.
    }

    public double fullTank() {
        return maxFuel * mpg; // Tells us the max amount of mileage per fill up.
    }

    //Day 3 Example below : Stops at
    public void turnTheCarOn() {    //Using the if Statement to say if off turn on, if on do nothing.
        // If the car isn't on...
        if (!isTheCarOn) {          //This functions similarly to stating if(isTheCarOn == false)
            // Turn on the car...
            isTheCarOn = true;
        } else {
            // Otherwise print out the fact it's on.
            System.out.println("The Car is already on" + isTheCarOn);
        } 
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

    // First portion of Day 2 lessons /*
    /*private static void main(String[] args) {
        //Code application logic below.
        System.out.println("Birthday Car");
        Car birthdayPresent = new Car(500, 5000.545, true);
        Variable Car's '10' //value is linked to linked to the full function "public car".
        birthdayPresent.printVariables();
        //Below creates a second 'Car'.
        System.out.println("Christmas Car");
        Car christmasPresent = new Car(550, 2000, false);
        christmasPresent.printVariables();
    } */

    // Second portion of Day 2 lessons
    /*private static void main(String[] args) {
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
        */
    
    public static void main(String[] args) {
        Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn(); // Getting in and out of Tommy's car.
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();
        // tommyCar.turnTheCarOn(); - If this is uncommented, the double entry will throw issue since the car is already on. 
    }

}
