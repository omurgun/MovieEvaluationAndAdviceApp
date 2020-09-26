package com.omurgun.movieevaluationandadviceapp.Register;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class AnonymousUserRegister {

    private FirebaseAuth firebaseAuth;

    public void RegisterWithAnonymousUser()
    {
        firebaseAuth = FirebaseAuth.getInstance();
        firebaseAuth.signInAnonymously().addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                System.out.println("Signed in Anonymously");
                FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
                System.out.println(firebaseUser.getUid());
                SaveUserToTheDatabase saveUserToTheDatabase = new SaveUserToTheDatabase();
                saveUserToTheDatabase.SaveAnonymousUser(firebaseUser.getUid());

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
