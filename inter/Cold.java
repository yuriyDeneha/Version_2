package inter;
import java.util.ArrayList;

public class Cold extends IsCurable{
	Cold (){
		this.symptoms = new ArrayList<String>();
	}
   public String treatment(){
   	return "Hot tea and pills";
  }	
  public String listSymptoms(){
    String list = new String();
     symptoms.add("Cough");
     symptoms.add("Fever");
   	 for(String s: symptoms) {
			list += (s + ", ");
	 }
    return list;
  }
  public  void describe(){
	    System.out.println("Cold: symptoms - " + this.listSymptoms() + "; treatment- " + this.treatment()+ "\n");
  }    
}
