package com.mywallet.model.objects;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by oborovec on 07/03/2018.
 */

public interface Record {
    /*
    private String id;
    private Date date;
    private Float amount;
    private Currency Currency;
    private Category category;
    private Account account;
    private String note;
    private ArrayList<String> files;
    private ArrayList<String> imgs;
     */

    public String getId();
    public void setId(String id);
    public Date getDate();
    public void setDate(Date date);
    public Float getAmount();
    public void setAmount(Float amount);
    public Currency getCurrency();
    public void setCurrency(Currency currency);
    public Category getCategory();
    public void setCategory(Category category);
    public Account getAccount();
    public void setAccount(Account account);
    public String getNote();
    public void setNote(String note);
    public ArrayList<String> getFiles();
    public void setFiles(ArrayList<String> files);
    public ArrayList<String> getImgs();
    public void setImgs(ArrayList<String> imgs);
}
