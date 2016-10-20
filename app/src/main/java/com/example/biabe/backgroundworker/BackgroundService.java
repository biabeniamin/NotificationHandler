package com.example.biabe.backgroundworker;
import android.app.*;
import android.content.*;
import android.os.*;
import android.support.v4.app.NotificationCompat;

public class BackgroundService extends Service {
    private boolean isRunning;
    private Context context;
    Thread backgroundThread;
    @Override
    public IBinder onBind(Intent intent) {
   return null;
    }

    @Override
    public void onCreate() {
    this.context = this;
    this.isRunning = false;
    backgroundThread = new Thread(myTask);
    }

    private Runnable myTask = new Runnable() {
    public void run() {
        new HttpBackgroundWorker().execute("");
     stopSelf();
    }
    };

    @Override
   public void onDestroy() {
    this.isRunning = false;
    }
   @Override
   public int onStartCommand(Intent intent, int flags, int startId) {
    if(!this.isRunning) {
    this.isRunning = true;
    backgroundThread.start();
    }
    return START_STICKY;
    }
}