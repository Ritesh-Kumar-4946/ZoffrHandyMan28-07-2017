package in.myzoffrhandyman;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.androidnetworking.AndroidNetworking;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ritesh on 29/7/17.
 */

public class ProfileCreateActivity extends AppCompatActivity {


    @BindView(R.id.cv_create_profile_btn)
    CardView Cv_create_profile_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_create);
        ButterKnife.bind(this);
        AndroidNetworking.initialize(getApplicationContext());


        Cv_create_profile_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gomainscreen = new Intent(getApplicationContext(), ProfileGetActivity.class);
                startActivity(Gomainscreen);
                finish();
            }
        });


    }
}
