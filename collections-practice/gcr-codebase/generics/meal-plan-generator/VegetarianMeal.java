public class VegetarianMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegetarian";
    }
    @Override
    public String getMenu() {
        return "Paneer Curry, Dal, Rice, Salad";
    }
}
