package transferobjectpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 业务对象（Business Object） - 为传输对象填充数据的业务服务
 * @author Meer
 * @create 2018-06-09 23:27
 **/

public class StudentBO {
    //列表是当作一个数据库
    List<StudentTO> students;

    public StudentBO(){
        students = new ArrayList<StudentTO>();
        StudentTO student1 = new StudentTO("Robert",0);
        StudentTO student2 = new StudentTO("John",1);
        students.add(student1);
        students.add(student2);
    }
    public void deleteStudent(StudentTO student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No "
                + student.getRollNo() +", deleted from database");
    }

    //从数据库中检索学生名单
    public List<StudentTO> getAllStudents() {
        return students;
    }

    public StudentTO getStudent(int rollNo) {
        return students.get(rollNo);
    }

    public void updateStudent(StudentTO student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No "
                + student.getRollNo() +", updated in the database");
    }
}
