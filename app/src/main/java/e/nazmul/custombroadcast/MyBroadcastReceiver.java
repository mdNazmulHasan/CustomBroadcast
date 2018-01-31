package e.nazmul.custombroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		
		// Extract data included in the Intent
		CharSequence intentData = intent.getCharSequenceExtra("message");	
		Toast.makeText(context, "message received"+intentData, Toast.LENGTH_LONG).show();
	}

}
