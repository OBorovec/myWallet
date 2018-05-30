package com.mywallet.model.realm.objectImplementation;

import com.mywallet.model.objects.Account;
import com.mywallet.model.objects.Currency;
import com.mywallet.model.objects.Record;

import java.util.ArrayList;

import io.realm.MutableRealmInteger;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by oborovec on 07/03/2018.
 */

public class RealmAccount extends RealmObject implements Account {

    @PrimaryKey
    public String id;
    private String name;
    private RealmList<RealmRecord> records;
    private final MutableRealmInteger aproxAmout = MutableRealmInteger.valueOf(0);
    private RealmCurrency currency;
    private String icon;

    @Override
    public String getId() {
        return null;
    }

    @Override
    public void setId(String name) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public ArrayList<Record> getRecords() {
        return null;
    }

    @Override
    public void setRecords(ArrayList<Record> records) {

    }

    @Override
    public Float getAproxAmout() {
        return null;
    }

    @Override
    public void addToAproxAmout(Float amount) {

    }

    @Override
    public Currency getCurrency() {
        return null;
    }

    @Override
    public void setCurrency(Currency currency) {

    }

    @Override
    public String getIcon() {
        return null;
    }

    @Override
    public void setIcon(String icon) {

    }
}
