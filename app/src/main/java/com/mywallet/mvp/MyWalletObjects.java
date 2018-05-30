package com.mywallet.mvp;

import com.mywallet.model.objects.Account;
import com.mywallet.model.objects.Category;
import com.mywallet.model.objects.Currency;
import com.mywallet.model.objects.Record;

/**
 * Created by oborovec on 08/03/2018.
 */

public interface MyWalletObjects {

    public Account newAccount();
    public Category newCategory();
    public Currency newCurrency();
    public Record newRecord();
}
