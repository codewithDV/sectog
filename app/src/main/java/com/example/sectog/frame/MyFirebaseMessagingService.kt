package com.example.sectog.frame

import android.app.NotificationManager
import android.content.Context
import android.media.RingtoneManager
import android.os.Build
import androidx.core.app.NotificationCompat
import com.example.sectog.R
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import android.app.NotificationChannel


class MyFirebaseMessagingService : FirebaseMessagingService() // extending class firebase
{
    val TAG = "MessagingService"

    override fun onMessageReceived(message: RemoteMessage) // passing msg of firebase for modify
    {
        super.onMessageReceived(message)
//        message?.from?.let { Log.d(TAG, it) }
//        message?.from?.let { Log.d(TAG, it) }
//        message?.from?.let { Log.d(TAG, it) }
        message?.notification?.body?.let { setUpnotification(it) }

    }

    private fun setUpnotification(body: String)  //msg as string
    {
        val cid = "todoid"
        val ringtone = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        val builder = NotificationCompat.Builder(this, cid)
            .setSmallIcon(R.drawable.avtar)
            .setContentTitle("hello, sale is open")
            .setContentText(body)
            .setSound(ringtone)
        val notificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT
            >= Build.VERSION_CODES.O
        ) {
            val notificationChannel = NotificationChannel(
                cid, "web_app",
                NotificationManager.IMPORTANCE_HIGH
            )
            notificationManager.createNotificationChannel(
                notificationChannel
            )
            notificationManager.notify(0, builder.build());


        }


    }

    override fun setTheme(resid: Int) {
        super.setTheme(resid)
    }

    override fun onNewToken(token: String) {
        super.onNewToken(token)
    }

}