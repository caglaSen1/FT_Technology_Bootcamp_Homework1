package com.patika;

import com.patika.entity.House;
import com.patika.entity.RealEstate;
import com.patika.service.RealEstateService;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RealEstate realEstate = new RealEstate();
        RealEstateService realEstateService = new RealEstateService(realEstate);

        System.out.println("Total price of houses: " + realEstateService.getTotalPriceOfHouses());
        System.out.println("Total price of villas: " + realEstateService.getTotalPriceOfVillas());
        System.out.println("Total price of summer houses: " + realEstateService.getTotalPriceOfSummerHouses());
        System.out.println("Total price of all properties: " + realEstateService.getTotalPriceOfAllProperties());

        System.out.println("Average area of houses: " + realEstateService.getAverageAreaOfHouses());
        System.out.println("Average area of villas: " + realEstateService.getAverageAreaOfVillas());
        System.out.println("Average area of summer houses: " + realEstateService.getAverageAreaOfSummerHouses());
        System.out.println("Average area of all properties: " + realEstateService.getAverageAreaOfAllProperties());

        List<House> filteredHouses = realEstateService.filterPropertiesByRoomsAndLivingRooms(4, 2);
        System.out.println("Houses with 4 rooms and 2 living rooms:");
        for (House house : filteredHouses) {
            System.out.println("Price: " + house.getPrice() + ", Area: " + house.getArea());
        }
    }
}
