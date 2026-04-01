class Main {
    public static void main(String[] args) {
        // radius in km
        double radiusk = 6378;
        // radius in miles
        double radiusm = 1.6 * 6378; 
        // calculate in km
        double volumek = (4/3) * 3.14 * radiusk*radiusk*radiusk;
        // calculate in miles
        double volumem = (4/3) * 3.14 * radiusm*radiusm*radiusm;
        // print volume in km and miles
        System.out.println("The volume of earth in cubic kilometers is " + volumek + " and cubic miles is " + volumem);
        
    }
}