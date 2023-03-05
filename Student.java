
public abstract class Student extends Person{
	private String year;//Öğrencinin kayıt yılı
	   private float grade;//Öğrencinin girilen notu
	   private String courseInformation;
	   public int totalCredit=0;//Öğrenciye not girildikçe aldığı kredi de artar.
	   private float GPA;//Öğrencinin ortalaması
	   


	public float getGPA() {
		return GPA;
	}

	public void setGPA(float gPA) {
		GPA = gPA;
	}

	public Student(String year, float grade, String information,String name_surname, String id_number)
	   {
	       super(name_surname, id_number);
	       this.year=year;
	       this.grade=grade;
	       this.courseInformation=information;
	   }

	   public Student (String name_surname, String id_number, String year)
	   {
	       super(name_surname, id_number);
	       this.year=year;
	   }


	   public String getYear()
	   {
	       return year;
	   }

	   public void setGrade(float grade)
	   {
		   this.grade=grade;
	   }
	   
	   public float getGrade()
	   {
	       return grade;
	   }

	   public String information()
	   {
	       return courseInformation;
	   }


	   String[] studentCourses=new String[100];//Öğrencinin aldığı kursları tutan dizi
	   int i=0;
	   public int elements=0;//Öğrencinin aldığı ders sayısını tutan değişken
	   
	   int control4;
	   
	   public void takeCourse(Lessons course)//Öğrenciye ders ekleyen fonksiyon
	   {
		   for(int i=0; i<studentCourses.length;i++)
	       {
			   
	           if(studentCourses[i]==course.getName())
	           {
	        	      
	        	   control4=1;//Öğrenci dersi alıyorsa control değişkeni 1 olur.
	        	   break;//Bulduktan sonra diğer elemanları da boş yere kontrol etmemesi için.
	        	   
	           }
	           
	          

	       }
		   
		     if(control4==0)
	          { 
		    	 studentCourses[i]=course.getName();
		  	      course.getCoursesStudents()[i]=this.getId_number();
		  	      i++;
		  	      elements++;
		  		  control4=0;
	        	  
	          }
	 
	   }
	   
	
	   int control;
	  
	public  void isTaken(Lessons course)//Öğrencinin kurslarının tutulduğu diziyi baştan sona gezip öğrencinin sorgulanan dersi alıp almadığını kontrol eder.
	   {
		  
		   
		   for(int i=0; i<studentCourses.length;i++)
	       {
			   
	           if(studentCourses[i]==course.getName())
	           {
	        	      
	        	   control=1;//Öğrenci dersi alıyorsa control değişkeni 1 olur.
	        	   break;//Bulduktan sonra diğer elemanları da boş yere kontrol etmemesi için.
	        	   
	           }
	           
	          

	       }
		   
		     if(control==1)
	          { 
	        	  System.out.println("The student takes this course."); //Ders dizide bulunursa bu koşul çalışır 
	        	  control=0;
	          }
	          else
	          {
	        	  System.out.println("The student doesn't take this course."); //Ders dizide bulunmazsa öğrenci dersi almıyor hatası verir
	        	  
	        	  
	          }
		   
           
      
	   }
	
	
	   
	  
	   public void addlessons(Lessons lessons)//Öğrencinin kendi seviyesinde dersleri alabilmesi için gerekli kontrolleri yapar. Ders ve öğrenci seviyesi aynıysa dersi öğrenciye atar.
	   {
	       if(this instanceof UndergraduatedStudents && lessons instanceof UndergraduatedLessons)
	       {
	    	  
	           takeCourse(lessons);
	           if(control4==0)
	           {
	        	   System.out.println("The course is added!");
	           }
	           else
	           {
	        	   System.out.println("The Student has already taken this course ");
	        	   control4=0;
	           }

	       }
	       
	       else if(this instanceof GraduatedStudents && lessons instanceof GraduatedLessons)
	       {
	    	   takeCourse(lessons);
	           if(control4==0)
	           {
	        	   System.out.println("The course is added!");
	        	   
	           }
	           else
	           {
	        	   System.out.println("The Student has already taken this course ");
	        	   control4=0;
	           }
	       }
	       
      else

	       {
	           System.out.println("Student can not take this course.");//Ders ve öğrenci seviyesi uyuşmazsa hata verir.
	       }

	   }
	   
	   
	   public void showLessons()//Öğrencinin aldığı dersleri gösterir.
	    {
	       System.out.println("Lessons of "+getName_surname()); 
		   for(String i: studentCourses)
	        {
	            if(i==null)
	            {
	                break;
	            }
	            System.out.println(i);
	        }
	    }
	   
	   private float[] gradeWithCredit=new float[100]; //Öğrencinin ders notlarının derslerin kredileriyle çarpımlarını tutar. Bu dizi dsaha sonra öğrencinin ortalamasını hesaplamak için kullanılır.
	   public float[] getGradeWithCredit()
	   {
		   return gradeWithCredit;
	   }
	   
	   int length=0;
	   public void GPA()//Öğrencinin ortalamasını hesaplayan fonksiyon
	   {
		   
		   for(int i=0;i<gradeWithCredit.length-1;i++)
		   {
			   if(gradeWithCredit[i]!=0)//Burda önce dizinin sıfır olmayan elemanlarının sayısı saptanır.
			   {
				   length++;
			   }
		   }
		   float total=0;//Dizinin bütün elemanlarını toplamak için başlangıçta toplam değişkeni sıfır belirlenir.
		   
		   for(int i=0; i<length; i++)
		   {
			   if(gradeWithCredit[i]==0)
			   {
				   break;
		
			   }
			   total+=gradeWithCredit[i];//Bahsedilen dizideki tüm elemanlar toplanır.
			   
		   }
		   setGPA(total/(totalCredit*25));//Öğrencinin ortalaması hesaplanır.
		   System.out.println("The GPA of "+getName_surname()+":"+getGPA());//
		   
	   }
	   
	   public void notEnoughCourses(Student student) {//Öğrencinin sertifika alabilmesi için daha ne kadar ders alması gerektiğini kontrol eder.
	       int j=0;
	       int k = 0;
	           for(String i: studentCourses)
	            {
	                if(i!=null)
	                {
	                    j++;
	                }

	       }
	           if(student instanceof GraduatedStudents ) {
	               GraduatedStudents s = (GraduatedStudents) student;
	                if(s.getDegree()=="master")
	                {
	                    k=7-j;
	                }
	                if(s.getDegree()=="doctoral") 
	                {
	                    k=8-j;
	                }
	           }
	           else if(student instanceof UndergraduatedStudents ) {
	               k=40-j;
	               }
	           if(k<=0){

	              System.out.println( super.getName_surname()+" has token enough courses");
	           }
	           else {
	               System.out.println(super.getName_surname()+" has to get "+k+ " courses to get certificate");
	           }


	       }
	   
	   

	   public void askDiscount(Canteen canteen)//Kantin sınıfında açıklanan indirim fonksiyonunu kullanarak öğretmen için uygulanan indirimi hesaplar ve indirimli fiyatı döndürür
	   {
		   canteen.calculateDiscount(0.20);
	   }

   
 }









  
	


