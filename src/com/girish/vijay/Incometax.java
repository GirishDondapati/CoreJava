/*
 * Complete the function below.
 */
public class Incometax{
    static int taxAmount(int totalIncome) {
        int incometax=0;
        if(totalIncome<200000){
        	return incometax; 
        }
        else if(totalIncome>200000 && totalIncome<500000){
            incometax=incometax+(int)(totalIncome*0.10);
            System.out.println(incometax);
            return incometax;
        }
        else if(totalIncome>500000 && totalIncome<1000000){
            incometax=30000+(int)(incometax+totalIncome*0.20);
            System.out.println(incometax);
            return incometax;
        }
        else 
            incometax=130000+(int)(incometax+totalIncome*0.30);
            System.out.println(incometax);
            return incometax;

    }
 public static void main(String args[]){
     int totalIncome=1200000;
     Incometax.taxAmount(totalIncome);
 }
}
