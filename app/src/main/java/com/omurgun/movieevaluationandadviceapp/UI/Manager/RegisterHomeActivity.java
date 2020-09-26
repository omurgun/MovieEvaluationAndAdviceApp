package com.omurgun.movieevaluationandadviceapp.UI.Manager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.omurgun.movieevaluationandadviceapp.R;
import com.omurgun.movieevaluationandadviceapp.Register.SaveUserToTheDatabase;
import com.omurgun.movieevaluationandadviceapp.UI.Movie.MovieHomeActivity;

public class RegisterHomeActivity extends AppCompatActivity {

    private EditText etEmail,etUsername,etPhone,etPassword,etConfirmPassword;
    private Button buttonSignIn;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_home);
        init();
        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });

    }
    private void goMovieHome()
    {
        Intent intent = new Intent(RegisterHomeActivity.this, MovieHomeActivity.class);
        startActivity(intent);
        finish();
    }
    private void register()
    {
        String email = etEmail.getText().toString();
        String username = etUsername.getText().toString();
        String phone = etPhone.getText().toString();
        String password = etPassword.getText().toString();
        if (TextUtils.isEmpty(email))
        {
            Toast.makeText(this, "Email Cannot Be Empty!", Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(password))
        {
            Toast.makeText(this, "Username Cannot Be Empty!", Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(password))
        {
            Toast.makeText(this, "Phone Cannot Be Empty!", Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(password))
        {
            Toast.makeText(this, "Password Cannot Be Empty!", Toast.LENGTH_LONG).show();
        }
        else
        {
            RegisterWithEmailAndPassword(email,username,phone,password);
        }

    }

    private void init() {
        etEmail = findViewById(R.id.et_email);
        etUsername = findViewById(R.id.et_username);
        etPhone = findViewById(R.id.et_phone);
        etPassword = findViewById(R.id.et_password);
        etConfirmPassword = findViewById(R.id.et_confirm_password);
        buttonSignIn = findViewById(R.id.button_signIn);
        firebaseAuth = FirebaseAuth.getInstance();
    }
    public void RegisterWithEmailAndPassword(final String email, final String username, final String phoneNumber, String password)
    {
        firebaseAuth = FirebaseAuth.getInstance();

        firebaseAuth.createUserWithEmailAndPassword(email,password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                System.out.println("Signed in Email and Password");
                FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
                System.out.println(firebaseUser.getUid());
                SaveUserToTheDatabase saveUserToTheDatabase = new SaveUserToTheDatabase();
                saveUserToTheDatabase.SaveRegisteredUser(email,username,phoneNumber,firebaseUser.getUid());
                goMovieHome();

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                String message = e.getLocalizedMessage();
                System.out.println("Registration failed : "+message);
            }
        });

    }




}