public class RecipeDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_details);

        // Retrieve the selected recipe from the intent
        Recipe recipe = getIntent().getParcelableExtra("recipe");

        // Display the recipe details in the UI
        TextView titleTextView = findViewById(R.id.recipeTitleTextView);
        TextView typeTextView = findViewById(R.id.recipeTypeTextView);
        TextView servingsTextView = findViewById(R.id.recipeServingsTextView);
        TextView difficultyTextView = findViewById(R.id.recipeDifficultyTextView);
        TextView ingredientsTextView = findViewById(R.id.recipeIngredientsTextView);
        TextView stepsTextView = findViewById(R.id.recipeStepsTextView);

        titleTextView.setText(recipe.getTitle());
        typeTextView.setText("Type: " + recipe.getType());
        servingsTextView.setText("Servings: " + recipe.getServings());
        difficultyTextView.setText("Difficulty: " + recipe.getDifficulty());

        // Convert ingredients and steps lists to formatted strings
        String ingredients = TextUtils.join("\n", recipe.getIngredients());
        String steps = TextUtils.join("\n", recipe.getSteps());

        ingredientsTextView.setText("Ingredients:\n" + ingredients);
        stepsTextView.setText("Steps:\n" + steps);
    }
}