package com.mywallet.model.realm;

import com.mywallet.mvp.MyWalletObjects;
import com.mywallet.model.objects.Account;
import com.mywallet.model.objects.Category;
import com.mywallet.model.objects.Currency;
import com.mywallet.model.realm.objectImplementation.RealmAccount;
import com.mywallet.model.realm.objectImplementation.RealmCategory;
import com.mywallet.model.realm.objectImplementation.RealmCurrency;
import com.mywallet.model.realm.objectImplementation.RealmRecord;

/**
 * Created by oborovec on 08/03/2018.
 */

public class RealmObjects implements MyWalletObjects{

    private static RealmObjects singleton;
    public static RealmObjects getInstance(){
        if (singleton == null) {
            singleton = new RealmObjects();
        }
        return singleton;
    }

    @Override
    public Account newAccount() {
        RealmAccount account = new RealmAccount();
        account.setId("RealmAccount" + System.currentTimeMillis());
        return account;
    }

    @Override
    public Category newCategory() {
        RealmCategory category = new RealmCategory();
        category.setId("RealmCategory" + System.currentTimeMillis());
        return category;
    }

    @Override
    public Currency newCurrency() {
        RealmCurrency currency = new RealmCurrency();
        currency.setId("RealmCurrency" + System.currentTimeMillis());
        return currency;
    }

    @Override
    public RealmRecord newRecord() {
        RealmRecord record = new RealmRecord();
        record.setId("RealmRecord" + System.currentTimeMillis());
        return record;
    }
}
