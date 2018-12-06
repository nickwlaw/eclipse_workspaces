
public class ChildClass extends ParentClass {

	public ChildClass(String code) {
		super(code);
	}

	@Override
	public String toString() {
		return "ChildClass [code=" + getCode() + "]";
	}

}
