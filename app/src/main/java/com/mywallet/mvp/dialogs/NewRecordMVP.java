package com.mywallet.mvp.dialogs;

import com.mywallet.model.objects.Currency;

import java.util.Date;

/**
 * Created by oborovec on 10/03/2018.
 */

public interface NewRecordMVP {
    interface Presenter {
        void saveRecord(float amount, String currency);
        void saveRecordAndNew(float amount, String currency);
        void setCurrencies();
    }
    interface View {
        void showInvalidInputNotification(String str);
        void dismissFrame();
        void setCurrencyLabel(String label);
    }
}
