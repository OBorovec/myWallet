package com.mywallet.mvp;

import com.mywallet.model.objects.Record;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by oborovec on 07/03/2018.
 */

public interface MyWalletModel {

    public void addRecord(Record record);
    public void removeRecord(Record record);
    public ArrayList<Record> getAllRecords();
    public ArrayList<Record> getRecordsInRange(Date from, Date to);
}
