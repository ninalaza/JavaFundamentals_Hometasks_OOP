package by.htp.oop.task2;

import java.util.Objects;

public class Engine {
 double volume;

 Engine (){

     this.volume = volume;
 }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Double.compare(engine.volume, volume) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(volume);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                '}';
    }
}
