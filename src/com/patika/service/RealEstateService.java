package com.patika.service;

import com.patika.entity.House;
import com.patika.entity.RealEstate;
import java.util.ArrayList;
import java.util.List;

public class RealEstateService {
    private RealEstate realEstate;

    public RealEstateService(RealEstate realEstate) {
        this.realEstate = realEstate;
    }

    public double getTotalPriceOfHouses() {
        return realEstate.getHouseList().stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfVillas() {
        return realEstate.getVillaList().stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfSummerHouses() {
        return realEstate.getSummerHouseList().stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfAllProperties() {
        return getTotalPriceOfHouses() + getTotalPriceOfVillas() + getTotalPriceOfSummerHouses();
    }

    public double getAverageAreaOfHouses() {
        return realEstate.getHouseList().stream().mapToDouble(House::getArea).average().orElse(0);
    }

    public double getAverageAreaOfVillas() {
        return realEstate.getVillaList().stream().mapToDouble(House::getArea).average().orElse(0);
    }

    public double getAverageAreaOfSummerHouses() {
        return realEstate.getSummerHouseList().stream().mapToDouble(House::getArea).average().orElse(0);
    }

    public double getAverageAreaOfAllProperties() {
        List<House> allProperties = new ArrayList<>();
        allProperties.addAll(realEstate.getHouseList());
        allProperties.addAll(realEstate.getVillaList());
        allProperties.addAll(realEstate.getSummerHouseList());
        return allProperties.stream().mapToDouble(House::getArea).average().orElse(0);
    }

    public List<House> filterPropertiesByRoomsAndLivingRooms(int numberOfRooms, int numberOfLivingRooms) {
        List<House> allProperties = new ArrayList<>();
        allProperties.addAll(realEstate.getHouseList());
        allProperties.addAll(realEstate.getVillaList());
        allProperties.addAll(realEstate.getSummerHouseList());

        return allProperties.stream()
                .filter(h -> h.getNumberOfRooms() == numberOfRooms && h.getNumberOfLivingRooms() == numberOfLivingRooms)
                .toList();
    }
}
