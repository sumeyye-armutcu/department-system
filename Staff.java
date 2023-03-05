
public class Staff {
	private String id_number;
	private int working_hours;
	private String task_information;
	
	public Staff(String id_number, int working_hours, String task_information)
	{
		this.id_number=id_number;
		this.working_hours=working_hours;
		this.task_information=task_information;
	}
	
	
	public void setId_number(String id_number)
	{
		this.id_number=id_number;
	}
	
	public String getId_number()
	{
		return id_number;
	}
	
	public void setWorking_hours(int working_hours)
	{
		this.working_hours=working_hours;
	}
	
	public int getWorking_hours()
	{
		return working_hours;
	}
	
	
	
	public String getTask_information()
	{
		return task_information;
	}
	
	
	
	
	

}
