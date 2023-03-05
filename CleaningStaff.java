
public class CleaningStaff extends Staff {
	
	public CleaningStaff(String id_number, int working_hours, String task_information)
	{
		super(id_number, working_hours, task_information);
	}
	
	
	public void Clean(Canteen canteen)//Kantini temizleme fonksiyonu
    {
        if(canteen.getPopulation()<5)
        {
            System.out.println("Canteen is clean.");
        }
        else
        {
            canteen.setPopulation(0);
            canteen.setSituation("Clean");
            System.out.println("Canteen has been cleaned.");
        }
    }
	
	public void Clean(Garden garden)//Bahçeyi temizleme fonksiyonu
    {
        if(garden.getPopulation()<5)
        {
            System.out.println("Garden is clean.");
        }
        else
        {
            garden.setPopulation(0);
            garden.setSituation("Clean");
            System.out.println("Garden has been cleaned.");
        }
    }
    public void Clean(Classrooms clasroom)//Sınıfları temizleme fonksiyonu
    {
        if(clasroom.getPopulation()<5)
        {
            System.out.println("Clasroom is clean.");
        }
        else
        {
            clasroom.setPopulation(0);
            clasroom.setSituation("Clean");
            System.out.println("Clasroom has been cleaned.");
        }
    }
	
	
	
	
	
	
}
