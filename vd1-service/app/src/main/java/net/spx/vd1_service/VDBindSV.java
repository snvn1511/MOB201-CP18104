package net.spx.vd1_service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class VDBindSV extends Service {
    IBinder iBinder = new LocalBinder();  // đối tượng dùng để liên kết tớ

    public VDBindSV() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
       return null;
    }

    public int Tong(int a, int b) {
        int t = a + b;
        return t;
    }


    public class LocalBinder extends Binder {

        LocalBinder getLocalBinder(){
            return LocalBinder.this; // phương thức khởi tạo khi client gọi tới các phương thức của service

        }
    }

}