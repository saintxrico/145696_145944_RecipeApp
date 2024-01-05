public class MainActivity extends AppCompatActivity {

    private List<Recipe> recipeList;
    private RecyclerView recyclerView;
    private RecipeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize recipeList (you can load it from a database or other sources)
        recipeList = new ArrayList<>();
        recipeList.add(new Recipe("Recipe 1", "Breakfast", 2, "Intermediate",
                Arrays.asList("Ingredient 1", "Ingredient 2"), Arrays.asList("Step 1", "Step 2")));

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecipeAdapter(recipeList, recipe -> {
            // Handle item click, navigate to Recipe Details page
            Intent intent = new Intent(MainActivity.this, RecipeDetailsActivity.class);
            intent.putExtra("recipe", recipe);
            startActivity(intent);
        });
        recyclerView.setAdapter(adapter);
    }
}