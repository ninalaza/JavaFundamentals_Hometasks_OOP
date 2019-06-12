package by.htp.oop.Task_Dragon.services;

import by.htp.oop.Task_Dragon.entity.Treasures;
import java.util.List;

public interface TreasuresOperationsService {



   Treasures highestPrice (List<Treasures> treasures);


   List<Treasures> treasuresByPrice(List<Treasures> treasures);

   List<Treasures> viewTreasures (Treasures treasures);

}
