package morning.cat.more2more;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    private int sid;
    private String sname;
    private String sex;

    /**
     * 对班级的引用
     */
    private Grade grade = new Grade();


    public Student(String sname, String sex) {
        this.sname = sname;
        this.sex = sex;
    }

    public Student() {
    }


}
