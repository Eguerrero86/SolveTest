package com.example.solvetest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.solvetest.shared.UserCase;

@Service
public class GetBestScenarioServiceImpl implements GetBestScenarioService {

    private List<String> inventory;
    private List<Integer> dayInvetory;

    @Override
    public UserCase getBestScenario(UserCase userCase) {
        this.inventory = userCase.getInputCase();
        List<String> bestCases = new ArrayList<>();
        int workdays = getWorkdays();
        
        for (int i = 0; i < workdays; i++) {
            this.dayInvetory = getInventory();
            int numTrips = maximizeNumberOfTrips();
            bestCases.add("Case #" + i + ": "+ numTrips);
        }
        
        userCase.setOutputCase(bestCases);
        return userCase;
    }

    public int getWorkdays() {
        int daysToWork = Integer.parseInt(inventory.get(0));
        inventory.remove(0);
        return daysToWork;
    }

    private int getNumItemsDay() {
        int numItemsDay = Integer.parseInt(inventory.get(0));
        inventory.remove(0);
        return numItemsDay;
    }

    public List<Integer> getInventory() {
        int numItemsDay = getNumItemsDay();
        List<String> subListInventory = inventory.subList(0, numItemsDay);
        List<Integer> inventoryForDay = new ArrayList<>();
        for (String item : subListInventory) {
            inventoryForDay.add(Integer.parseInt(item));
        }
        inventory.subList(0, numItemsDay).clear();
        inventoryForDay = inventoryForDay.stream().sorted().collect(Collectors.toList());
        return inventoryForDay;
    }

    public int maximizeNumberOfTrips() {
        int bagsCount = 0;
        while (!dayInvetory.isEmpty()) {
            List<Integer> bag = new ArrayList<>();
            int haviestItem = getHaviestItem();
            bag.add(haviestItem);
            int totalWeight = calculateWeightBag(haviestItem, bag);
            while (totalWeight < 50 && !dayInvetory.isEmpty()) {
                int lighterItem = getLighterItem();
                bag.add(lighterItem);
                totalWeight = calculateWeightBag(haviestItem, bag);
            }
            bagsCount++;
        }

        return bagsCount;
    }

    private int getHaviestItem() {
        int haviestItem = dayInvetory.get(dayInvetory.size() - 1);
        dayInvetory.remove(dayInvetory.size() - 1);
        return haviestItem;
    }

    private int getLighterItem() {
        int lighterItem = dayInvetory.get(0);
        dayInvetory.remove(0);
        return lighterItem;
    }

    private int calculateWeightBag(int haviestItem, List<Integer> bag) {
        int totalWeight = haviestItem * bag.size();
        return totalWeight;
    }

}
