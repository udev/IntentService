package com.udev.intentservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by Vic on 13/9/5.
 */
public class ManualService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Toast.makeText(getApplicationContext(), "This is a manual service!!!", Toast.LENGTH_LONG).show();

        return super.onStartCommand(intent, flags, startId);
    }
}
