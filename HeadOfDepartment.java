public class HeadOfDepartment extends Lecturers {


    public HeadOfDepartment(String name_surname, String id_number) {
        super(name_surname, id_number);

    }



    public void giveCertificate(Student student)//Öğrenciye sertifika verir. Eğer öğrenci gerekli kriterleri karşılamıyorsa sertifika alamaz.
    {

        if(student instanceof UndergraduatedStudents )//if the parameter student is UndergraduatedStudent 
        {
            int j=0;// number of course the student has
            for(String f:student.studentCourses) //assigns the number of not null elements in studentCourses array to j
            {
                if(f!=null) {
                    j++;
                }
            }

            if(j>=40 && student.getGPA()>=2.0)//if number of course the student has is greater or equals to 40 and students gpa greater or equals to 2.00 over gives certificate
            {
                System.out.println("The certificate is given to "+student.getName_surname());
            }
            else
            {
                System.out.println(student.getName_surname()+" can not take the certificate");
            }


        }

else if(student instanceof GraduatedStudents)//if the parameter student is GraduatedStudent 
        {
            GraduatedStudents s = (GraduatedStudents) student;//DownCasting (for reaching GraduatedStudents variables over parameter Student),(degreeyi çağırabilmek için)
            if(s.getDegree()=="master")//if the GraduatedStudents degree is "master"
            {
                int j=0;
                for(String f:student.studentCourses) {//assigns the number of not null elements in studentCourses array to j

                    if(f!=null) {
                        j++;
                    }
                }
                if(j>=7 && student.getGPA()>=2.5)//if number of course the student has is greater or equals to 7 and students gpa greater or equals to 2.5 over gives certificate
                {
                    System.out.println("The certificate is given to "+student.getName_surname());
                }
                else
                {
                    System.out.println(student.getName_surname()+" can not take the certificate");
                }
            }

            else if(s.getDegree()=="doctoral")//if the GraduatedStudents degree is "doctoral"
            {
                int j=0;
                for(String f:student.studentCourses) {//assigns the number of not null elements in studentCourses array to j

                    if(f!=null) {
                        j++;
                    }
                }
                if(j>=8 && student.getGPA()>=3.0)//if number of course the student has is greater or equals to 8 and students gpa greater or equals to 3.0 over gives certificate
                {

                    System.out.println("The certificate is given to "+student.getName_surname());
                }

                else
                {

                    System.out.println(student.getName_surname()+" can not take the certificate");
                }
            }
        }
    }

}