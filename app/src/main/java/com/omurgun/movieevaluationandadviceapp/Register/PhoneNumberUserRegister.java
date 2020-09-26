package com.omurgun.movieevaluationandadviceapp.Register;

import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class PhoneNumberUserRegister {

   private FirebaseAuth firebaseAuth;
   private String verificationId;

   public void RegisterWithPhoneNumber(String phoneNumber,String code)
   {
       firebaseAuth = FirebaseAuth.getInstance();
       sendVerificationCode(phoneNumber);
       //verifyCode(code);
   }
    private void sendVerificationCode(String number) {
        System.out.println("sendVerificayionCode");
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                number,
                60,
                TimeUnit.SECONDS,
                TaskExecutors.MAIN_THREAD,
                mCallBack
        );

    }

    private PhoneAuthProvider.OnVerificationStateChangedCallbacks
            mCallBack = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

        @Override
        public void onCodeSent(String s, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            super.onCodeSent(s, forceResendingToken);
            System.out.println("onCodeSent");
            verificationId = s;
        }

        @Override
        public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
            String code = phoneAuthCredential.getSmsCode();
            System.out.println("code : "+code);
            if (code != null) {
                //txtEdit.setText(code);
                verifyCode(code);
                System.out.println("code iç : "+code);
            }
        }

        @Override
        public void onVerificationFailed(FirebaseException e) {
            //Toast.makeText(VerifyPhoneActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
        }
    };

    private void verifyCode(String code) {
        System.out.println("verifyCode");
        PhoneAuthCredential credential = PhoneAuthProvider.getCredential(verificationId, code);
        signInWithCredential(credential);
    }
    private void signInWithCredential(PhoneAuthCredential credential) {
        firebaseAuth.signInWithCredential(credential)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful())
                        {
                            System.out.println("signInWithCredential");
                        }
                        else
                        {
                            System.out.println("Login Failed!");
                        }
                    }
                });
    }

}
