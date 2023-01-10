package net.spx.broascast02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn01);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_broadcast = new Intent(getApplicationContext(), MBroadcast.class);
                intent_broadcast.setAction("net.spx.broascast02.GOI_GIO_HANG");
                intent_broadcast.putExtra("sanpham","Dien thoai IPhone");

                sendBroadcast(intent_broadcast);

            }
        });


    }
}