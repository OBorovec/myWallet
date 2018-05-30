package com.mywallet.model.realm.objectImplementation;

import com.mywallet.model.objects.Account;
import com.mywallet.model.objects.Category;
import com.mywallet.model.objects.Currency;
import com.mywallet.model.objects.Record;

import java.util.ArrayList;
import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by oborovec on 07/03/2018.
 */

public class RealmRecord extends RealmObject implements Record {

    @PrimaryKey
    public String id;
    private Date date;
    private Float amount;
    private RealmCurrency Currency;
    private RealmCategory category;
    private RealmAccount account;
    private String note;
    private RealmList<String> files;
    private RealmList<String> imgs;

    @Override
    public String getId() {
        return null;
    }

    @Override
    public void setId(String name) {

    }

    @Override
    public Date getDate() {
        return null;
    }

    @Override
    public void setDate(Date date) {

    }

    @Override
    public Float getAmount() {
        return null;
    }

    @Override
    public void setAmount(Float amount) {

    }

    @Override
    public Currency getCurrency() {
        return null;
    }

    @Override
    public void setCurrency(Currency currency) {

    }

    @Override
    public Category getCategory() {
        return null;
    }

    @Override
    public void setCategory(Category category) {

    }

    @Override
    public Account getAccount() {
        return null;
    }

    @Override
    public void setAccount(Account account) {

    }

    @Override
    public String getNote() {
        return null;
    }

    @Override
    public void setNote(String note) {

    }

    @Override
    public ArrayList<String> getFiles() {
        return null;
    }

    @Override
    public void setFiles(ArrayList<String> files) {

    }

    @Override
    public ArrayList<String> getImgs() {
        return null;
    }

    @Override
    public void setImgs(ArrayList<String> imgs) {

    }
}
