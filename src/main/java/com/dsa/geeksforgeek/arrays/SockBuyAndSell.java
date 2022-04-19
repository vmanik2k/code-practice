package com.dsa.geeksforgeek.arrays;

public class SockBuyAndSell {

    //i/p {1,5,3,8,12}
    // o/p :13

    //{30,20,10}
    //o/p 0

    //{10,20,30}
    //o/p 20

    //{1,5,3,1,2,8}
    //11
    public static int maxProfitStock(int[] arr, int start, int end) {

        if (end <= start)
            return 0;

        int profit = 0;
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (arr[j] > arr[i]) {
                    int currentProfit = arr[j] - arr[i]
                            + maxProfitStock(arr, start, i - 1)
                            + maxProfitStock(arr, j + 1, end);
                    profit = Math.max(currentProfit, profit);
                }
            }
        }
        return profit;
    }

    //Eficient solution
    public static int maxProfitBuySellStock(int[] arr, int start, int end) {
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                profit = profit + (arr[i] - arr[i - 1]);
            }
        }
        return profit;
    }


    public static void main(String[] args) {
         int[] arr = new int[]{1, 5, 3, 8, 12};
        //int[] arr = new int[]{30,20,10};
        //int[] arr = new int[]{10, 20, 30};

        System.out.println(maxProfitBuySellStock(arr, 0, arr.length - 1));
    }
}
