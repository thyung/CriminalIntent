package com.example.thyung.criminalintent;

import java.util.UUID;

/**
 * Created by aeethyung on 1/15/2017.
 */

public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime() {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
