import java.util.HashMap;

public class Bins {
    static HashMap<Integer, Integer>  numberStorage = new HashMap<Integer, Integer>();
    private static Integer bin;
    Integer one;
    Integer two;


    public Bins (Integer one, Integer two){
        this.one=one;
        this.two=two;

    }

    public static HashMap<Integer, Integer> numberOfTallyPerBin(Integer diceRollNummber, Integer tallyMark) {

        if ( numberStorage.containsKey(diceRollNummber)) {
            int previousNumber= numberStorage.get(diceRollNummber);

             previousNumber+=tallyMark;

           numberStorage.put(diceRollNummber, previousNumber);
        }else
            numberStorage.put(diceRollNummber,tallyMark);

        return numberStorage;
    }


    public Integer getBin() {
        return bin;
    }

    public void setBin(Integer bin) {
        this.bin = bin;
    }


    public Integer resultsIncrement (Integer bin){
      int number=  numberStorage.get(bin) +1;
         return number;
    }



}
