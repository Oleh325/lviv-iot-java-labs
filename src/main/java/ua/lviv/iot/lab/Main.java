package ua.lviv.iot.lab;

import ua.lviv.iot.lab.model.*;

public class Main {

    public static void main(String[] args) {
        Blanket blanket = new Blanket("BlanketX", 15, "ZKF", 1800, 2, false, 0.4f);
        Flashlight flashlight = new Flashlight("Bree", 40, "LHPR", 800, 0.4f, true, 1.7f);
        Lighter lighter = new Lighter("Oroblam", 6, "MBL", 400, 0.15f, true, 250);
        Tent tent = new Tent("Tent-S", 4, "TMC", 2500, 2, true, 6, 2.5f, 2, "ETI");


    }


}
