package com.mywallet.model.realm;

import android.content.Context;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by oborovec on 07/03/2018.
 */

public class RealmUtils {

    public static void init(Context context) {
        Realm.init(context);
        RealmConfiguration config = new RealmConfiguration.Builder().name("myWallet.realm").build();
        Realm.setDefaultConfiguration(config);
    }
}
