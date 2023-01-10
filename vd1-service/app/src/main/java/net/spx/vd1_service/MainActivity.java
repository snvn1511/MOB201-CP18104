package net.spx.vd1_service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    DemoBoundServiceTinhTong serviceTinhTong; // đặt ở phạm vi class
//    ServiceConnection sv_conn = new ServiceConnection() {
//
//        @Override
//
//        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
//
//            DemoBoundServiceTinhTong.LocalBinder localBinder = (DemoBoundServiceTinhTong.LocalBinder) iBinder;
//
//        }
//
//        @Override
//
//        public void onServiceDisconnected(ComponentName componentName) {
//
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // tạo intent để khởi động service
        Intent intent = new Intent(MainActivity.this, DemoService001.class);
        startService(intent);

        abc a = new abc();
        Toast.makeText(this, "sdjflkasjdfkljaksdjf sdkjfl kạdfkljaskd faklsdjfk áldkjf kádkfljaskdj fádkfj kádfjasd fklsadjf jádkjfas dfsakdjf ", Toast.LENGTH_SHORT).show();


    }
    
}