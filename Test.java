//Test sınıfı
public class Test {

	public static void main(String[] args) 
	{
		GraduatedLessons lesson1=new GraduatedLessons("771","Ders1",6);
        GraduatedLessons lesson2=new GraduatedLessons("772","Ders2",5);
        GraduatedLessons lesson3=new GraduatedLessons("773","Ders3",4);
        UndergraduatedLessons lesson4=new UndergraduatedLessons("774","Ders4",6);
        UndergraduatedLessons lesson5=new UndergraduatedLessons("775","Ders5",5);
        UndergraduatedLessons lesson6=new UndergraduatedLessons("776","Ders6",4);
        GraduatedLessons lesson7=new GraduatedLessons("777","Ders7",5);
        GraduatedLessons lesson8=new GraduatedLessons("778","Ders8",4);
        UndergraduatedLessons lesson9=new UndergraduatedLessons("779","Ders9",6);
        UndergraduatedLessons lesson10=new UndergraduatedLessons("780","Ders10",5);
        UndergraduatedLessons lesson11=new UndergraduatedLessons("781","Ders11",5);
        
        UndergraduatedStudents student1=new UndergraduatedStudents ("Sümeyye","456","2019");
        GraduatedStudents student2=new GraduatedStudents("Eyüp", "123","2019","master");
        GraduatedStudents student3=new GraduatedStudents("ali", "123","2019","doctoral");
        GraduatedStudents student4=new GraduatedStudents("Elif", "125","2019","master");
        GraduatedStudents student5=new GraduatedStudents("oğuz", "123","2019","master");
        
        Lecturers teacher= new Lecturers("Eyüp","124","Prof.");
        Lecturers teacher1= new Lecturers("Sümeyye","124");
        Secretary sec=new Secretary("456",8,"sekreter");
        
        sec.addCourse(teacher, lesson1);
        sec.addCourse(teacher, lesson2);
        sec.addCourse(teacher, lesson3);
        sec.addCourse(teacher, lesson4);
        sec.addCourse(teacher, lesson5);
        sec.addCourse(teacher, lesson6);
        sec.addCourse(teacher, lesson7);
        sec.addCourse(teacher, lesson8);
        sec.addCourse(teacher, lesson9);
        sec.addCourse(teacher, lesson10);
        sec.addCourse(teacher, lesson10);
        
        sec.addCourse(teacher, lesson11);
        
        
        sec.show(teacher);
        
        sec.removeCourse(teacher, lesson6);
        
        sec.show(teacher);
        
        sec.addCourse(teacher, lesson6);
        
        sec.show(teacher);
        
        student4.addlessons(lesson2);
        student4.addlessons(lesson3);
        student2.addlessons(lesson1);
        student2.addlessons(lesson2);
        student2.addlessons(lesson3);
        student3.addlessons(lesson1);
        student3.addlessons(lesson2);
        student3.addlessons(lesson3);
        student5.addlessons(lesson1);
        student5.addlessons(lesson2);
        student5.addlessons(lesson3);
        
        student4.showLessons();
        student4.isTaken(lesson11);
        student4.isTaken(lesson2);
        student4.isTaken(lesson10);
        student4.isTaken(lesson9);
        student4.isTaken(lesson3);
        
        teacher.getGrade(student4, lesson2);
        teacher.getGrade(student4, lesson10);
        
        student4.GPA();
        
        sec.replaceCourse(teacher, teacher1, lesson5);
        
        sec.show(teacher1);
        
        HeadOfDepartment hod=new HeadOfDepartment("A","111");
        
        hod.giveCertificate(student1);
        student4.notEnoughCourses(student4);
        lesson2.showStudent();
        
        
        teacher1.getGrade(student4, lesson2);
        
        TechnicalStaff ts=new TechnicalStaff("123",8,"ts");
        CleaningStaff cs=new CleaningStaff("123",8,"cs");
        Garden garden=new Garden("temiz");
        Canteen c=new Canteen("temiz");
        ts.howmany_tree(garden);
        
        garden.plant();
        ts.howmany_tree(garden);
        cs.Clean(garden);
        
        student1.go(garden);
        student2.go(garden);
        student3.go(garden);
        student4.go(garden);
        student5.go(garden);
        
        System.out.println(garden.getPopulation());
        
        cs.Clean(garden);
        
        System.out.println(garden.getPopulation());
        
        student1.askDiscount(c);
	}

}