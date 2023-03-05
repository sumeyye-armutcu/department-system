
public class Assistant extends Person{
	
	private String lecturer;//Asistanın yanında görev yapacağı öğretmen
	
	public Assistant(String name_surname, String id_number) {
		super(name_surname, id_number);
		// TODO Auto-generated constructor stub
	}

	public String getLecturer() {
		return lecturer;
	}


	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}


	public void WhoseAsisstant() //Asistanın hangi öğretmenin asistanı olduğunu döndürür.
	{
        if(getLecturer()==null) {//eğer asistan bir öğretmene atanmadıysa hata verir
            System.out.println("No lecturer attendent to "+getName_surname());

        }
        else {
        System.out.println("Assistant of "+getLecturer());
        }
    }

}
