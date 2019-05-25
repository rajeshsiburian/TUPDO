package com.example.jeje.tupdo.Reminder;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.example.jeje.tupdo.AppDefault.AppDefaultActivity;
import com.example.jeje.tupdo.R;

public class ReminderActivity extends AppDefaultActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int contentViewLayoutRes() {
        return R.layout.reminder_layout;
    }

    @NonNull
    @Override
    protected ReminderFragment createInitialFragment() {
        return ReminderFragment.newInstance();
    }


}
