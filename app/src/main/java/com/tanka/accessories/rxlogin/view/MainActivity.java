package com.tanka.accessories.rxlogin.view;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tanka.accessories.rxlogin.R;

/**
 * Created by access-tanka on 3/20/18.
 *
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment = getSupportFragmentManager().findFragmentById(android.R.id.content);
        if (fragment == null) {
            fragment = SignInFragment.newInstance(getIntent().getExtras());
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(android.R.id.content, fragment, "")
                    .commit();
        } else {
            getSupportFragmentManager()
                    .beginTransaction()
                    .attach(fragment)
                    .commit();
        }
    }
}
