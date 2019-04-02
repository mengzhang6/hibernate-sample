package morning.cat.more2more;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@ToString
public class Grade implements Serializable {

    private static final long serialVersionUID = 1L;
    private int gid;
    private String gname;
    private String gdesc;
    /**
     * 对本班学生的引用
     */
    private Set<Student> students = new HashSet<Student>();

    public Grade() {
    }

    public Grade(String gname, String gdesc) {
        this.gname = gname;
        this.gdesc = gdesc;
    }


}