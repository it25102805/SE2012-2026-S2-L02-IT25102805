public class Student {
    private String id;
    private String name;
	
	/** 
	*Create New Student.
	*@param id the Student ID
	*@param name the Student Name
	*/
	
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
	
	/** 
	*Return the Student ID.
	*
	*@return the Student ID
	*/
	
	public String getid (){
		return id;
	}
	
	/** 
	*Return the Student Name.
	*
	*@return the Student Name
	*/
	
	public String getName (){
		return Name;
	}
	
	/** 
	*Return the Student Details.
	*
	*@return the Student Details
	*/
	
	public String toString() {
		return "ID: " + id + ", Name: "+name;
	}
}
