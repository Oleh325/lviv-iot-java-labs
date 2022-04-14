package ua.lviv.iot.lab.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Blanket extends Good {

    private float thickness;

    public Blanket(String name, int quantity, String manufacturer, float price,
                   float weight, boolean isForHikingCamping, float thickness) {
        super(name, quantity, manufacturer, price, weight, isForHikingCamping);
        this.thickness = thickness;
    }
}