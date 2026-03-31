public class MealGenerator {

    // Generic Method with Bounded Type Parameter
    public static <T extends MealPlan> Meal<T> generateMeal(String userName, T mealPlan) {
        if (mealPlan == null) {
            throw new IllegalArgumentException("Invalid meal plan selected!");
        }
        System.out.println("Meal plan generated for " + userName);
        return new Meal<>(userName, mealPlan);
    }
}
