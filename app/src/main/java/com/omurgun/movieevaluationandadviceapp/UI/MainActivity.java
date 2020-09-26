package com.omurgun.movieevaluationandadviceapp.UI;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.omurgun.movieevaluationandadviceapp.R;
import com.omurgun.movieevaluationandadviceapp.UI.Manager.LoginHomeActivity;
import com.omurgun.movieevaluationandadviceapp.UI.Movie.MovieHomeActivity;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        if(userControl())
        {
            goMovie();
        }
        else
        {
            goLogin();
        }

        //AnonymousUserRegister anonymousUserRegister = new AnonymousUserRegister();
        //anonymousUserRegister.RegisterWithAnonymousUser();
    }

    private void goLogin() {
        Intent intent = new Intent(MainActivity.this, LoginHomeActivity.class);
        startActivity(intent);
        finish();
    }
    private void goMovie() {
        Intent intent = new Intent(MainActivity.this, MovieHomeActivity.class);
        startActivity(intent);
        finish();
    }
    private boolean userControl() {
        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
        if (firebaseUser !=null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    private void init() {
        firebaseAuth = FirebaseAuth.getInstance();
    }
}