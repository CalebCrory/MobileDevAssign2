package com.example.mobiledevassign2;

import java.util.ArrayList;
import java.util.List;

public class GlobalLists {
    public static List<String> itemList = new ArrayList<>();
    public static List<String> calorieList= new ArrayList<>();
    public static int kcal;

    public static void clearItemList() {
        itemList.clear();
    }

    public static void clearCalorieList() {
        calorieList.clear();
    }

    public static int getKcal() {
        return kcal;
    }

    public static void setKcal(int n) {
        kcal += n;
    }

    public static void resetKcal(int n) {
        kcal = kcal * n;
    }
}

