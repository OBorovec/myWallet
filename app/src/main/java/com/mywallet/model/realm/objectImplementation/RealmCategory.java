package com.mywallet.model.realm.objectImplementation;

import com.mywallet.model.objects.Category;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by oborovec on 07/03/2018.
 */

public class RealmCategory extends RealmObject implements Category {

    @PrimaryKey
    public String id;
    private String name;
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
    public String getIcon() {
        return null;
    }

    @Override
    public void setIcon(String icon) {

    }
}
