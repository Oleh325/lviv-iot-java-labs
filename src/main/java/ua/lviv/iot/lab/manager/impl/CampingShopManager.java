package ua.lviv.iot.lab.manager.impl;

import lombok.Getter;
import ua.lviv.iot.lab.manager.ICampingShopManager;
import ua.lviv.iot.lab.model.Good;

import java.util.*;
import java.util.stream.Collectors;

@Getter
public class CampingShopManager implements ICampingShopManager {

    private List<Good> goodsList = new LinkedList<>();

    @Override
    public void addGoods(List<Good> goods) {
        goodsList.addAll(goods);
    }

    @Override
    public List<Good> findForHikingCamping() {
        List<Good> result = new LinkedList<>();

        goodsList.forEach(good -> {
            if (good.isForHikingCamping()) {
                result.add(good);
            }
        });

        return result;
    }

    @Override
    public List<Good> findByName(String name) {
        List<Good> result = new LinkedList<>();

        goodsList.forEach(good -> {
            if (Objects.equals(good.getName(), name)) {
                result.add(good);
            }
        });

        return result;
    }

    @Override
    public void sortGoodsByWeight(boolean isDescending) {
        if (isDescending) {
            goodsList = goodsList.stream()
                    .sorted(Comparator.comparing(Good::getWeightInKilos).reversed())
                    .collect(Collectors.toList());
        } else {
            goodsList = goodsList.stream()
                    .sorted(Comparator.comparing(Good::getWeightInKilos))
                    .collect(Collectors.toList());
        }
    }

    @Override
    public void sortGoodsByName(boolean isDescending) {
        if (isDescending) {
            goodsList = goodsList.stream()
                    .sorted(Comparator.comparing(Good::getName).reversed())
                    .collect(Collectors.toList());
        } else {
            goodsList = goodsList.stream()
                    .sorted(Comparator.comparing(Good::getName))
                    .collect(Collectors.toList());
        }
    }

}
