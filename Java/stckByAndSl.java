public class stckByAndSl {

    public static int stockBuyAndSell(int[] prices) {
        int maxPrice = 0;
        int minPrice = Integer.MAX_VALUE;
        for (var i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxPrice = Math.max(maxPrice, prices[i] - minPrice);
        }
        return maxPrice;
    }

    public static void main(String[] args) {

        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int val = stockBuyAndSell(prices);
        System.out.println(val);

    }
}
