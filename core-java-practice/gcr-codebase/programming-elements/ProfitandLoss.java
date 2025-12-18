class Main {
    public static void main(String[] args) {
        int costprice = 129;
        int sellingprice = 191;
        int profit = sellingprice - costprice;
        float percentage = ((float) profit / costprice) * 100;
        //calculate profit and profit percentage
        System.out.println("The Cost Price is 129 and Selling Price is 191");
        System.out.println("The Profit is " + profit + " and the profit Percentage is " + percentage);
    }
}