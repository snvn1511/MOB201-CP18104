package net.spx.vd1_service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DemoService001 extends Service {
    MediaPlayer player;

    public DemoService001(){
        Log.d("zzzz","Hàm khởi tạo");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("zzzz","Hàm onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("zzzz","Hàm onStartCommand");
        // thân của code service viết ở đây
        Toast.makeText(this, "Service bắt đầu chạy", Toast.LENGTH_SHORT).show();

        player = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
        // thiết lập cho nhạc chạy nhiều lần
        //player.setLooping(true);
        player.start();

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        Log.d("zzzz","Hàm hàm huỷ");
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
