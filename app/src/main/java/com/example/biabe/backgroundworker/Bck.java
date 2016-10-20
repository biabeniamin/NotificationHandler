package com.example.biabe.backgroundworker;

import android.content.Context;
import android.os.AsyncTask;
import java.lang.InterruptedException;
/**
 * Created by biabe on 9/30/2016.
 */

class Bck extends AsyncTask<Void, Void, Void>
{
    Context context;
    Bck(Context context)    {
        this.context=context;
    }
    @Override
    protected void onPostExecute(Void result) {
        super.onPostExecute(result);
        //Do stuff that you want after completion of background task and also dismiss progress here.
    }
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        //create and show progress dialog here
    }
    @Override
    protected Void doInBackground(Void... as) {
        //Thread.sleep(1000);
        return null;
    }

}
