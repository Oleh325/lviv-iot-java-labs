package ua.lviv.iot.lab.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Good {

    private String name;
    private int quantity;
    private String manufacturer;
    private float priceInUAH;
    private float weightInKilos;
    private boolean isForHikingCamping;

    public String getHeaders() {
        return "name, quantity, manufacturer, priceInUAH, weightInKilos, isForHikingCamping";
    }

    public String toCSV() {
        return name + ", " + quantity + ", " + manufacturer + ", "
                + priceInUAH + ", " + weightInKilos + ", " + isForHikingCamping;
    }
}
