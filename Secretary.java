public class Secretary extends Staff {

	 public Secretary(String id_number, int working_hours, String task_information)
	    {
	        super(id_number, working_hours, task_information);
	    }

	    public void addCourse(Lecturers lecturer, Lessons lesson)//Öğretmene ders atayan fonksiyon
	    {
	        lecturer.addCoursetoLecturer(lesson);
	    }
	    public void removeCourse(Lecturers lecturer, Lessons lesson)//Öğretmenden dersi silen fonksiyon
	    {
	        lecturer.removeCoursetoLecturer(lesson);
	        if(lecturer.getflag())
	        {
	            System.out.println("Course not found.");//Değiştirilmek istenen ders, belirtilen öğretmenin dersi değilse hata verir.
	            lecturer.setFlag(false);
	        }
	    }

	    public void show(Lecturers lecturer)//Öğretmenin verdiği dersleri döndüren fonksiyon
	    {
	       System.out.println("Lessons of "+lecturer.getName_surname());
	    	for(String i: lecturer.getCourses())
	        {
	            if(i==null)
	            {
	                break;
	            }
	            System.out.println(i);
	        }
	    }

	    public void replaceCourse(Lecturers lecturer1,Lecturers lecturer2, Lessons lesson)//Dersin öğretmenini değiştiren fonksiyon
	    {

	        lecturer1.removeCoursetoLecturer(lesson);//Ders, dersi veren eski öğretmenden silinir. 
	        if(lecturer1.getflag())
	        {
	            System.out.println("No course found to be changed.");//Dersi 1. öğretmenden 2. öğretmene atamak istersek ve 1. öğretmen zaren o dersi vermiyorsa hata verir.
	            lecturer1.setFlag(false);
	            return;
	        }
	        addCourse(lecturer2,lesson);//



	    }
	    
	    
	    public void numberOfStudentsInCourse(Lessons lesson) {//Parametre olarak girilen kursun kaç öğrencisi olduğunu döndürür.
            int j=0;
            for(String f:lesson.getCoursesStudents()) 
            {
                if(f!=null) {
                    j++;

                }
            }
            System.out.println(lesson.getName()+ " course has "+j+" students");
        }
	    
	    public void addAssistant(Lecturers lecturer, Assistant assistant)//Parametredeki öğretmene parametredeki asistana atayan metot.
        {

            lecturer.addAssistanttoLecturer(assistant);

        }
}
	


		

	
		
		
		
	
	
	
	
	



