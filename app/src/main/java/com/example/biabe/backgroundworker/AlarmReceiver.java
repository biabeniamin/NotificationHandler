package com.example.biabe.backgroundworker;

/**
 * Created by biabe on 9/30/2016.
 */
import android.app.*;
import android.content.*;
import android.os.*;

public class AlarmReceiver extends BroadcastReceiver {
        @Override
    public void onReceive(Context context, Intent intent)
        {
        System.out.print("test");
            Intent background = new Intent(context, BackgroundService.class);
        context.startService(background);
    }
}