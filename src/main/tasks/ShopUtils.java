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

    public static int getMostExpensiveUsbWithinBudget(int[] usbs, int budget) {
        int best = -1;
        for (int i = 0; i < usbs.length; i++) {
            if (usbs[i] > best && usbs[i] <= budget) {
                best = usbs[i];
            }
        }
        return best;
    }

    public static int getMaxSpend(int[] keyboards, int[] usbs, int budget) {
        int best = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < usbs.length; j++) {
                int total = keyboards[i] + usbs[j];
                if (total <= budget && total > best) {
                    best = total;
                }
            }
        }
        return best;
    }

}
