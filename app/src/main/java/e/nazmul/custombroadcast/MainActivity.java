package e.nazmul.custombroadcast;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    
    public void broadcastCustomIntent(View view)
    {
       Intent intent = new Intent("MyCustomIntent");
       EditText et = findViewById(R.id.extraIntent);
       // add data to the Intent
       intent.putExtra("message", (CharSequence)et.getText().toString());
       intent.setAction("sample");
       sendBroadcast(intent);
    }
    
}
