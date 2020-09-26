package com.omurgun.movieevaluationandadviceapp.Register;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;
import com.omurgun.movieevaluationandadviceapp.Utils.Hashing;
import java.util.HashMap;

public class SaveUserToTheDatabase {
    private FirebaseFirestore firebaseFirestore;

    public SaveUserToTheDatabase() {
        init();
    }

    private void init()
    {
        firebaseFirestore = FirebaseFirestore.getInstance();
    }
    public void SaveAnonymousUser(String uid)
    {

        HashMap<String,Object> userMap = new HashMap<>();
        userMap.put("Uid",uid);
        userMap.put("date", FieldValue.serverTimestamp());

        firebaseFirestore.collection("Users").document(Hashing.encryptSHA384ThisString("Users")).collection("AnonymousUsers").document(uid).set(userMap).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                System.out.println("kaydedildi ");

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                System.out.println("hata :  "+e.getLocalizedMessage());
            }
        });

    }
    public void SaveRegisteredUser(String email,String username,String phoneNumber,String uid)
    {
        HashMap<String,Object> userMap = new HashMap<>();
        userMap.put("Email",email);
        userMap.put("Username",username);
        userMap.put("PhoneNumber",phoneNumber);
        userMap.put("Uid",uid);
        userMap.put("date", FieldValue.serverTimestamp());
        firebaseFirestore.collection("Users").document(Hashing.encryptSHA384ThisString("Users")).collection("RegisteredUsers").document(uid).set(userMap).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                System.out.println("kaydedildi ");

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                System.out.println("hata :  "+e.getLocalizedMessage());
            }
        });

    }
}
