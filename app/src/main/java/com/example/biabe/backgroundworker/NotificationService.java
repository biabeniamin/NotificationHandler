package com.example.biabe.backgroundworker;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityEvent;

/**
 * Created by biabe on 10/1/2016.
 */

public class NotificationService extends AccessibilityService {
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        new HttpBackgroundWorker().execute("3");
        System.out.println("merge2");
    }
    @Override
    public void onInterrupt() {
        // TODO Auto-generated method stub.
        System.out.println("merge3");
    }
    @Override
    protected void onServiceConnected() {
        AccessibilityServiceInfo info = new AccessibilityServiceInfo();
        info.feedbackType = 1;
        info.eventTypes = AccessibilityEvent.TYPE_NOTIFICATION_STATE_CHANGED;
        info.notificationTimeout = 100;
        setServiceInfo(info);
        System.out.println("merge");
    }
}

