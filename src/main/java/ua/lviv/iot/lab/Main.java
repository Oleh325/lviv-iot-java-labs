package ua.lviv.iot.lab;

import ua.lviv.iot.lab.manager.impl.CampingShopManager;
import ua.lviv.iot.lab.model.*;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Blanket blanket = new Blanket("BlanketX", 15, "ZKF", 1800, 2, false, 0.4f);
        Flashlight flashlight = new Flashlight("Bree", 40, "LHPR", 800, 0.4f, true, 1.7f);
        Lighter lighter = new Lighter("Oroblam", 6, "MBL", 400, 0.15f, true, 250);
        Tent tent = new Tent("Tent-S", 4, "TMC", 2500, 2, true, 6, 2.5f, 2, "ETI");

        CampingShopManager shopManager = new CampingShopManager();

        List<Good> goodsList = new LinkedList<>();
        goodsList.add(blanket);
        goodsList.add(flashlight);
        goodsList.add(lighter);
        goodsList.add(tent);

        shopManager.addGoods(goodsList);
        System.out.println("All goods: ");
        goodsList.forEach(good -> {System.out.println(good);});
        System.out.println("\n");

        System.out.println("Sorted goods by weight in ascending order: ");
        shopManager.sortGoodsByWeight(false);
        System.out.println(shopManager.getGoodsList());
        System.out.println("\n");
        System.out.println("Sorted goods by weight in descending order: ");
        shopManager.sortGoodsByWeight(true);
        System.out.println(shopManager.getGoodsList());
        System.out.println("\n");
        System.out.println("Sorted goods by name in ascending order: ");
        shopManager.sortGoodsByName(false);
        System.out.println(shopManager.getGoodsList());
        System.out.println("\n");
        System.out.println("Sorted goods by name in descending order: ");
        shopManager.sortGoodsByName(true);
        System.out.println(shopManager.getGoodsList());
        System.out.println("\n");
        System.out.println("Find good by name Bree: ");
        System.out.println(shopManager.findByName("Bree"));

    }


}
