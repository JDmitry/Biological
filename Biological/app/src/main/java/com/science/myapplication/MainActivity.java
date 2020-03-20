package com.science.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewZZ;
    private ImageView imageViewZO;
    private ImageView imageViewZT;
    private ImageView imageViewZTH;
    private ImageView imageViewZFO;
    private ImageView imageViewZFI;
    private ImageView imageViewZSIX;
    private ImageView imageViewZSE;
    private ImageView imageViewZEIG;
    private ImageView imageViewZNI;
    private ImageView imageViewZTEN;
    private ImageView imageViewZEL;

    private ImageView imageViewOZ;
    private ImageView imageViewOO;
    private ImageView imageViewOT;
    private ImageView imageViewOTH;
    private ImageView imageViewOFO;
    private ImageView imageViewOFI;
    private ImageView imageViewOSIX;
    private ImageView imageViewOSE;
    private ImageView imageViewOEIG;
    private ImageView imageViewONI;
    private ImageView imageViewOTEN;
    private ImageView imageViewOEL;

    private ImageView imageViewTZ;
    private ImageView imageViewTO;
    private ImageView imageViewTT;
    private ImageView imageViewTTH;
    private ImageView imageViewTFO;
    private ImageView imageViewTFI;
    private ImageView imageViewTSIX;
    private ImageView imageViewTSE;
    private ImageView imageViewTEIG;
    private ImageView imageViewTNI;
    private ImageView imageViewTTEN;
    private ImageView imageViewTEL;

    private ImageView imageViewTHZ;
    private ImageView imageViewTHO;
    private ImageView imageViewTHT;
    private ImageView imageViewTHTH;
    private ImageView imageViewTHFO;
    private ImageView imageViewTHFI;
    private ImageView imageViewTHSIX;
    private ImageView imageViewTHSE;
    private ImageView imageViewTHEIG;
    private ImageView imageViewTHNI;
    private ImageView imageViewTHTEN;
    private ImageView imageViewTHEL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewZZ = findViewById(R.id.zz);
        imageViewZZ.setOnClickListener(new View.OnClickListener() {
            boolean n = false;
            @Override
            public void onClick(View v) {
                if (n) {
                    imageViewZZ.setBackgroundColor(Color.RED);
                    n = false;
                } else {
                    imageViewZZ.setBackgroundColor(Color.GREEN);
                    n = true;
                }
            }
        });

        imageViewZO = findViewById(R.id.zo);
        imageViewZO.setOnClickListener(new View.OnClickListener() {
            boolean n = false;
            @Override
            public void onClick(View v) {
                if (n) {
                    imageViewZO.setBackgroundColor(Color.RED);
                    n = false;
                } else {
                    imageViewZO.setBackgroundColor(Color.GREEN);
                    n = true;
                }
            }
        });

        imageViewZT = findViewById(R.id.zt);
        imageViewZT.setOnClickListener(new View.OnClickListener() {
            boolean n = false;
            @Override
            public void onClick(View v) {
                if (n) {
                    imageViewZT.setBackgroundColor(Color.RED);
                    n = false;
                } else {
                    imageViewZT.setBackgroundColor(Color.GREEN);
                    n = true;
                }

            }
        });

        imageViewZTH = findViewById(R.id.zth);
        imageViewZTH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewZTH.setBackgroundColor(Color.GREEN);
            }
        });

        imageViewZFO = findViewById(R.id.zfo);
        imageViewZFO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewZFO.setBackgroundColor(Color.GREEN);
            }
        });

        imageViewZFI = findViewById(R.id.zfi);
        imageViewZFI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewZFI.setBackgroundColor(Color.GREEN);
            }
        });

        imageViewZSIX = findViewById(R.id.zsix);
        imageViewZSIX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewZSIX.setBackgroundColor(Color.GREEN);
            }
        });

        imageViewZSE = findViewById(R.id.zse);
        imageViewZSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewZSE.setBackgroundColor(Color.GREEN);
            }
        });

        imageViewZEIG = findViewById(R.id.zeig);
        imageViewZEIG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewZEIG.setBackgroundColor(Color.GREEN);
            }
        });

        imageViewZNI = findViewById(R.id.zni);
        imageViewZNI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewZNI.setBackgroundColor(Color.GREEN);
            }
        });

        imageViewZTEN = findViewById(R.id.zten);
        imageViewZTEN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewZTEN.setBackgroundColor(Color.GREEN);
            }
        });

        imageViewZEL = findViewById(R.id.zel);
        imageViewZEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewZEL.setBackgroundColor(Color.GREEN);
            }
        });

        imageViewOZ = findViewById(R.id.oz);
        imageViewOZ.setOnClickListener(new View.OnClickListener() {
            boolean n = false;
            @Override
            public void onClick(View v) {

                if (n) {
                    imageViewOZ.setBackgroundColor(Color.RED);
                    n = false;
                } else {
                    imageViewOZ.setBackgroundColor(Color.GREEN);
                    n = true;
                }
            }
        });

        imageViewOO = findViewById(R.id.oo);
        imageViewOO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewOO.setBackgroundColor(Color.GREEN);
            }
        });

        imageViewOT = findViewById(R.id.ot);
        imageViewOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewOT.setBackgroundColor(Color.GREEN);
            }
        });

        imageViewOTH = findViewById(R.id.oth);
        imageViewOTH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewOTH.setBackgroundColor(Color.GREEN);
            }
        });

        imageViewOFO = findViewById(R.id.ofo);
        imageViewOFO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewOFO.setBackgroundColor(Color.GREEN);
            }
        });

        imageViewOFI = findViewById(R.id.ofi);
        imageViewOFI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewOFI.setBackgroundColor(Color.GREEN);
            }
        });

        imageViewOSIX = findViewById(R.id.osix);
        imageViewOSIX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewOSIX.setBackgroundColor(Color.GREEN);
            }
        });

        imageViewOSE = findViewById(R.id.ose);
        imageViewOSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewOSE.setBackgroundColor(Color.GREEN);
            }
        });

        imageViewOEIG = findViewById(R.id.oeig);
        imageViewOEIG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewOEIG.setBackgroundColor(Color.GREEN);
            }
        });

        imageViewONI = findViewById(R.id.oni);
        imageViewONI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewONI.setBackgroundColor(Color.GREEN);
            }
        });

        imageViewOTEN = findViewById(R.id.oten);
        imageViewOTEN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewOTEN.setBackgroundColor(Color.GREEN);
            }
        });

        imageViewOEL = findViewById(R.id.oel);
        imageViewOEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewOEL.setBackgroundColor(Color.GREEN);
            }
        });



    }

    public void culculate(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
