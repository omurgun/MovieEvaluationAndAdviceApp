package com.omurgun.movieevaluationandadviceapp.UI.Manager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.omurgun.movieevaluationandadviceapp.R;
import com.omurgun.movieevaluationandadviceapp.UI.Movie.MovieHomeActivity;

public class LoginHomeActivity extends AppCompatActivity {

    private EditText etEmail,etPassword;
    private Button btnSignIn,btnGoSignup;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_home);
        init();

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginControl();
            }
        });
        btnGoSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goRegister();
            }
        });

    }

    private void goRegister() {
        Intent intent = new Intent(LoginHomeActivity.this, RegisterHomeActivity.class);
        startActivity(intent);

    }
    private void goMovie() {
        Intent intent = new Intent(LoginHomeActivity.this, MovieHomeActivity.class);
        startActivity(intent);
        finish();

    }

    private void loginControl() {
        String email = etEmail.getText().toString();
        String password = etPassword.getText().toString();
        if (TextUtils.isEmpty(email))
        {
            Toast.makeText(this, "Email Cannot Be Empty!", Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(password))
        {
            Toast.makeText(this, "Password Cannot Be Empty!", Toast.LENGTH_LONG).show();
        }
        else
        {
            Login(email,password);
        }

    }
    public void Login(String email,String password)
    {


        firebaseAuth.signInWithEmailAndPassword(email,password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                System.out.println("giris basarılı");
                goMovie();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

                System.out.println("hata : "+e.getLocalizedMessage());
            }
        });
    }

    private void init() {
        etEmail = findViewById(R.id.et_email_login);
        etPassword = findViewById(R.id.et_password_login);
        btnSignIn = findViewById(R.id.button_signIn);
        btnGoSignup = findViewById(R.id.button_go_signup);
        firebaseAuth = FirebaseAuth.getInstance();
    }
}