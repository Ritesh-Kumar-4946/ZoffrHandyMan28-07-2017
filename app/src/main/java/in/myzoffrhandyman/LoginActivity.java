package in.myzoffrhandyman;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.androidnetworking.AndroidNetworking;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ritesh on 28/7/17.
 */

public class LoginActivity extends AppCompatActivity {


    @BindView(R.id.tv_signup_below)
    TextView Tv_signup_below;

    @BindView(R.id.cv_login_email)
    CardView Cv_login_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        AndroidNetworking.initialize(getApplicationContext());


        Tv_signup_below.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gomainscreen = new Intent(getApplicationContext(), SignupActivity.class);
                startActivity(Gomainscreen);
                finish();
            }
        });


        Cv_login_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gomainscreen = new Intent(getApplicationContext(), ProfileCreateActivity.class);
                startActivity(Gomainscreen);
                finish();
            }
        });


    }
}
