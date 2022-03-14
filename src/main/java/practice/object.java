package practice;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelRow;

public class object {

	@ExcelCellName("Name")
	private String name;

	@ExcelCellName("ID")
	private String id;

	@ExcelCellName("Roll No")
	private String roll_No;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoll_No() {
		return roll_No;
	}

	public void setRoll_No(String roll_No) {
		this.roll_No = roll_No;
	}

	public object() {
		super();
		// TODO Auto-generated constructor stub
	}

	public object(String name, String id, String roll_No) {
		super();
		this.name = name;
		this.id = id;
		this.roll_No = roll_No;
	}

	@Override
	public String toString() {
		return "object [name=" + name + ", id=" + id + ", roll_No=" + roll_No + "]";
	}

}