package by.htp.oop.Task_Dragon.dao;

import by.htp.oop.Task_Dragon.entity.Treasures;
import java.util.List;

public interface TreasuresDao {

    List<Treasures> getListOfTreasure();

    List<Treasures> setListOfTreasure();

//    List<Treasures> getTreasuresForCurrentPrice(double price);
//
//    List<Treasures> getTheMostExpenciveTreasure(double price);

    //void addTreasure(Treasures treasure);


}
