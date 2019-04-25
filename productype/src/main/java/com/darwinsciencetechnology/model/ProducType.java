package com.darwinsciencetechnology.model;

public class ProducType {

    private int id;
    private String typename;
    private String typedescription;
    private String typelevel;//等级比如1,2,3 1是最大的分类
    private int parentid;//如果是第一类别，父节点就为-1

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getTypedescription() {
        return typedescription;
    }

    public void setTypedescription(String typedescription) {
        this.typedescription = typedescription;
    }

    public String getTypelevel() {
        return typelevel;
    }

    public void setTypelevel(String typelevel) {
        this.typelevel = typelevel;
    }
}
