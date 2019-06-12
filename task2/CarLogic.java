package by.htp.oop.task2;

import java.util.ArrayList;
import java.util.List;

public class CarLogic {

    Car car = new Car();

    ArrayList<Car> carElements = new ArrayList<>();


    public void buildCar() {
        carElements.add(new Car());
    }

    public void going(Car car) {
        if (car.isStarted()) {
            System.out.println("Car is ready to start");
        } else {
            System.out.println(" Please, start your car engine");
            car.startEngine();
            System.out.println("Engine started successfully.");
        }
    }

    public void fillCar(Car car) {

        if (car.isTankIsEmpty()) {
            car.fillingOfPetroll();
        } else {
            System.out.println("You have enough petrol");
        }
    }



    public void printName(Car car) {

        System.out.println(car.getName());
    }


    public void changeWheel(Car car, int index) {

        Wheel wheel1 =  car.getWheel(1);
        Wheel wheel2 =  car.getWheel(2);

        Wheel wheel3 =  car.getWheel(3);
        Wheel wheel4 =  car.getWheel(4);

        Wheel [] wheels = new Wheel []{wheel1,wheel2, wheel3, wheel4};

        car.setWheels(wheels);

        car.getWheel(1);
        car.setWheel(1, new Wheel());




    }


}
