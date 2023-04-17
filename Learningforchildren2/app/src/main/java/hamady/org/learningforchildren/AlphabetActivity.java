package hamady.org.learningforchildren;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class AlphabetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        String name=getIntent().getStringExtra("name").toLowerCase();
        Toast.makeText(this,name, Toast.LENGTH_SHORT).show();
        ImageView imageView=findViewById(R.id.imageView);

        int iid=getResources().getIdentifier(name, "drawable",getPackageName());
        imageView.setImageResource(iid);

        int mid=getResources().getIdentifier(name, "raw",getPackageName());
        MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(), mid);
        mediaPlayer.start();



    }
}