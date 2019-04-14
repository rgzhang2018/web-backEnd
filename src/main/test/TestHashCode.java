
import org.junit.Test;
import team.ustc.sse.blockly.entity.Student;

import java.util.Hashtable;

/**
 * @program: childrenCode
 * @description: 测试hashCode和.equals方法
 * @author: rgzhang
 * @create: 2019-03-22 20:34
 **/

public class TestHashCode {

    @Test
    public void testHash(){
        Student student1 = new Student();
        student1.setStudentid(1);
        student1.setStudentname("asd");

        Student student2 = new Student();
        student2.setStudentid(1);
        student2.setStudentname("asd");

        System.out.println("student1.equals(student2):"+ student1.equals(student2));

        Hashtable<Student,Integer> students = new Hashtable<>();
        students.put(student1,1);
        System.out.println("students.containsKey(student2):"+ students.containsKey(student2));


    }
}
