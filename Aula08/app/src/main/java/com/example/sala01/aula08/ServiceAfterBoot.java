package com.example.sala01.aula08;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by sala01 on 17/05/2017.
 */

public class ServiceAfterBoot extends Service{

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        repeat();

        PendingIntent pintent = PendingIntent.getService(this, 0, new Intent(this, ServiceAfterBoot.class), 0);
        AlarmManager alarm = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        //1 em 1 min
        alarm.setRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis(), 60*1000, pintent);
    }

    private void repeat(){
        Toast.makeText(getApplicationContext(), "fui chamado", Toast.LENGTH_LONG).show();

        Log.d("mLog", "Bla");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    @Override
    public int onStartCommand(Intent intent, int flag, int id) {
        repeat();

        return START_STICKY;
    }
}
