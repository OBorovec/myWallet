package com.mywallet;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.util.Log;

import com.mywallet.model.ModelFactory;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by oborovec on 05/03/2018.
 */

public class MyWallet extends Application {

    private static MyWallet singleton;
    public static MyWallet getInstance(){
        return singleton;
    }
    public static final String APP_TAG = "MyWallet";

    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;

        // Model init
        ModelFactory.getInstance().getModel(this, null);
    }

    public Drawable loadIcon(String iconPath) {
        try {
            InputStream ims = getAssets().open(iconPath);
            Drawable d = Drawable.createFromStream(ims, null);
            return d;
        } catch(IOException e) {
            Log.e(APP_TAG, "Couldnt load icon '" + iconPath + "':", e);
            return null;
        }
    }
}
