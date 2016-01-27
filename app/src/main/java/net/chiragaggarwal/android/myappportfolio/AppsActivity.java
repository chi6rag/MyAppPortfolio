package net.chiragaggarwal.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AppsActivity extends AppCompatActivity implements View.OnClickListener {

    private Button spotifyStreamerProjectButton;
    private Button superDuoProjectButton;
    private Button buildItBiggerProjectButton;
    private Button xyzReaderProjectButton;
    private Button capstoneProjectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps);

        setTitle(getString(R.string.my_app_portfolio));
        initializeViews();
        setOnClickListenersForProjectButtons();
    }

    private void setOnClickListenersForProjectButtons() {
        this.spotifyStreamerProjectButton.setOnClickListener(this);
        this.superDuoProjectButton.setOnClickListener(this);
        this.buildItBiggerProjectButton.setOnClickListener(this);
        this.xyzReaderProjectButton.setOnClickListener(this);
        this.capstoneProjectButton.setOnClickListener(this);
    }

    private void initializeViews() {
        this.spotifyStreamerProjectButton = (Button) findViewById(R.id.spotify_streamer);
        this.superDuoProjectButton = (Button) findViewById(R.id.super_duo);
        this.buildItBiggerProjectButton = (Button) findViewById(R.id.build_it_bigger);
        this.xyzReaderProjectButton = (Button) findViewById(R.id.xyz_reader);
        this.capstoneProjectButton = (Button) findViewById(R.id.capstone);
    }

    @Override
    public void onClick(View v) {
        Integer id = v.getId();
        switch (id) {
            case R.id.spotify_streamer:
                showToastFor(R.string.spotify_streamer);
                break;
            case R.id.super_duo:
                showToastFor(R.string.super_duo);
                break;
            case R.id.build_it_bigger:
                showToastFor(R.string.build_it_bigger);
                break;
            case R.id.xyz_reader:
                showToastFor(R.string.xyz_reader);
                break;
            case R.id.capstone:
                showToastFor(R.string.capstone);
                break;
        }
    }

    private void showToastFor(Integer stringResourceId) {
        Toast.makeText(this,
                "This Toast Button will launch my " + getString(stringResourceId) + " App",
                Toast.LENGTH_SHORT).
                show();
    }
}
