package by.htp.oop.Task_Dragon.services.impl;

import by.htp.oop.Task_Dragon.dao.DAOProvider;
import by.htp.oop.Task_Dragon.dao.TreasuresDao;
import by.htp.oop.Task_Dragon.dao.impl.FileTreasuresDao;
import by.htp.oop.Task_Dragon.entity.Treasures;
import by.htp.oop.Task_Dragon.services.TreasuresOperationsService;
import java.util.List;

public class TreasuresOperationsServiceImpl implements TreasuresOperationsService {



    @Override
    public Treasures highestPrice(List<Treasures> treasures) {
        DAOProvider instance = DAOProvider.getInstance();
        TreasuresDao treasuresDao = instance.getTreasuresDao();
        treasuresDao.getListOfTreasure();

// Validation
        return null;
    }

    @Override
    public List<Treasures> treasuresByPrice(List<Treasures> treasures) {
        DAOProvider instance = DAOProvider.getInstance();
        TreasuresDao treasuresDao = instance.getTreasuresDao();

        treasuresDao.getListOfTreasure();


        //Validation
        return null;
    }


    @Override
    public List<Treasures> viewTreasures(Treasures treasures) {
        DAOProvider instance = DAOProvider.getInstance();
        TreasuresDao treasuresDao = instance.getTreasuresDao();

        if (treasures == null) {

            return null;
        }

        return null;
    }
}

