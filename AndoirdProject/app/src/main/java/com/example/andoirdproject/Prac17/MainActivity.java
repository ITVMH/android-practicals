package com.example.andoirdproject.Prac17;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;


import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.andoirdproject.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        final Button but = (Button) findViewById(R.id.button);
    }
    public void download(View view) {
        final ProgressDialog dialog = ProgressDialog.show(this, "Download",
                "downloading");
        dialog.show();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    final Bitmap downloadedBitmap = downloadBitmap("https://www.sanfoundry.com/wp-content/uploads/2013/04/san-ecosystem_new.png");
                    final ImageView imageView = (ImageView) findViewById(R.id.imageView1);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageBitmap(downloadedBitmap);
                        }
                    });

                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    dialog.dismiss();
                }
            }
        }).start();

    }

    private Bitmap downloadBitmap(String url) throws IOException {
        //Create a new HTTP url connection
        HttpUriRequest request = new HttpGet(url.toString());
        HttpClient httpClient = new DefaultHttpClient();
        //get the rsponse
        HttpResponse response = httpClient.execute(request);
        //check for the status
        StatusLine statusLine = response.getStatusLine();
        int responseCode = statusLine.getStatusCode();
        //check for the response code
        if (responseCode == 200) {
            HttpEntity entity = response.getEntity();
            byte[] bytes = EntityUtils.toByteArray(entity);

            Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0,
                    bytes.length);
            return bitmap;
        } else {
            throw new IOException("Download failed, HTTP response code "
                    + responseCode + " - " + statusLine.getReasonPhrase());
        }
    }



}