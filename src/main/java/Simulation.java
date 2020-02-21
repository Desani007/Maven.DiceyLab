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
         ArrayList<Integer> ints = new ArrayList<Integer>();
         System.out.println("***");
         System.out.println("Simulation of 2 dice tossed for 1000000 times.");
         System.out.println("***");

         for (Map.Entry<Integer, Integer> i : Bins.numberStorage.entrySet()) {
             i.getKey();
             i.getValue();
             ints.add(i.getKey());

             for ( int g =bins.one; g<bins.two; g++){
                 System.out.println(i.getKey());
             }
         }

         Collections.sort(ints);

        for ( int f =0 ; f<ints.size();f++){

             System.out.println(ints.get(f));



            }

         runSimualtion();





     }



}
