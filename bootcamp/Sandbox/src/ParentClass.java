
public class ParentClass {
	private String code;

	public ParentClass(String code) {
		super();
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "ParentClass [code=" + code + "]";
	}
	
}
