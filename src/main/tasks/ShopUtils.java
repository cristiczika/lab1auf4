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

}
