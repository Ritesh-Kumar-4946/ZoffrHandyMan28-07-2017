package in.myzoffrhandyman;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.androidnetworking.AndroidNetworking;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ritesh on 24/7/17.
 */

public class ProfileGetActivity extends AppCompatActivity {

    @BindView(R.id.fab)
    FloatingActionButton Fab_Register_mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_get_new);
        ButterKnife.bind(this);
        AndroidNetworking.initialize(getApplicationContext());


        Fab_Register_mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gomainscreen = new Intent(getApplicationContext(), RegistrationModeActivity.class);
                startActivity(Gomainscreen);
                finish();
            }
        });


    }


}
