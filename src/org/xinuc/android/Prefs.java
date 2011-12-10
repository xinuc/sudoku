package org.xinuc.android;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by IntelliJ IDEA.
 * User: xinuc
 * Date: 12/11/11
 * Time: 2:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class Prefs extends PreferenceActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }
}