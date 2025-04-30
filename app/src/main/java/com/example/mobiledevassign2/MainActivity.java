package com.example.mobiledevassign2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int ReviewCounter = 0;
    int CarouselCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.main_page);

        ImageView iv = (ImageView)findViewById(R.id.imgCarousel);
        iv.setImageResource(R.drawable.restaurantstockimage);

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

        btnCarouselLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarouselCounter--;
                if (CarouselCounter == 0) {
                    ImageView iv = (ImageView)findViewById(R.id.imgCarousel);
                    iv.setImageResource(R.drawable.restaurantstockimage);
                } else if (CarouselCounter == 1) {
                    ImageView iv = (ImageView)findViewById(R.id.imgCarousel);
                    iv.setImageResource(R.drawable.restaurantstockimage2);
                } else if (CarouselCounter == 2) {
                    ImageView iv = (ImageView)findViewById(R.id.imgCarousel);
                    iv.setImageResource(R.drawable.restaurantstockimage3);
                } else if (CarouselCounter < 0) {
                    CarouselCounter = 2;
                    ImageView iv = (ImageView)findViewById(R.id.imgCarousel);
                    iv.setImageResource(R.drawable.restaurantstockimage3);
                }
            }
        });

        btnCarouselRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarouselCounter++;
                if (CarouselCounter == 0) {
                    ImageView iv = (ImageView)findViewById(R.id.imgCarousel);
                    iv.setImageResource(R.drawable.restaurantstockimage);
                } else if (CarouselCounter == 1) {
                    ImageView iv = (ImageView)findViewById(R.id.imgCarousel);
                    iv.setImageResource(R.drawable.restaurantstockimage2);
                } else if (CarouselCounter == 2) {
                    ImageView iv = (ImageView)findViewById(R.id.imgCarousel);
                    iv.setImageResource(R.drawable.restaurantstockimage3);
                } else if (CarouselCounter >= 3) {
                    CarouselCounter = 0;
                    ImageView iv = (ImageView)findViewById(R.id.imgCarousel);
                    iv.setImageResource(R.drawable.restaurantstockimage);
                }
            }
        });

        btnReviewLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReviewCounter--;
                if (ReviewCounter == 0) {
                    TextView tv = (TextView)findViewById(R.id.txtReview);
                    tv.setText(getString(R.string.txtReview1));
                } else if (ReviewCounter == 1) {
                    TextView tv = (TextView)findViewById(R.id.txtReview);
                    tv.setText(getString(R.string.txtReview2));
                } else if (ReviewCounter == 2) {
                    TextView tv = (TextView)findViewById(R.id.txtReview);
                    tv.setText(getString(R.string.txtReview3));
                } else if (ReviewCounter < 0) {
                    ReviewCounter = 2;
                    TextView tv = (TextView)findViewById(R.id.txtReview);
                    tv.setText(getString(R.string.txtReview3));
                }
            }
        });

        btnReviewRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReviewCounter++;
                if (ReviewCounter == 0) {
                    TextView tv = (TextView)findViewById(R.id.txtReview);
                    tv.setText(getString(R.string.txtReview1));
                } else if (ReviewCounter == 1) {
                    TextView tv = (TextView)findViewById(R.id.txtReview);
                    tv.setText(getString(R.string.txtReview2));
                } else if (ReviewCounter == 2) {
                    TextView tv = (TextView)findViewById(R.id.txtReview);
                    tv.setText(getString(R.string.txtReview3));
                } else if (ReviewCounter >= 3) {
                    ReviewCounter = 0;
                    TextView tv = (TextView)findViewById(R.id.txtReview);
                    tv.setText(getString(R.string.txtReview1));
                }
            }
        });

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