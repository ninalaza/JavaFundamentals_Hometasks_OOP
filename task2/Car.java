package by.htp.oop.task2;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.Objects;

public class Car {




    private String name;

    private Wheel wheels [] = new Wheel[4] ;

    private Engine engine = new Engine();

    private boolean isStarted = false;

    private  boolean  tankIsEmpty  = false;



    public boolean isTankIsEmpty() {


        return tankIsEmpty;
    }

    public void fillingOfPetroll(){

        System.out.println("Fill your tank");

        tankIsEmpty = false;
    }

    public boolean isStarted(){

        return isStarted;
    }


    public void startEngine(){
        System.out.println("Starting engine.....");
        isStarted = true;
    }


   public Car (){
       for (int i = 0; i< wheels.length; i++){
           wheels [i] = new Wheel ();

       }
   }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }


    public Wheel getWheel(int index) {
        return wheels[index];
    }

    public void setWheel(int index, Wheel wheel) {
        wheels[index] = wheel ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return isStarted == car.isStarted &&
                tankIsEmpty == car.tankIsEmpty &&
                Objects.equals(name, car.name) &&
                Arrays.equals(wheels, car.wheels) &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(name, engine, isStarted, tankIsEmpty);
        result = 31 * result + Arrays.hashCode(wheels);
        return result;
    }
}
