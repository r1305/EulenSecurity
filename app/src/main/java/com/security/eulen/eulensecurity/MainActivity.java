package com.security.eulen.eulensecurity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.iv_main)
    ImageView image;

    /** GROUP 1 **/
    @Bind(R.id.group_btn_1)
    Button btn1;

    @Bind(R.id.group_btn_2)
    Button btn2;

    @Bind(R.id.group_btn_3)
    Button btn3;

    @Bind(R.id.et1)
    EditText et1;

    @Bind(R.id.et2)
    EditText et2;

    /** END GROUP 1 **/

    /** GROUP 2 **/
    @Bind(R.id.btn4)
    Button btn4;

    @Bind(R.id.btn5)
    Button btn5;

    @Bind(R.id.btn6)
    Button btn6;

    /** END GROUP 2 **/

    @Bind(R.id.btn_main_send)
    Button btn_send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,RecoverActivity.class);
                startActivity(i);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog().show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog().show();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog().show();
            }
        });
    }




    public Dialog openDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.pick_color)
                .setItems(R.array.colors_array, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // The 'which' argument contains the index position
                        // of the selected item
                    }
                });
        return builder.create();
    }

}
