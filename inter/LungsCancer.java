package inter;
import java.util.ArrayList;

public class LungsCancer extends IsIncurable{
    LungsCancer (){
		this.symptoms = new ArrayList<String>();
		this.inform = "You've lungsCancer and its incurable ";
	}
  	public String treatment(){
     	return "prays";
  	}	
    public String listSymptoms(){
      String list = new String();
    	symptoms.add("Cough");
    	symptoms.add("Intense pain");
        symptoms.add("Blood in urine");
        symptoms.add("Hard breathing");
   		for(String s: symptoms) {
			list+= (s + ", ");
		}
      return list;
    }
  	public void describe(){
  		System.out.println("Symptoms - " + this.listSymptoms() + "; and- " + this.inform + ". Only treatment is "  + this.treatment() + "\n");
	} 
}
