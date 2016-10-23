package com.example.biabe.backgroundworker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;

/**
 * Created by biabe on 10/22/2016.
 */

public class IncomingCallInterceptor extends BroadcastReceiver
{
    @Override
    public void onReceive(final Context context, Intent intent)
    {
        String state=intent.getStringExtra(TelephonyManager.EXTRA_STATE);
        if(TelephonyManager.EXTRA_STATE_RINGING.equals(state))
        {
            new HttpBackgroundWorker().execute("6");
            new HttpBackgroundWorker().execute("6");

        }
    }
}
