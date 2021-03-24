package com.example.andoirdproject.Prac19;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

import com.example.andoirdproject.R;

public class MainActivity extends AppCompatActivity {
    long myDownloadReference;
    Button btnDownload;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        btnDownload =findViewById(R.id.btnDownload);
        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManger();
            }
        });

    }

    private void downloadManger() {



        Toast.makeText(this, "Downloading...", Toast.LENGTH_LONG).show();
        Uri url = Uri.parse("http://www.africau.edu/images/default/sample.pdf");

        DownloadManager downloadManager = (DownloadManager) getApplicationContext().getSystemService(Context.DOWNLOAD_SERVICE);
        DownloadManager.Request request = new DownloadManager.Request(url);
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,"abc.pdf");
        request.setMimeType("*/*");
        downloadManager.enqueue(request);

    }
}