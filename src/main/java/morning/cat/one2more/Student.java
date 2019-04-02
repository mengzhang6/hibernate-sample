package morning.cat.one2more;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/4/2 10:43 PM
 */
@Data
//@NoArgsConstructor
@ToString
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    private int sid;
    private String sname;
    private String sex;

    public Student(String sname, String sex) {
        this.sname = sname;
        this.sex = sex;
    }
}
