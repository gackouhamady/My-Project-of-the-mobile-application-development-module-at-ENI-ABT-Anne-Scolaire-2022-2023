package hamady.org.learningforchildren;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class LanguageActivity extends AppCompatActivity {

    private Button enBtn;
    private Button frBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        enBtn=findViewById(R.id.eng);
        frBtn=findViewById(R.id.fran);




        enBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                setLanguage("en");
                startActivity(new Intent(LanguageActivity.this,MainActivity.class));
                finish();
            }
        });

        frBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                setLanguage("fr");
                startActivity(new Intent(LanguageActivity.this,MainActivity.class));
                finish();

            }
        });



    }
    public void setLanguage(String languageCode ) {

        Resources resources=this.getResources();
        Configuration configuration=resources.getConfiguration();
        Locale locale=new Locale(languageCode);
        Locale.setDefault(locale);
        configuration.setLocale(locale);
        resources.updateConfiguration(configuration,resources.getDisplayMetrics());


    }


}