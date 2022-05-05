package ua.lviv.iot.lab.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flashlight extends Good {

    private float brightness;

    public Flashlight(String name, int quantity, String manufacturer, float price,
                   float weight, boolean isForHikingCamping, float brightness) {
        super(name, quantity, manufacturer, price, weight, isForHikingCamping);
        this.brightness = brightness;
    }

    public String getHeaders() {
        return super.getHeaders() + ", brightness";
    }

    public String toCSV() {
        return super.toCSV() + ", " + brightness;
    }
}
