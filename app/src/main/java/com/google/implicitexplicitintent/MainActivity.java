package com.google.implicitexplicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.emailBtn);
        email.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()== R.id.emailBtn){
            Intent intent = new Intent(Intent.ACTION_SENDTO);
//            intent.putExtra(Intent.EXTRA_EMAIL,"mailto:nobody@google.com");
            intent.setData(Uri.parse("mailto:nobody@google.com"));
            startActivity(intent);
        }

    }
}
