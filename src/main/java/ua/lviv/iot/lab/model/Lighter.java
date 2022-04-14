package ua.lviv.iot.lab.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lighter extends Good {

    private float gasQuantity;

    public Lighter(String name, int quantity, String manufacturer, float price,
                      float weight, boolean isForHikingCamping, float gasQuantity) {
        super(name, quantity, manufacturer, price, weight, isForHikingCamping);
        this.gasQuantity = gasQuantity;
    }
}
