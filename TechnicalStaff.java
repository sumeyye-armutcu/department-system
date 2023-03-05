
public class TechnicalStaff extends Staff {
	public TechnicalStaff(String id_number, int working_hours, String task_information)
	{
		super(id_number, working_hours, task_information);
	}
	
	
	public void howmany_tree(Garden garden)//Bahçeye kaç ağaç dikildiğini kontrol eder.
    {
        
		System.out.println("The number of trees: "+garden.getTree());
    }


}
