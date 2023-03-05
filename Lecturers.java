import java.util.Scanner;

public class Lecturers extends Person{
	
	private static final int MAX_COURSE=10;
	private String rank;//Öğretmenin rütbesi
	private String asistant;//Öğretmene atanan asistanı tutan değişken
	
    public Lecturers(String name_surname,String id_number)
    {
        super(name_surname,id_number);
    }
    
    
    public Lecturers(String name_surname, String id_number, String rank) {
		super(name_surname, id_number);
		this.rank = rank;
		
	}




public String getRank() {
		return rank;
	}


	public void setRank(String rank) {
		this.rank = rank;
	}


	public String getAsistant() {
		return asistant;
	}


	public void setAsistant(String asistant) {
		this.asistant = asistant;
	}




Scanner scan=new Scanner(System.in);

    private  String[] Courses=new String[MAX_COURSE];//Öğretmenin verdiği kursları tutan dizi
    public String[] getCourses() {
        return Courses;
    }
    
  int control3=0;

    public void addCoursetoLecturer(Lessons course)
    {
    	
    	for(int i=0; i<Courses.length;i++)
	       {
			   
	           if(Courses[i]==course.getName())
	           {
	        	      
	        	   control3=1;//Öğretmen dersi veriyorsa control değişkeni 1 olur.
	        	   break;//Bulduktan sonra diğer elemanları da boş yere kontrol etmemesi için.
	        	   
	           }
	           
	          

	       }
    	
    	if(control3==0)//Ders öğretmene zaten kayıtlı değilse ders eklenir.
    	{
    		for(int i=0;i<10;i++)
            {
                if(Courses[i]!=course.getName()) 
                {
                    if(Courses[i]==null)
                    {
                       Courses[i]=course.getName();
                       System.out.println(course.getName()+" is added to "+getName_surname());
                       return;
                      }
                    
                 }
               
            } 
    		
               
    		
    	}
    	
      else
      {
          System.out.println(getName_surname()+" is already giving "+course.getName());
          control3=0;
          return;
       }	
    	
    	System.out.println(getName_surname()+" access to max course number.");
 	

 }
    
    private boolean flag=false;//Kursun olup olmadığı kontrolünün yapılabilmesi için flag değişkeni başlangıçta false olarak tanımlanır.
    public boolean getflag() {
        return flag;
    }

	public void setFlag(boolean flag) {
		this.flag = flag;
	}


