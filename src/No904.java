public class No904 {
    public int totalFruit(int[] fruits) {
        int[] map = new int[fruits.length];
        int counter = 0, max = 0;
        int l = 0, r = 0;
        while (r < fruits.length) {
            int fruitA = fruits[r];
            if (map[fruitA] == 0) counter ++;
            map[fruitA] ++; r ++;
            while (counter > 2) {
                int fruitB = fruits[l];
                if (map[fruitB] == 1) counter --;
                map[fruitB] --; l ++;
            }
            max = Math.max(max, r - l);
        }
        return max;
    }
}
