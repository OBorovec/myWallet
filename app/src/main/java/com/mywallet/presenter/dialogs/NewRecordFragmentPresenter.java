package com.mywallet.presenter.dialogs;

import com.mywallet.model.objects.Currency;
import com.mywallet.mvp.dialogs.NewRecordMVP;

import java.util.Date;

/**
 * Created by oborovec on 10/03/2018.
 */

public class NewRecordFragmentPresenter implements NewRecordMVP.Presenter {

    private NewRecordMVP.View view;

    public NewRecordFragmentPresenter(NewRecordMVP.View view) {
        this.view = view;
    }

    @Override
    public void saveRecord(float amount, String currency) {

    }

    @Override
    public void saveRecordAndNew(float amount, String currency) {

    }

    @Override
    public void setCurrencies() {

    }
}
