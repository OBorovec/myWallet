package com.mywallet.model.objects;

/**
 * Created by oborovec on 07/03/2018.
 */

public interface Category {
    /*
    private String id;
    private String name;
    private String icon;
    */

    public String getId();
    public void setId(String id);
    public String getName();
    public void setName(String name) ;
    public String getIcon();
    public void setIcon(String icon);
}
