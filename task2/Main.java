package by.htp.oop.task2;

public class Main {
//    Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 public static void main(String [] args){

     CarLogic carLogic = new CarLogic();
     Car car = new Car();
     car.setName("Opel");


     carLogic.printName (car);



 }

}
