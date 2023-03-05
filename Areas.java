
public abstract class Areas 
{//abstract class oluşturduk çünkü obje oluşturmaya gerek yok.
  private String situation;//Areaların genel durumları: temiz,kirli
  private int population=0;//Arealarda bulunan kişi sayısı
  
 
public Areas(String situation) {

	this.situation = situation;
	
}


public int getPopulation() {
	return population;
}

public void setPopulation(int population) {
	this.population = population;
}


public String getSituation() {
	return situation;
}
public void setSituation(String situation) {
	this.situation = situation;
}

 

}
