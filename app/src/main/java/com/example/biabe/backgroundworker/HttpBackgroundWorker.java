package com.example.biabe.backgroundworker;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by biabe on 10/1/2016.
 */

public class HttpBackgroundWorker extends AsyncTask<String,Void,String> {
    protected String doInBackground(String... urls)
    {
        try
        {
            String url="http://192.168.0.108/?cmd=7";
            System.out.println(url);
            URL oracle = new URL(url);

            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    yc.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
        }
        catch (Exception ee) {
            System.out.println(ee);
        }
        return  "";
    }
}