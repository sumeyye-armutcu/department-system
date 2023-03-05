
public class Lessons {
	private String course_code;//Dersin kodu
    private String name;//Dersin adı
    private int credit;//Dersin kredisi
    private String course_location;
    private Lecturers lecturer_information;//Kursu veren öğretmenin adı 
    

    public Lessons( String course_code,String name,int credit) 
    {
        this.course_code=course_code;
        this.name=name;
        this.credit=credit;

    }
    
    public Lessons( String name) 
    {

        this.name=name;


    }


   public String getCourse_code() {
    return course_code;
}
   public void setCourse_code(String course_code) {
    this.course_code = course_code;
}
   public String getName() {
    return name;
}
   public void setName(String name) {
    this.name = name;
}
   public int getCredit() {
    return credit;
}
   public void setCredit(int credit) {
    this.credit = credit;
}

   public String getCourse_location() {
    return course_location;
}
   public void setCourse_location(String course_location) {
    this.course_location = course_location;
}


public String getLecturer_information() //Dersi veren öğretmenin adını soyadını ve id'sini döndürür
{
    return lecturer_information.getName_surname()+lecturer_information.getId_number();
}

public void setLecturer_information(Lecturers lecturer_information) 
{
    this.lecturer_information = lecturer_information;
}



private static final int MAX_COURSE=100;//Kursa kayıtlı olabilecek max öğrenci sayısı
private  String[] coursesStudents=new String[MAX_COURSE];//Kursu alan öğrencileri tutan dizi

public String[] getCoursesStudents() {
    return coursesStudents;
}

public void showStudent()//Kursu alan öğrencileri döndüren fonksiyon
{
	System.out.println("Students of "+getName());        
	for(String i: coursesStudents)
	        {
	        	
	            if(i==null)
	            {
	                break;
	            }
	            System.out.println(i);
	        }
	    
	   

}


	

}
