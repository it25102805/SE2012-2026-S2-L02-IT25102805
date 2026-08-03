public class Course {
    private String code;
    private String title;
	
	/** 
	*Create New Course.
	*@param course the Course Code
	*@param tittle the Course Tittle
	*/

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }
	
	/** 
	*Return the Course Code.
	*
	*@return the Course Code
	*/
	public String getCode (){
		return code;
		
	/** 
	*Return the Tittle.
	*
	*@return the Tittle
	*/
    
	public String gettittle (){
		return tittle;
		
	/** 
	*Return the Course Details.
	*
	*@return the Course Details
	*/
	public String toString() {
		return code +" -" + tittle;
	}
		
}