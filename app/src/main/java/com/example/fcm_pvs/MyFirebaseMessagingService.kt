package com.example.fcm_pvs

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService :
    FirebaseMessagingService() {






    override fun onNewToken(token: String) {
        Log.d("TAG New", "Refreshed token: $token")

    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)
        Log.d("TAG fdcm messaje", "Mensaje push en primer plano: ${message.notification!!.body}")

    }


}