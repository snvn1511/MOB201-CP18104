package net.spx.broascast02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class GioHangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gio_hang);

        String sp = getIntent().getStringExtra("dulieu");
        Toast.makeText(this, sp, Toast.LENGTH_SHORT).show();
    }
}