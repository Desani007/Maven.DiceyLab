import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class Simulation {

    Dice dice;
    Integer howManyTimes;
    Bins bins;

     public Simulation (Integer numberOfRolls, Integer howManyTimes){
          dice = new Dice(numberOfRolls);
          this.howManyTimes=howManyTimes;
          bins= new Bins(numberOfRolls,numberOfRolls*6);

     }

     public void runSimualtion(){
         for ( int i=0; i<howManyTimes;i++) {
             dice.tossAndSum();
         }


     }

     public void printResults (){
         runSimualtion();
         ArrayList<Integer> value = new ArrayList<Integer>();
         ArrayList<Integer> key = new ArrayList<Integer>();
         System.out.println("***");
         System.out.println("Simulation of 2 dice tossed for 1000000 times.");
         System.out.println("***");

         for (Map.Entry<Integer, Integer> i : Bins.numberStorage.entrySet()) {

              float work =i.getValue().floatValue()/howManyTimes;
              String start="";
              float pleaseWork = work*100;

              for ( int f = 0; f < pleaseWork; f++){
                  start+="*";
              }


             System.out.println(String.format("%2d : %10d:  %.2f  %s",i.getKey(),i.getValue(),work,start));






         }















     }



}
