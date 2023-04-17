package hamady.org.learningforchildren;

import android.os.Bundle;
import android.widget.ImageView;
import android.content.Intent;


import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;
    private ImageView imageView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.image_view1);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The user just clicked
                Intent intent = new Intent(MainActivity.this, AlphabetMain.class);
                startActivity(intent);

            }
        });


        imageView2 = findViewById(R.id.image_view2);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The user just clicked
                Intent intent = new Intent(MainActivity.this, ColorMain.class);
                startActivity(intent);

            }
        });

        imageView3 = findViewById(R.id.image_view3);

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The user just clicked
                Intent intent = new Intent(MainActivity.this,  NumberMain.class);
                startActivity(intent);

            }
        });

        imageView4 = findViewById(R.id.image_view4);

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The user just clicked
                Intent intent = new Intent(MainActivity.this,  AnimalMain.class);
                startActivity(intent);

            }
        });




        imageView5 = findViewById(R.id.image_view5);

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The user just clicked
                Intent intent = new Intent(MainActivity.this, FruitMain.class);
                startActivity(intent);

            }
        });

        imageView6 = findViewById(R.id.image_view6);

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The user just clicked
                Intent intent = new Intent(MainActivity.this,   LanguageActivity.class);
                startActivity(intent);
                finish();

            }
        });




    }


}