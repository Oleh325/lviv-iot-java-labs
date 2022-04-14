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
    private float price;
    private float weight;
    private boolean isForHikingCamping;

}
