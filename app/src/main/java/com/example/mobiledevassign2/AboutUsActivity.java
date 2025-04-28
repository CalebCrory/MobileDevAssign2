package com.example.mobiledevassign2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AboutUsActivity extends AppCompatActivity {

    String facebookURL = "https://www.facebook.com/";
    String instagramURL = "https://www.instagram.com/";
    String twitterURL = "https://x.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.about_us_page);

        ImageButton btnLogo = (ImageButton)findViewById(R.id.btnLogo);
        Button btnHome = (Button)findViewById(R.id.btnHome);
        Button btnMenu = (Button)findViewById(R.id.btnMenu);
        Button btnFeedback = (Button)findViewById(R.id.btnFeedback);
        Button btnInformation = (Button)findViewById(R.id.btnInformation);
        Button btnCounter = (Button)findViewById(R.id.btnCounter);

        btnLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AboutUsActivity.this, MainActivity.class));
            }
        });

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AboutUsActivity.this, MainActivity.class));
            }
        });

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AboutUsActivity.this, MenuActivity.class));
            }
        });

        btnFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AboutUsActivity.this, FeedbackActivity.class));
            }
        });

        btnInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AboutUsActivity.this, AboutUsActivity.class));
            }
        });

        btnCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AboutUsActivity.this, CalculatorActivity.class));
            }
        });

        ImageButton btnFacebook = (ImageButton)findViewById(R.id.btnFacebook);
        ImageButton btnInstagram = (ImageButton)findViewById(R.id.btnInstagram);
        ImageButton btnTwitter = (ImageButton)findViewById(R.id.btnTwitter);

        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(facebookURL));
                Intent chooser = Intent.createChooser(sendIntent, "Choose Your Browser");
                startActivity(chooser);
            }
        });

        btnInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(instagramURL));
                Intent chooser = Intent.createChooser(sendIntent, "Choose Your Browser");
                startActivity(chooser);
            }
        });

        btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(twitterURL));
                Intent chooser = Intent.createChooser(sendIntent, "Choose Your Browser");
                startActivity(chooser);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}