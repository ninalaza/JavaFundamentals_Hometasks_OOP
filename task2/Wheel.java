package by.htp.oop.task2;

import java.util.Objects;

public class Wheel {

    private double radius;
    private String order;
    private String side;

    Wheel(double radius, String order, String side) {
        this.radius = radius;
        this.order = order;
        this.side = side;
    }

    Wheel() {
        this.radius = radius;
        this.order = order;
        this.side = side;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return Double.compare(wheel.radius, radius) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                '}';
    }
}