package com.example.andoirdproject.Prac8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.andoirdproject.R;

public class EditText_Call extends AppCompatActivity {
    Button call;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text__call);
        call =  findViewById(R.id.call);
        editText = findViewById(R.id.edittext1);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String calls = editText.getText().toString();


                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:"+calls));
                    startActivity(intent);

                }


        });
    }
}