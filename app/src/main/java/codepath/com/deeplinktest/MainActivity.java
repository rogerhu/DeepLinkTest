package codepath.com.deeplinktest;

import android.os.Bundle;
import android.util.Log;

import com.airbnb.deeplinkdispatch.DeepLink;
import com.squareup.javapoet.ClassName;

import androidx.appcompat.app.AppCompatActivity;

@DeepLink({"foo://example.com/deepLink/{id}"})
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String result = ClassName.get("android.support.v4.content", "LocalBroadcastManager").toString();
//        Log.d("DEBUG", result);
    }
}
