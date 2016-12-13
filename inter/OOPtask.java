package inter;

public class OOPtask {
	public static void main(String[] args)
	{
		Hospital hospital = new Hospital();		
		Illness c = new Cold();
		Illness l = new LungsCancer();
		Illness a = new Appendicitis();	
			
		hospital.Add(c);
		hospital.Add(a);
		hospital.Add(l);
		hospital.DesribeAll();
	}
}
