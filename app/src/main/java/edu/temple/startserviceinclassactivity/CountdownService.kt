package edu.temple.startserviceinclassactivity

import android.app.Service
import android.content.Intent
import android.os.IBinder

class CountdownService: Service() {
    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int

    val from = getIntExta(COUNTDOWN_START_VALUE, 10)

    CouroutineScope(Dispatchers.IO).launch{
        repeat(10){
            Log.d("Countdown", (10 - it).toString())
            delay(1000)
        }
    }
}