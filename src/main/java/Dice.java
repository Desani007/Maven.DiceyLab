import java.util.HashMap;

public class Dice {
    Integer numberOfDice;


    public Dice (Integer numberOfDice ){
        this.numberOfDice=numberOfDice;
    }

    public Integer tossAndSum() {
        int counter = 0;
        int dice = 0;
        int total=0;
        int tally=0;

        while (numberOfDice > counter) {

            dice = (int) (Math.random() * 6) +1 ;
            counter++;
            total+=dice;

        }
        tally++;

        Bins.numberOfTallyPerBin( total, tally);
        tally=0;


        return total;
    }




    public static void main (String [] args){
    Simulation s = new Simulation(2,20);
    s.printResults();
    }


}





