package com.example.mobiledevassign2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.mobiledevassign2.R;

public class MainsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.mains_page);

        ImageButton btnLogo = (ImageButton)findViewById(R.id.btnLogo);
        Button btnHome = (Button)findViewById(R.id.btnHome);
        Button btnMenu = (Button)findViewById(R.id.btnMenu);
        Button btnFeedback = (Button)findViewById(R.id.btnFeedback);
        Button btnInformation = (Button)findViewById(R.id.btnInformation);
        Button btnCounter = (Button)findViewById(R.id.btnCounter);

        btnLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainsActivity.this, MainActivity.class));
            }
        });

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainsActivity.this, MainActivity.class));
            }
        });

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainsActivity.this, MenuActivity.class));
            }
        });

        btnFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainsActivity.this, FeedbackActivity.class));
            }
        });

        btnInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainsActivity.this, AboutUsActivity.class));
            }
        });

        btnCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainsActivity.this, CalculatorActivity.class));
            }
        });

        Button btnItem1 = (Button)findViewById(R.id.btnItem1);
        Button btnItem2 = (Button)findViewById(R.id.btnItem2);
        Button btnItem3 = (Button)findViewById(R.id.btnItem3);
        Button btnItem4 = (Button)findViewById(R.id.btnItem4);
        Button btnItem5 = (Button)findViewById(R.id.btnItem5);
        Button btnItem6 = (Button)findViewById(R.id.btnItem6);

        btnItem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainsActivity.this, MainsIndividualItemActivity.class));
            }
        });

        btnItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainsActivity.this, MainsIndividualItemActivity.class));
            }
        });

        btnItem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainsActivity.this, MainsIndividualItemActivity.class));
            }
        });

        btnItem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainsActivity.this, MainsIndividualItemActivity.class));
            }
        });

        btnItem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainsActivity.this, MainsIndividualItemActivity.class));
            }
        });

        btnItem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainsActivity.this, MainsIndividualItemActivity.class));
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}