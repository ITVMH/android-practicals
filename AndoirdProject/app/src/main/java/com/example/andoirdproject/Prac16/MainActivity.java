package com.example.andoirdproject.Prac16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.andoirdproject.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        textView=findViewById(R.id.gandolodo);
        try
        {
            ArrayList<Student> students= parseJSON();
            String text="";
            for(Student s:students){
                text+= ""+s.getId()+", "+s.getName()+" "+s.getSurname()+"\n";
            }
            textView.setText(text);
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = getApplicationContext().getAssets().open("student.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    private ArrayList<Student> parseJSON()
    {
        ArrayList<Student> studentList = new ArrayList<Student>();
        try {
            JSONObject obj = new JSONObject(loadJSONFromAsset());

            JSONObject jobj=obj.getJSONObject("students");

            JSONArray jArray = jobj.getJSONArray("student");

            for (int i = 0; i < jArray.length(); i++) {

                JSONObject jStudent = jArray.getJSONObject(i);

                String jID = jStudent.getString("id");
                String jName = jStudent.getString("name");
                String jSurname = jStudent.getString("surname");

                studentList.add(new Student(jID,jName,jSurname));
            }
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return studentList;
    }
}
