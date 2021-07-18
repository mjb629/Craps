/******************************************************************************
 *  Compilation:  javac Craps.java
 *  Execution:    java Craps
 *  
 *  Play 1 million games of craps and print probability of winning.
 *
 *  Craps simulation of "pass bet"           
 *  True odds of winning = 244/495 = 0.4929292929...
 * 
 *  % java Craps
 *  Winning percentage = 0.493396
 *
 *  % java Craps
 *  Winning percentage = 0.492537
 *
 *  % java Craps
 *  Winning percentage = 0.492998
 * 
 ******************************************************************************/

public class Craps {

    // uniform random integer in [0, n) 
    public static int uniform(int n) {
        return (int) (Math.random() * n);
    } 

    // return sum of two dice
    public static int sumOfTwoDice() {
        int x = 1 + uniform(6);
        int y = 1 + uniform(6);
        return x + y;
    }


   /***************************************************************************
    * Pass bet:
    *
    * Player rolls two dice. Let x be sum.
    *   - if x is 7 or 11 instant win
    *   - if x is 2, 3, or 12 instant loss
    *   - otherwise player repeatedly rolls two dice until sum is x or 7
    *        if sum is x then win
    *        if sum is 7 then lose
    ***************************************************************************/
    public static boolean winsPassBet() {
        int x = sumOfTwoDice();
        if (x == 7 || x == 11)           return true;
        if (x == 2 || x == 3 || x == 12) return false;

        while (true) {
            int y = sumOfTwoDice();
            if (y == 7) return false;
            if (y == x) return true;
        } 
    }



   /***************************************************************************
    *  Run simulation of pass bet n times  
    *  Output winning percentage.          
    ***************************************************************************/
    public static void main(String[] args) { 
        int trials = 1000000;     // number of pass bets to simulate
        int wins = 0;             // number of pass bets won

        for (int t = 0; t < trials; t++)
            if (winsPassBet()) wins++;

        StdOut.println("Winning percentage = " + 1.0 * wins / trials);
    }

}
