package com.example.tacademy.samplepreference1;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Tacademy on 2016-02-12.
 */
public class SettingFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.setting_preference);
    }
}
