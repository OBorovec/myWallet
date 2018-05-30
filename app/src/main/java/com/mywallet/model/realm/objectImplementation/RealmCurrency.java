package com.mywallet.model.realm.objectImplementation;

import com.mywallet.model.objects.Currency;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by oborovec on 07/03/2018.
 */

public class RealmCurrency extends RealmObject implements Currency {

    @PrimaryKey
    public String id;
    private String shortName;
    private String name;

    @Override
    public String getId() {
        return null;
    }

    @Override
    public void setId(String name) {

    }

    @Override
    public String getShortName() {
        return null;
    }

    @Override
    public void setShortName(String shortName) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }
}
