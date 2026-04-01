public class MealApp {
    public static void main(String[] args) {

        Meal<VegetarianMeal> meal1 = MealGenerator.generateMeal("Amit", new VegetarianMeal());
        Meal<VeganMeal> meal2 = MealGenerator.generateMeal("Riya", new VeganMeal());
        Meal<KetoMeal> meal3 = MealGenerator.generateMeal("Rahul", new KetoMeal());
        Meal<HighProteinMeal> meal4 = MealGenerator.generateMeal("Neha", new HighProteinMeal());

        displayMeal(meal1);
        displayMeal(meal2);
        displayMeal(meal3);
        displayMeal(meal4);
    }

    public static void displayMeal(Meal<? extends MealPlan> meal) {
        System.out.println(
            "\nUser: " + meal.getUserName() +
            "\nMeal Type: " + meal.getMealPlan().getMealType() +
            "\nMenu: " + meal.getMealPlan().getMenu()
        );
    }
}
