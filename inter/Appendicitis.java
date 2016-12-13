package inter;
import java.util.ArrayList;

public class Appendicitis extends IsCurable{
	  Appendicitis (){
			this.symptoms = new ArrayList<String>();
		}
	  public String treatment(){
	   	return "surgery";
	  }	
	  public String listSymptoms(){
	    String list = new String();
	     symptoms.add("Stomachache");
	     symptoms.add("Intense pain");
	   	 for(String s: symptoms) {
				list+= (s + ", ");
		 }
	    return list;
	  }
	  public void describe(){
	    System.out.println( "Appendicitis: symptoms - " + this.listSymptoms() + "; treatment- " + this.treatment()+ "\n");
	  } 
}
