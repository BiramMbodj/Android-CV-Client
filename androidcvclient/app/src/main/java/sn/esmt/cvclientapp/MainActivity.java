package sn.esmt.cvclientapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button consulter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.consulter.findViewById(R.id.consulter);

        consulter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nouvelle_activite = new Intent(getApplicationContext(), )
            }
        });
    }
}