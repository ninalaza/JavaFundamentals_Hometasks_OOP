package by.htp.oop.Task_Dragon.services;

import by.htp.oop.Task_Dragon.services.impl.TreasuresOperationsServiceImpl;

public class ServiceProvider {

    private final static ServiceProvider  provider = new ServiceProvider ();

    private ServiceProvider (){}

    private TreasuresOperationsService treasuresOperationsServiceService = new TreasuresOperationsServiceImpl();

    public static ServiceProvider getInstance(){
        return provider;
    }

    public  TreasuresOperationsService getTreasuresOperationsService() {
        return treasuresOperationsServiceService;
    }
}


