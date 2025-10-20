package main.app;

import main.tasks.ShopUtils;

public class Main {

    static void main() {
        IO.println("------- Aufgabe 4 --------");
        int[] keyboards1 = {40, 35, 70, 15, 45};
        IO.println(ShopUtils.getCheapestKeyboard(keyboards1));
        int[] keyboards2 = {15, 20, 10, 35}, usbs = {20, 15, 40, 15};
        IO.println(ShopUtils.getMostExpensiveItem(keyboards2, usbs));
        int[] preise = {15, 45, 20};
        IO.println(ShopUtils.getMostExpensiveUsbWithinBudget(preise,30));
        int[] tastaturen = {40, 50, 60}, usb_laufwerke = {8, 12};
        IO.println(ShopUtils.getMaxSpend(tastaturen, usb_laufwerke, 60));
    }

}