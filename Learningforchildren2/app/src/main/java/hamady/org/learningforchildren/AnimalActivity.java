package hamady.org.learningforchildren;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.media.MediaPlayer;
import android.widget.ImageView;
import android.widget.Toast;

public class AnimalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        String name=getIntent().getStringExtra("name").toLowerCase();

        Toast.makeText(this,name, Toast.LENGTH_SHORT).show();

        ImageView Iv=findViewById(R.id.imageView22);
        int  iid= getResources().getIdentifier(name,"drawable",getPackageName());
        Iv.setImageResource(iid);

        int mid=getResources().getIdentifier(name,"raw",getPackageName());

        MediaPlayer mediaPlayer= MediaPlayer.create(getApplicationContext(),mid);
        mediaPlayer.start();



    }



}