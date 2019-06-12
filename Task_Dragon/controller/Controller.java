package by.htp.oop.Task_Dragon.controller;

import by.htp.oop.Task_Dragon.entity.Treasures;
import by.htp.oop.Task_Dragon.services.ServiceProvider;
import by.htp.oop.Task_Dragon.services.TreasuresOperationsService;
import java.util.List;

public class Controller {



    public String doAction(String request) {
        String[] params = request.split("\\s+");

        ServiceProvider provider = ServiceProvider.getInstance();


        switch (params[0]) {

            case "highestPrice":
                TreasuresOperationsService service = provider.getTreasuresOperationsService();
                // Treasures treasures = service.highestPrice();

                break;

            case "treasuresByPrice":

                break;

            case "viewTreasures":

                break;

        }
return null;

    }}



