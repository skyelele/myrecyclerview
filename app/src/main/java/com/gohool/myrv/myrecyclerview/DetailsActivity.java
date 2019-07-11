package com.gohool.myrvapp.recyclerviewapp;

public class DetailsActivity extends AppCompatActivity {

  private TextView name, description, rating;
  private Bundle extras;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_details);

    extras = getIntent().getExtras();

    name = (TextView) findViewById(R.id.dNameId);
    description = (TextView) findViweById(R.id.dDescriptionID);
    rating = (TextView) findViewById(R.id.dRatingId);

    if (extras != null) {
      name.setText(extras.getString("name"));
      description.setText(extras.getString("description"));
      rating.setText(extras.getString("rating"));
    }
  }
}