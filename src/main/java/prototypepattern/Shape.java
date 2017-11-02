package prototypepattern;

/**
 * 实现了 Clonable 接口的抽象类
 *
 * @author Meer
 * @create 2017-10-25 13:57
 **/

public abstract class Shape implements Cloneable{
    private String id;
    protected String type;

    abstract void draw();

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return clone;
    }

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
}
