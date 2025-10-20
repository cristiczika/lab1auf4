package main.tasks;

public class ShopUtils {

    public static int getCheapestKeyboard(int[] keyboards) {
        int min = keyboards[0];

        for (int i = 0; i < keyboards.length; i++) {
            if (keyboards[i] < min) {
                min = keyboards[i];
            }
        }

        return min;
    }

    public static int getMostExpensiveItem(int[] keyboards, int[] usbs) {
        int max1 = keyboards[0], max2 = usbs[0];
        for (int i = 0; i < keyboards.length; i++) {
            if (keyboards[i] > max1) {
                max1 = keyboards[i];
            }
        }
        for (int i = 0; i < usbs.length; i++) {
            if (usbs[i] > max2) {
                max2 = usbs[i];
            }
        }
        return max1 > max2 ? max1 : max2;
    }

}
