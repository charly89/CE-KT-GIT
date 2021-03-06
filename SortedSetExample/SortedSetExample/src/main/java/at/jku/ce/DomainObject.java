package at.jku.ce;

public class DomainObject{

	private String uuid =  UUID.randomUUID().toString();
	private String name;
	private String comment; 

	protected DomainObject(String name, String comment) {
		super();
		this.uuid = uuid;
	}
	
	/**
	* Default-Konstruktor
	*/
	protected DomainObject() {
		super();
	}

	public String getUuid(){
		return uuid;
	}
	
	public String getComment() { 
		return comment; 
	} 
	
	public void setComment(final String comment) { 
		this.comment = comment; 
	}
	
	public String getName() { 
		return name; 
	} 
	
	public void setName(final String pname) {
		this.name = pname; 
	}
}
