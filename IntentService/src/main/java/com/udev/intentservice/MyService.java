package com.udev.intentservice;

import android.app.IntentService;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

/**
 * Created by Vic on 13/9/5.
 */
public class MyService extends IntentService {

    public MyService() {
        super("MyService");
    }

    @Override
    public void onCreate() {
        super.onCreate();

        final Context context = getApplicationContext();
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), "MyService is here!", Toast.LENGTH_SHORT).show();

                NotificationCompat.Builder builder = new NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.ic_launcher)
                        .setContentTitle("I Like Your Booty (but I'm Not Gay)")
                        .setContentText("1234567890");

                NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle(builder);
                bigPictureStyle.bigPicture(BitmapFactory.decodeResource(getResources(), R.drawable.insane_o_flex));
                bigPictureStyle.setBigContentTitle("Insane O Flex");
                builder.setLights(0xFF0000FF, 500, 500);
                builder.setStyle(bigPictureStyle);
                bigPictureStyle.setSummaryText("Dump Trucks \n" +
                        "Derrier \n" +
                        "Two Scoops \n" +
                        "Sweet Rolls \n" +
                        "Little Debbies \n" +
                        "Meat Seat \n" +
                        "Jiggle Jam \n" +
                        "Pudding Cups "
                );

                NotificationManager notificationManager =
                        (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                notificationManager.notify(1, builder.build());
            }
        });
    }

    @Override
    protected void onHandleIntent(Intent intent) {

    }
}
