package morning.cat.one2more;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/4/2 10:46 PM
 */
@Data
@ToString
//@NoArgsConstructor
public class Grade implements Serializable {
    private static final long serialVersionUID = 1L;
    private int gid;
    private String gname;
    private String gdesc;
    // 一个班级包含多个学生，单向一对多
    private Set<Student> students = new HashSet<Student>();

    public Grade(String gname, String gdesc) {
        this.gname = gname;
        this.gdesc = gdesc;
    }

}
