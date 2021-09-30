public class MyMain {
    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        return (int) (Math.random()*6) + 1;
    }

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int successtrials=0;
        for (int i = 0; i < 10000; i++) {
            Boolean pass=false;
            for (int j = 0; j < 6; j++) {
                if(rollDie()==6)
                {
                    pass=true;
                    break;
                }
            }
            if(pass) {
                successtrials++;
            }
        }
        return ((double) successtrials)/100;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int successtrials=0;
        for (int i = 0; i < 10000; i++) {
            Boolean pass=false;
            int diecount=0;
            for (int j = 0; j < 12; j++) {
                if(rollDie()==6)
                {
                    diecount++;
                }
                if(diecount>=2)
                {
                    pass=true;
                    break;
                }
            }
            if(pass) {
                successtrials++;
            }
        }
        return ((double) successtrials)/100;
    }

    // Calculate the probability of rolling at least three 6's when rolling
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int successtrials=0;
        for (int i = 0; i < 10000; i++) {
            Boolean pass=false;
            int diecount=0;
            for (int j = 0; j < 18; j++) {
                if(rollDie()==6)
                {
                    diecount++;
                }
                if(diecount>=3)
                {
                    pass=true;
                    break;
                }
            }
            if(pass) {
                successtrials++;
            }
        }
        return ((double) successtrials)/100;
    }

    public static void main(String[] args) {
        System.out.println("Rolling 10 dice: ");
            for (int i = 0; i < 10; i++) {
                System.out.println(rollDie());
            }
        System.out.println("Estimated probability for rolling one six out of six dice: " + probabilityOneSix());
        System.out.println("Estimated probability for rolling two sixes out of twelve dice: " + probabilityTwoSixes());
        System.out.println("Estimated probability for rolling three sixes out of eighteen dice: " + probabilityThreeSixes());
    }
}
