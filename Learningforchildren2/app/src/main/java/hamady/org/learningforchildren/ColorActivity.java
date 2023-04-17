package hamady.org.learningforchildren;



import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        String name=getIntent().getStringExtra("name").toLowerCase();

        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();

        ImageView Iv=findViewById(R.id.imageView2_c);
        int  iid= getResources().getIdentifier(name,"drawable",getPackageName());
        Iv.setImageResource(iid);

        int mid=getResources().getIdentifier(name,"raw",getPackageName());

        MediaPlayer mediaPlayer= MediaPlayer.create(getApplicationContext(),mid);
        mediaPlayer.start();



    }
}