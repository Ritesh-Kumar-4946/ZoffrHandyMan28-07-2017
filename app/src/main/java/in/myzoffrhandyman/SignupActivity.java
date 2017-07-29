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
 * Created by ritesh on 28/7/17.
 */

public class SignupActivity extends AppCompatActivity {


    @BindView(R.id.cv_et_sign_btn_signup)
    CardView Cv_et_sign_btn_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        ButterKnife.bind(this);
        AndroidNetworking.initialize(getApplicationContext());


        Cv_et_sign_btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gomainscreen = new Intent(getApplicationContext(), ProfileCreateActivity.class);
                startActivity(Gomainscreen);
                finish();
            }
        });


    }


}
