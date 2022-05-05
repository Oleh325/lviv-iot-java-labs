package ua.lviv.iot.lab.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tent extends Good {

    private float area;
    private float height;
    private int maxCapacity;
    private String type;

    public Tent(String name, int quantity, String manufacturer, float price,
                   float weight, boolean isForHikingCamping, float area, float height,
                   int maxCapacity, String type) {
        super(name, quantity, manufacturer, price, weight, isForHikingCamping);
        this.area = area;
        this.height = height;
        this.maxCapacity = maxCapacity;
        this.type = type;
    }


    public String getHeaders() {
        return super.getHeaders() + ", area, height, maxCapacity, type";
    }

    public String toCSV() {
        return super.toCSV() + ", " + area + ", " + height + ", " + maxCapacity + ", " + type;
    }
}