	public void removeCoursetoLecturer(Lessons course)//Dersi öğretmenden kaldırır. Öğretmenin verdiği dersler arasından silinmek istenen ders kaldırılır. Dizi silinen elemandan sonrasıyla tekrar birleştirilir.
    {
        for(int i=0;i<10;i++)
        {
            if(course.getName()==Courses[i])
            {
                for(int j=i;j<10;j++)
                {
                    if(Courses[j]==null )
                    {
                        return;
                    }
                    if(j+1==10)
                    {
                        Courses[j]=null;
                        return;
                    }
                    Courses[j]=Courses[j+1];

                }

            }
        }
            System.out.println("Inaccurate operation!");//Öğretmen dersi vermiyorsa hata verir.
            this.flag=true;//secretary sınıfında removecourses ve replacecourses metodlarına girip if ile tanımlanan hataları gösterir.

    }

    
	int control=0;//Öğrenci dersi alıyor mu kontrolü
	int control2=0;//Öğretmen dersi veriyor mu kontrolü
	int j=0;//Döngü için tanımlanmıştır
	int length=0;//getGradeWithCredit dizisinin büyüklüğü 
    public void getGrade(Student student, Lessons lesson)//Önce öğretmenin dersi verip vermediği ve öğrencinin dersi alıp alöadığı kontrol edilir. Öğretmen dersi veriyor ve aynı zamanda öğrenci dersi alıyorsa öğretmen öğrenciye o dersin notunu verir.
    {
    	for(int i=0;i<student.getGradeWithCredit().length;i++)//Bu döngü gerekli kontrolleri yapabilmek için öğrencinin toplamda kaç ders aldığını gösteren fonksiyondur. Dizinin boş elemanlarının hesaba katılmaması için bu döngüye ihtiyaç duyulmuştur.
		   {
			   if(student.getGradeWithCredit()[i]!=0)
			   {
				   length++;
			   }
			   
			
		   }
    	for(int i=0; i<student.studentCourses.length;i++)//Öğrenci not verilmek istenen dersi alıyorsa control değişkeni 1 olur. 
	       {
			   
	           if(student.studentCourses[i]==lesson.getName())
	           {
	        	     control=1; 
	        	   break;
	     	   
	           }

	       }
    	
    	for(int k=0; k<Courses.length;k++)//Öğretmenin not verilmek istenilen dersi verip vermediği kontrol edilir
    	{
    		if(Courses[k]==lesson.getName())
    		{
    			control2=1;//Öğretmen dersi veriyorsa control2 değişkeni 1 olur.
    			break;
    		}
    	}
    	
    	 if(control==1 && control2==1)// Öğretmen dersi veriyorsa ve öğrenci dersi alıyorsa not verilir.
         { 
    		 
    	 
    		 System.out.println("Please enter "+ lesson.getName()+" grade for "+student.getName_surname());
    		 
    		 student.setGrade(scan.nextFloat());//Not alınır
    			 float gwc=lesson.getCredit()*student.getGrade();// Not girildiği zaman daha sonralarda öğrencinin ortalamasının hesaplanmabilmesi için girilen not kredi değeri ile çarpılıp bir dizide tutulur. 

    			 student.getGradeWithCredit()[j]=gwc;//Bir üst satırda bahsadilen diziye elemanları atanır.
    			 j++;
    			 student.totalCredit+=lesson.getCredit();//Öğrencinin ortalamasının hesaplanabilmesi için notları girilen derslerin kredilerinin toplanı hesaplanır.
    			 control=0;//Her seferinde tekrardan kontrol yapabilmesi için control değişkeni sıfırlanır.
    			 
    			 if(j==length)//Her öğrenci için dizi sıfırdan tekrar eder. Yoksa bir önceki öğrencinin değerlerinin üstüne ekler.
    	 		 	{
    	 		 		j=0;
    	 		 		length=0;
    	 		 	}
    			
    			 return;
    			
         }
    	  	 
         else if(control==0)//Öğrenci dersi almıyorsa hata verir.
         {
       	    System.out.println(student.getName_surname()+" does not take "+lesson.getName());
       	    return; 
       	  
         }
    	 
         else
         {
        	 System.out.println(getName_surname()+" is not an instructor of "+lesson.getName());//Öğretmen dersi vermiyorsa hata verir.
        	 return;
         }
   
    	
 
   	 
   }
    
    public void askRank()// Öğretmenin rütbesini döndürür: prof, araştırma görevlisi vs.
    {
    	System.out.println(getRank()+getName_surname());
    	
    	
    }
    
    
    public void askDiscount(Canteen canteen)//Kantin sınıfında açıklanan indirim fonksiyonunu kullanarak öğretmen için uygulanan indirimi hesaplar ve indirimli fiyatı döndürür
	   {
		   canteen.calculateDiscount(0.18);
	   }
    
    private static final int MAX_AS=2;
    
    private  String[] Assistant=new String[MAX_AS];//Öğretmenin asistanlarının tutulduğu dizi. Her öğretmene maksimum iki asistan atanabilir.
    public String[] getAssistant() {
        return Assistant;
    }
    
    
    
    public void addAssistanttoLecturer(Assistant assistant) //Öğretmene maksimum iki asistan atayan fonksiyon
    {

        for(int i=0;i<2;i++)
        {
            if(Assistant[i]==null)
            {
                Assistant[i]=assistant.getName_surname();
                assistant.setLecturer(getName_surname());
                System.out.println(assistant.getName_surname()+"is attend to "+getName_surname());

                return;
            }
        }
        System.out.println(getName_surname()+" has max number of assistants.");




    }
    public void showAssistant() //Öğretmenin asistanlarını döndüren fonksiyon
    {
        System.out.println(getName_surname()+"'s assistants:");
        for(String i: Assistant)
        {

            if(i==null)
            {
                break;
            }
            System.out.println(i);
        }
    }
    
    
	  
}
