package toys_lottery.toys;

import java.util.ArrayList;

public class ListOfToys {

    public static ArrayList<Toys> getListOfToys(){
        /**
         * Для примера собираем 5 объектов класса Toys и добовляем их в список.
         */

        ArrayList<Toys> listOfToys = new ArrayList<>();

        listOfToys.add(new Toys(1, "ПатПат", 2, 25));
        listOfToys.add(new Toys(2, "Кря-Кря", 4, 40));
        listOfToys.add(new Toys(3, "Жмяк", 30, 80));
        listOfToys.add(new Toys(4, "Круть - верть", 25, 95 ));
        listOfToys.add(new Toys(5, "Трансморфер Спотыкающаяся пчела", 20, 60));

        return listOfToys;
    }
}
