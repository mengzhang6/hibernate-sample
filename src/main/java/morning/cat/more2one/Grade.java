package morning.cat.more2one;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class Grade implements Serializable {


	private static final long serialVersionUID = 1L;
	private int gid;
	private String gname;
	private String gdesc;

	public Grade() {
	}

	public Grade(String gname, String gdesc) {
		this.gname = gname;
		this.gdesc = gdesc;
	}



}