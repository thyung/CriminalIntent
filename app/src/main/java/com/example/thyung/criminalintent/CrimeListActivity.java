package com.example.thyung.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by aeethyung on 1/15/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
