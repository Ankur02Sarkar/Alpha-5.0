package Arrays;

public class BuySellStocks {
    public static int maxProfit(int stocks[]) {
        int maxPrice = Integer.MAX_VALUE;
        int totalProfit = 0;
        for (int i = 0; i < stocks.length; i++) {
            if (stocks[i] < maxPrice) {
                maxPrice = stocks[i];
            } else {
                int currProfit = stocks[i] - maxPrice;
                totalProfit = Math.max(totalProfit, currProfit);
            }
        }
        return totalProfit;
    }

    public static void main(String[] args) {
        int stocks[] = { 7, 1, 2, 7, 5, 6 };
        System.out.println(maxProfit(stocks));
    }
}
