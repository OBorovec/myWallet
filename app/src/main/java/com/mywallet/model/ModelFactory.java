package com.mywallet.model;

import android.content.Context;

import com.mywallet.model.realm.RealmModel;
import com.mywallet.model.realm.RealmObjects;
import com.mywallet.model.realm.RealmUtils;
import com.mywallet.mvp.MyWalletModel;
import com.mywallet.mvp.MyWalletObjects;

/**
 * Created by oborovec on 07/03/2018.
 */

public class ModelFactory {
    private static ModelFactory singleton;
    public static ModelFactory getInstance(){
        if (singleton == null) {
            singleton = new ModelFactory();
        }
        return singleton;
    }

    private enum SupportedModel {REALM}

    public MyWalletModel getModel(Context context, SupportedModel modelType) {
        RealmUtils.init(context);
        return RealmModel.getInstance();
    }

    public MyWalletObjects getObjects() {
        return RealmObjects.getInstance();
    }
}


