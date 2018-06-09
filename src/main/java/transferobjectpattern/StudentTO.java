package transferobjectpattern;

/**
 * 传输对象（Transfer Object） - 简单的 POJO，只有设置/获取属性的方法
 * @author Meer
 * @create 2018-06-09 23:23
 **/

public class StudentTO {
    private String name;
    private int rollNo;

    StudentTO(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
