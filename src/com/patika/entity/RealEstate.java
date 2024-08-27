package com.patika.entity;

import java.util.ArrayList;
import java.util.List;

public class RealEstate {
    private List<House> houseList;
    private List<Villa> villaList;
    private List<SummerHouse> summerHouseList;

    public RealEstate() {
        houseList = new ArrayList<>();
        villaList = new ArrayList<>();
        summerHouseList = new ArrayList<>();

        houseList.add(new House(50000, 120, 3, 1));
        houseList.add(new House(60000, 130, 3, 2));
        houseList.add(new House(70000, 150, 4, 1));

        villaList.add(new Villa(15000, 300, 5, 2));
        villaList.add(new Villa(20000, 350, 6, 3));
        villaList.add(new Villa(25000, 400, 7, 3));

        summerHouseList.add(new SummerHouse(80000, 200, 4, 2));
        summerHouseList.add(new SummerHouse(90000, 210, 4, 2));
        summerHouseList.add(new SummerHouse(100000, 220, 5, 2));
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public List<Villa> getVillaList() {
        return villaList;
    }

    public List<SummerHouse> getSummerHouseList() {
        return summerHouseList;
    }
}
