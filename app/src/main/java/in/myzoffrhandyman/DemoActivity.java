package in.myzoffrhandyman;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.androidnetworking.AndroidNetworking;

import butterknife.ButterKnife;

/**
 * Created by ritesh on 29/7/17.
 */

public class DemoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_one);
        ButterKnife.bind(this);
        AndroidNetworking.initialize(getApplicationContext());


    }
}
