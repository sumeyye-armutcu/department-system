
public class Garden extends SocialAreas {

	public Garden(String situation) {
		super(situation);
		// TODO Auto-generated constructor stub
	}

	private int tree=0;//Bahçedeki ekilen ağaç sayısı
    public int getTree() {
        return tree;
    }
	
	public void plant()//Ağaç ekme fonksiyonu
    {
        System.out.println("Tree is planted");
        tree++;
    }
	

}
