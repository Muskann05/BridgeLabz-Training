public class ZaraBonus {

    // Generate salary and years of service
    static int[][] getEmployeeData() {
        int[][] data = new int[10][2];

        for (int i = 0; i < 10; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000; // salary
            data[i][1] = (int)(Math.random() * 10) + 1;       // years
        }
        return data;
    }

    // Calculate new salary and bonus
    static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[10][2];

        for (int i = 0; i < 10; i++) {
            int salary = data[i][0];
            int years = data[i][1];

            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;

            result[i][0] = salary + bonus; // new salary
            result[i][1] = bonus;
        }
        return result;
    }

    // Display result
    static void display(int[][] oldData, double[][] newData) {
        double totalBonus = 0;

        System.out.println("Emp  OldSalary  Years  Bonus  NewSalary");

        for (int i = 0; i < 10; i++) {
            totalBonus += newData[i][1];
            System.out.println((i+1) + "    " + oldData[i][0] + "      "
                    + oldData[i][1] + "    " + newData[i][1]
                    + "   " + newData[i][0]);
        }

        System.out.println("\nTotal Bonus = " + totalBonus);
    }

    public static void main(String[] args) {
        int[][] employeeData = getEmployeeData();
        double[][] newData = calculateBonus(employeeData);
        display(employeeData, newData);
    }
}
