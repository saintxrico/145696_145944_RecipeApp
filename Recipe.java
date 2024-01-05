public class Recipe {
    private String title;
    private String type;
    private int servings;
    private String difficulty;
    private List<String> ingredients;
    private List<String> steps;

    // Constructors, getters, and setters

    // Constructor example
    public Recipe(String title, String type, int servings, String difficulty,
                  List<String> ingredients, List<String> steps) {
        this.title = title;
        this.type = type;
        this.servings = servings;
        this.difficulty = difficulty;
        this.ingredients = ingredients;
        this.steps = steps;
    }
}