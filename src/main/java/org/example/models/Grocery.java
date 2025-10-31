package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Grocery {
    public static List<String> groceryList = new ArrayList<>();

    public static void addItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            String trimmed = item.trim().toLowerCase();
            if (!groceryList.contains(trimmed)) {
                groceryList.add(trimmed);
            }
        }
        Collections.sort(groceryList);
    }

    public static void removeItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            String trimmed = item.trim().toLowerCase();
            groceryList.remove(trimmed);
        }
        Collections.sort(groceryList);
    }

    public static boolean checkItemIsInList(String product) {
        return groceryList.contains(product.toLowerCase());
    }

    public static void printSorted() {
        Collections.sort(groceryList);
        System.out.println("Your grocery list: " + groceryList);
    }
}
