package Arrays;

public class TrappingRainwater {
    public static int trappedRainwater(int heights[]) {
        int n = heights.length;
        // calc left max boundary -- array
        int leftMax[] = new int[n];
        leftMax[0] = heights[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(heights[i], leftMax[i - 1]);
        }

        // calc right max boundary -- array
        int rightMax[] = new int[n];
        rightMax[n - 1] = heights[n - 1];
        for (int i = n - 2; i > 0; i--) {
            rightMax[i] = Math.max(heights[i], rightMax[i + 1]);
        }
        // waterLevel = min(leftMax, rightMax)
        // trappedWater = waterLevel - heights[i]
        int totalTrappedWater = 0;
        for (int i = 0; i < n; i++) {
            int currTrappedWater = Math.min(leftMax[i], rightMax[i]);
            totalTrappedWater += currTrappedWater - heights[i];
        }
        return totalTrappedWater;
    }

    public static void main(String[] args) {
        int heights[] = { 2, 3, 5, 0, 5, 1, 0, 7 };
        System.out.println(trappedRainwater(heights));
    }
}
