package com.example.andoirdproject.Prac12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.andoirdproject.R;

public class SpinnerExample extends AppCompatActivity {
    Spinner spinner;
    ImageView imageView;
    ArrayAdapter<CharSequence> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_example);

        spinner = findViewById(R.id.spinner);
        imageView = findViewById(R.id.image);
        arrayAdapter = ArrayAdapter.createFromResource(this,R.array.Country_list ,R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(SpinnerExample.this,arrayAdapter.getItem(i),Toast.LENGTH_SHORT ).show();
                setImage(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void setImage(int i) {

        switch (i){
            case 0:
              imageView.setImageResource(R.drawable.india);
              break;
            case 1:
                imageView.setImageResource(R.drawable.ban);
                break;
            case 2:
                imageView.setImageResource(R.drawable.slk);
                break;
            case 3:
                imageView.setImageResource(R.drawable.jp);
                break;
            case 4:
                imageView.setImageResource(R.drawable.usa);
                break;
            case 5:
                imageView.setImageResource(R.drawable.china);
                break;
            case 6:
                imageView.setImageResource(R.drawable.nepal);
                break;

        }
    }
}