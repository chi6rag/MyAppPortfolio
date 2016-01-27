package net.chiragaggarwal.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class AppsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps);

        setTitle(getString(R.string.my_app_portfolio));
    }
}
