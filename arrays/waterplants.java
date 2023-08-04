// Watering Plants

class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int step = 0, c = capacity;
        for (int i = 0; i < plants.length; i++) {
            if (c >= plants[i]) {
                c -= plants[i];
                step++;
            }
            else {
                step += (i * 2 + 1);
                c = capacity - plants[i];
            }
        }
        return step;
    }
}
