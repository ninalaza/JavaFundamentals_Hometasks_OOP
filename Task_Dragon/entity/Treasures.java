package by.htp.oop.Task_Dragon.entity;

import java.util.ArrayList;
import java.util.Objects;

public class Treasures {

    private ArrayList<Treasures> listOfTreasures = new ArrayList<>();

    private double price;
    private String name;
    private int index;


    Treasures() {
        this.index = index;
        this.name = name;
        this.price = price;

    }

    Treasures(int index, String name, double price) {
        this.index = index;
        this.name = name;
        this.price = price;

    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ArrayList<Treasures> getListOfTreasures() {
        return listOfTreasures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Treasures treasures = (Treasures) o;
        return Objects.equals(listOfTreasures, treasures.listOfTreasures);
    }

    @Override
    public int hashCode() {

        return Objects.hash(listOfTreasures);
    }

    public void setListOfTreasures(ArrayList<Treasures> listOfTreasures) {
        this.listOfTreasures = listOfTreasures;


    }

    @Override
    public String toString() {
        return "Treasures{" +
                "listOfTreasures=" + listOfTreasures +
                '}';
    }
}
