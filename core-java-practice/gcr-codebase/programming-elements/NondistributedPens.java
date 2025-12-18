class Main {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;
        // calculate pen per student and remaining pen
        int penperstudent = totalPens / students;
        int remainingpen = totalPens % students ;
        System.out.println("The Pen Per Student is " + penperstudent +  " and the remaining pen not distributed is " + remainingpen);
        
    }
}