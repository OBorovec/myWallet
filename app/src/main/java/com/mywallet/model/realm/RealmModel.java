package com.mywallet.model.realm;

import com.mywallet.mvp.MyWalletModel;
import com.mywallet.model.objects.Record;

import java.util.ArrayList;
import java.util.Date;

import io.realm.Realm;

/**
 * Created by oborovec on 07/03/2018.
 */

public class RealmModel implements MyWalletModel {

    private static RealmModel singleton;
    public static RealmModel getInstance(){
        if (singleton == null) {
            singleton = new RealmModel();
        }
        return singleton;
    }

    @Override
    public void addRecord(Record record) {

    }

    @Override
    public void removeRecord(Record record) {

    }

    @Override
    public ArrayList<Record> getAllRecords() {
        try (Realm realm = Realm.getDefaultInstance()) {
            // No need to close the Realm instance manually
        }
        return null;
    }

    @Override
    public ArrayList<Record> getRecordsInRange(Date from, Date to) {
        return null;
    }
}
