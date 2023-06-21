package de.berlin.polizei.oidcsso;

import static de.berlin.polizei.oidcsso.OIDCActivity.ACTION_LOGIN;
import static de.berlin.polizei.oidcsso.OIDCActivity.ACTION_LOGOUT;

import android.content.Intent;
import android.os.Bundle;
import android.text.NoCopySpan;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class notificationActionbutton extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i = new Intent(ACTION_LOGOUT);
        i.putExtra("test",true);
        //startForResultLauncherLogout.launch(i);
        //startActivityForResult(i,2);
        startActivity(i);
    }
}
