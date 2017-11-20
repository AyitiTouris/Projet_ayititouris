package com.example.labadmin.ayiti_touris.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.labadmin.ayiti_touris.ActivitiesOnline.Activity_ListeClub;
import com.example.labadmin.ayiti_touris.ActivitiesOnline.Activity_ListeHotel;
import com.example.labadmin.ayiti_touris.ActivitiesOnline.Activity_ListeMonument;
import com.example.labadmin.ayiti_touris.ActivitiesOnline.Activity_ListePlage;
import com.example.labadmin.ayiti_touris.ActivitiesOnline.Activity_ListeResto;
import com.example.labadmin.ayiti_touris.R;
import com.example.labadmin.ayiti_touris.utils.ListesEvent;

/*import com.Backendless.Backendless;*/

public class MainActivity extends AppCompatActivity {
    String Hotel="Hotel",Club="Club",Monument="Monument",Restaurant="Restaurant";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*Backendless.initApp(this, APPLICATION_ID, API_KEY);*/

        final Animation shake = AnimationUtils.loadAnimation(this, R.anim.milkshake);
        final Animation shake2 = AnimationUtils.loadAnimation(this, R.anim.shake2);


        ImageView btnliste =(ImageView)findViewById(R.id.ivhotels);
        btnliste.startAnimation(shake);
        //shake.setInterpolator(new BounceInterpolator());
        btnliste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Activity_ListeHotel.class);
                startActivity(intent);
            }
        });

        ImageView btnMonument =(ImageView)findViewById(R.id.ivmonuments);
        btnMonument.setAnimation(shake);
        btnMonument.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Activity_ListeMonument.class);
                startActivity(intent);
            }
        });

        ImageView btnRestaurant =(ImageView)findViewById(R.id.ivrestorants);
        btnRestaurant.setAnimation(shake);
        btnRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Activity_ListeResto.class);
                startActivity(intent);
            }
        });
        ImageView btnPlage =(ImageView)findViewById(R.id.ivplages);
        btnPlage.setAnimation(shake);
        btnPlage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Activity_ListePlage.class);
                startActivity(intent);
            }
        });
        ImageView btnEvenement =(ImageView)findViewById(R.id.ivevenements);
        btnEvenement.setAnimation(shake);
        btnEvenement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ListesEvent.class);
                startActivity(intent);
            }
        });
        ImageView btnClub =(ImageView)findViewById(R.id.ivclubs);
        btnClub.setAnimation(shake);
        btnClub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Activity_ListeClub.class);
                startActivity(intent);
               // Intent intent=new Intent(MainActivity.this,LoginActivity.class);
               // startActivity(intent);
            }
        });




    }



   /* protected void checkNetworkConnectivity() {
        // TODO Auto-generated method stub
        ConnectivityManager connMgr = (ConnectivityManager)
                this.getSystemService(Context.CONNECTIVITY_SERVICE);

        final android.net.NetworkInfo wifi =
                connMgr.getNetworkInfo(ConnectivityManager.TYPE_WIFI);

        final android.net.NetworkInfo mobile =
                connMgr.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

        if( wifi.isAvailable() || mobile.isAvailable()){




        }

        else{
            Intent intent=new Intent(MainActivity.this,ListesHotel.class);
            //intent.putExtra("Hotel",Hotel);
            startActivity(intent);
            Toast.makeText(this, "No Network Available" , Toast.LENGTH_LONG).show();
        }
    }*/

   /*// Step1 : create the  RotateAnimation object
        RotateAnimation anim = new RotateAnimation(0f, 350f, 80f, 80f);
        // Step 2:  Set the Animation properties
        anim.setInterpolator(new LinearInterpolator());
        anim.setRepeatCount(Animation.INFINITE);
        anim.setDuration(700);

        // Step 3: Start animating the image
        btnMonument.startAnimation(anim);*/
   
   /*ShakeAnimation.create().with(btnClub)
                .setDuration(2000)
                .setRepeatMode(ShakeAnimation.RESTART)
                .setRepeatCount(ShakeAnimation.INFINITE)
                .start();*/
}

//}
