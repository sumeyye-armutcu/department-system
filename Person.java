
public class Person {
	private String name_surname;
	private String id_number;
	
	public Person(String name_surname,String id_number){
		this.name_surname=name_surname;
		this.id_number=id_number;					
		}
	public String getName_surname() {
	    return name_surname;
	  }
	public void setName_surname(String name_surname) {
	    this.name_surname = name_surname;
	  }
	public String getId_number() {
	    return id_number;
	  }
	public void setId_number(String id_number) {
	    this.id_number = id_number;
	  }
	
	public void go(Areas areas)//Öğrencinin gittiği areayı gösteren metot
    {
        if(areas instanceof Canteen ) 
     {
         Canteen s = (Canteen) areas;
         int a=s.getPopulation();//a değişkeni geçici kişi sayısını alan bi değişken 
         s.setPopulation(++a);
         if(a==5)//Eğer o areada 5'den fazla person bulunuyorsa area kirli kabul edilir.
         {
             s.setSituation("Dirty.");
         }
     }

        if(areas instanceof Garden ) 
         {
             Garden s = (Garden) areas;
             int a=s.getPopulation();//a değişkeni geçici kişi sayısını alan bi değişken 
             s.setPopulation(++a);
             if(a==5)//Eğer o areada 5'den fazla person bulunuyorsa area kirli kabul edilir.
             {
                 s.setSituation("Dirty.");
             }
         }
        if(areas instanceof Classrooms ) 
         {
             Classrooms s = (Classrooms) areas;
             int a=s.getPopulation();//a değişkeni geçici kişi sayısını alan bi değişken 
             s.setPopulation(++a);
             if(a==5)//Eğer o areada 5'den fazla person bulunuyorsa area kirli kabul edilir.
             {
                 s.setSituation("Dirty.");
             }
         }


    }

}
