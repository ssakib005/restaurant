package View.activites;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.myapplication.R;

import models.UserLogin;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity implements GoogleApiClient.OnConnectionFailedListener {


    private TextInputEditText userEditText;
    private TextInputEditText passwordEditText;
    private String userName;
    private String userPassword;
    private static final int GOOGLE_IN_CODE = 777;


    UserLogin login = new UserLogin(
        userName = "sakib",
        userPassword = "1234"
    );

    private List<UserLogin> userLogins;


    private GoogleApiClient googleApiClient;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearlayout_id);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view != null) {
                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    assert imm != null;
                    imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
            }
        });

        userLogins = new ArrayList<UserLogin>();
        userLogins.add(login);

        userEditText = (TextInputEditText) findViewById(R.id.username_id);
        passwordEditText = (TextInputEditText) findViewById(R.id.password_id);

        Button button = (Button) findViewById(R.id.login_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userName = userEditText.getText().toString();
                userPassword = passwordEditText.getText().toString();

                for (int i = 0; i < userLogins.size(); i++) {

                    if (userName.equals(userLogins.get(i).userName) && userPassword.equals(userLogins.get(i).userPass)) {
                        System.out.println(userLogins.get(i).userName);
                        Intent intent = new Intent(LoginActivity.this, BaseActivity.class);
                        startActivity(intent);

                    } else {
                        Toast.makeText(LoginActivity.this, "Invalid UserName or Password", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });


        TextView sign_upTextView = (TextView) findViewById(R.id.sign_up_id);
        sign_upTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(i);
            }
        });

        TextView resetPasswordTextView = (TextView) findViewById(R.id.reset_password_id);
        resetPasswordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, ResetPassword.class);
                startActivity(i);
            }
        });

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        googleApiClient = new GoogleApiClient.Builder(this)
                .enableAutoManage(this, this)
                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
                .build();

        TextView googleTv = (TextView) findViewById(R.id.google_sign_in_id);
        googleTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = Auth.GoogleSignInApi.getSignInIntent(googleApiClient);
                startActivityForResult(i, GOOGLE_IN_CODE);
            }
        });
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == GOOGLE_IN_CODE){
            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            handleSignInResult(result);
        }


    }

    private void handleSignInResult(GoogleSignInResult result) {

        if (result.isSuccess()){
            goMainScreen();
        }else {
            Toast.makeText(this, "Log in Failed!", Toast.LENGTH_SHORT).show();
        }
    }

    private void goMainScreen() {
        Intent i = new Intent(this, BaseActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }
}

