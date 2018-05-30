package com.mywallet.model.objects;

import java.util.ArrayList;

/**
 * Created by oborovec on 07/03/2018.
 */

public interface Account {
    /*
    private String id;
    private String name;
    private ArrayList<Record> records;
    private Float aproxAmout;
    private Currency currency;
    private String icon;
    */

    public String getId();
    public void setId(String id);
    public String getName();
    public void setName(String name);
    public ArrayList<Record> getRecords();
    public void setRecords(ArrayList<Record> records);
    public Float getAproxAmout();
    public void addToAproxAmout(Float amount) ;
    public Currency getCurrency();
    public void setCurrency(Currency currency);
    public String getIcon();
    public void setIcon(String icon);
}
