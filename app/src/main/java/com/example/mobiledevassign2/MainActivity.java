package com.example.mobiledevassign2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.main_page);

        ImageButton btnLogo = (ImageButton)findViewById(R.id.btnLogo);
        Button btnHome = (Button)findViewById(R.id.btnHome);
        Button btnMenu = (Button)findViewById(R.id.btnMenu);
        Button btnFeedback = (Button)findViewById(R.id.btnFeedback);
        Button btnInformation = (Button)findViewById(R.id.btnInformation);
        Button btnCounter = (Button)findViewById(R.id.btnCounter);

        btnLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        });

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        });

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MenuActivity.class));
            }
        });

        btnFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FeedbackActivity.class));
            }
        });

        btnInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AboutUsActivity.class));
            }
        });

        btnCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CalculatorActivity.class));
            }
        });

        ImageButton btnCarouselLeft = (ImageButton)findViewById(R.id.btnCarouselLeft);
        ImageButton btnCarouselRight = (ImageButton)findViewById(R.id.btnCarouselRight);
        ImageButton btnReviewLeft = (ImageButton)findViewById(R.id.btnReviewLeft);
        ImageButton btnReviewRight = (ImageButton)findViewById(R.id.btnReviewRight);

        /*
        Add OnClickListeners to change image on imgCarousel and change text in txtReview
         */

        Button btnNewlyAddedItems = (Button)findViewById(R.id.btnNewlyAddedItems);
        Button btnItem1 = (Button)findViewById(R.id.btnItem1);
        Button btnItem2 = (Button)findViewById(R.id.btnItem2);

        btnNewlyAddedItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NewItemsMenuActivity.class));
            }
        });

        btnItem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NewIndividualItemActivity.class));
            }
        });

        btnItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NewIndividualItemActivity.class));
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}