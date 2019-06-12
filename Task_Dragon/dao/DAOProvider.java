package by.htp.oop.Task_Dragon.dao;

import by.htp.oop.Task_Dragon.dao.impl.FileTreasuresDao;

public class DAOProvider {

    private final static DAOProvider  instance = new DAOProvider ();

    private DAOProvider (){}

   private TreasuresDao treasuresDao = new FileTreasuresDao();

    public static DAOProvider getInstance(){
        return instance;
    }

    public TreasuresDao getTreasuresDao() {
        return treasuresDao;
    }
}
