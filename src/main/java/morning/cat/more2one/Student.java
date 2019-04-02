package morning.cat.more2one;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    private int sid;
    private String sname;
    private String sex;
    /**
     * 添加班级引用
     */
    private Grade grade = new Grade();

    public Student(String sname, String sex) {
        this.sname = sname;
        this.sex = sex;
    }

    public Student() {
    }


}
