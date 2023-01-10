package net.spx.broascast02;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        // lấy dữ liệu từ activity gửi vào broadcast
        String dulieu = intent.getStringExtra("sanpham");

        // khởi động activity giỏ hàng
        Intent i = new Intent(context, GioHangActivity.class);
        // gửi vào giỏ hàng dữ liệu
        i.putExtra("dulieu", dulieu);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
