class Main {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;
        // calculate discount
        int discount = (10*125000)/100;
        int discountedfee = fee - discount;
        // print discount and discountedfee
        System.out.println("The discount amount is " + discount + " and final discounted fee is " + discountedfee);
        
    }
}