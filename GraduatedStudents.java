
public class GraduatedStudents extends Student{
	private String degree;//Graduated studentlerin master ya da doktora olduğunu tutan değişken
	
	public GraduatedStudents(String degree,String year,int grade,String information, String name_surname, String id_number) {
		super(year, grade, information, name_surname, id_number);
		this.degree=degree;
	}
	
	
	public GraduatedStudents (String name_surname, String id_number, String year, String degree)
	   {
	       super(name_surname, id_number, year);
	       this.degree=degree;
	       
	   }
	

	public String getDegree() //Graduated studentların mater mı doktora mı olduğunu döndürür.
	{
	    return degree;
	  }
	
	
	public void setDegree(String degree) 
	{
	    if(degree=="master"&& degree=="doctoral")
		{
	    	this.degree = degree;
		}
	    else
	    {
	      System.out.println("The degree is inaccurate.");
		}
	    
	  }
	

	
	
	
	
	

	       
	
}

