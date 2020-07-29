package com.dtner.design.prototype.abstr;

/**
 * @ClassName ShapeAbstract
 * @Description:
 * @Author dt
 * @Date 2020-07-29
 **/
public abstract class ShapeAbstract implements Cloneable {

    protected String type;
    private String id;

    public abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Object clone() {
        try{
            return super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
