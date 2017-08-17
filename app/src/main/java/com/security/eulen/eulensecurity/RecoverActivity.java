package com.security.eulen.eulensecurity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class RecoverActivity extends AppCompatActivity {
    @Bind(R.id.tv_recover)
    TextView textView;

    @Bind(R.id.et_recover)
    EditText editText;

    @Bind(R.id.btn_recover_send)
    Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recover);
        ButterKnife.bind(this);
    }
}
