package com.example.sala01.aula08;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by sala01 on 17/05/2017.
 */

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
       /* if (intent.getAction().equalsIgnoreCase(Intent.ACTION_BOOT_COMPLETED)) { TODO descomentar para ativar o servico
            context.startService(new Intent(context, ServiceAfterBoot.class));

        }*/
    }

}
