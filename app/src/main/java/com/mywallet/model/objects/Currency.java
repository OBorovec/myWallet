package com.mywallet.model.objects;

/**
 * Created by oborovec on 07/03/2018.
 */

public interface Currency {
    /*
    private String id;
    private String shortName;
    private String name;
    */

    public String getId();
    public void setId(String id);
    public String getShortName();
    public void setShortName(String shortName);
    public String getName();
    public void setName(String name);
}
