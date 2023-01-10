package net.spx.demobroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

public class DemoBroadcast  extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Intent intent1 = new Intent(context, Activity222.class);
        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent1.putExtra("dulieu","Dữ liệu trong file broadcast");
        context.startActivity(intent1);


        Bundle bundle = intent.getExtras();
        Log.d("zzzzzz", "onReceive: " + bundle.toString());
        Toast.makeText(context, "Đã nhận broadcast", Toast.LENGTH_SHORT).show();


//        TelephonyManager telephony = (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);
//        telephony.listen(new PhoneStateListener(){
//            @Override
//            public void onCallStateChanged(int state, String incomingNumber) {
//                super.onCallStateChanged(state, incomingNumber);
//                Log.d("zzzzzzz", "onCallStateChanged: " + incomingNumber) ;
//            }
//        },PhoneStateListener.LISTEN_CALL_STATE);


    }
}
