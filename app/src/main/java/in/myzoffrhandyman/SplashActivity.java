package in.myzoffrhandyman;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.fujiyuu75.sequent.Animation;
import com.fujiyuu75.sequent.Sequent;
import com.github.hujiaweibujidao.wava.Techniques;
import com.github.hujiaweibujidao.wava.YoYo;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashActivity extends AppCompatActivity {


    @BindView(R.id.iv_zoffr_logo)
    ImageView IV_zoffr_logo;

    @BindView(R.id.iv_zoffr_logo_handyman)
    ImageView Iv_zoffr_logo_handyman;

    @BindView(R.id.layout)
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        AndroidNetworking.initialize(getApplicationContext());


//        YoYo.with(Techniques.FadeIn).duration(1500)
//                .interpolate(new AccelerateDecelerateInterpolator())
//                .listen(new AnimatorListenerAdapter() {
//                    @Override
//                    public void onAnimationCancel(Animator animation) {
//                        Toast.makeText(SplashActivity.this, "canceled", Toast.LENGTH_SHORT).show();
//                    }
//                })
//                .playOn(IV_zoffr_logo);


        YoYo.with(Techniques.SlideInDown).duration(2500)
                .interpolate(new AccelerateDecelerateInterpolator())
                .listen(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationCancel(Animator animation) {
                        Toast.makeText(SplashActivity.this, "canceled", Toast.LENGTH_SHORT).show();
                    }
                })
                .playOn(Iv_zoffr_logo_handyman);

        Sequent.origin(layout).anim(getApplicationContext(), Animation.BOUNCE_IN).start();


        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                /* if user login test is true on oncreate then redirect the user to result page */

                Intent Gomainscreen = new Intent(getApplicationContext(), LoginActivity.class);
//                Intent Gomainscreen = new Intent(getApplicationContext(), LoginSignupActivity.class);
                startActivity(Gomainscreen);
                finish();

//
//                if (Appconstant.str_login_test != null
//                        && !Appconstant.str_login_test.toString().trim().equals("")) {
//                    Log.e("Login detail found :", " Now Check Business Create Status");
//
//
//
//                    Get_MerchantDetail_Fast();

//                    if (Str_Get_Business_Status.equalsIgnoreCase("YES")) {
//                        Log.e("Business_Status detail found :", " YES");
//                        Intent Gomainscreen = new Intent(getApplicationContext(), BusinessMainActivity.class);
//                        startActivity(Gomainscreen);
//                        finish();
//
//
//                    } else if (Str_Get_Business_Status.equalsIgnoreCase("NO")) {
//                        Log.e("Business_Status detail NOT found :", " NO");
//                        Intent Gomainscreen = new Intent(getApplicationContext(), MainCategoryActivity.class);
//                        startActivity(Gomainscreen);
//                        finish();
//                    }


//                }

//
                /* if user login test is false on oncreate then redirect the user to login & registration page */
//                else {
//
//                    Log.e("Login detail not found :", "Go to Login Screen");
//                    Intent Gologincreen = new Intent(getApplicationContext(), LoginActivity.class);
//                    startActivity(Gologincreen);
//                    finish();
//
//                }
            }

        }, 1500);


    }
}
