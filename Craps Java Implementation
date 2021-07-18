/**
 * CrapsCasinoGame a famous dice game and this class automates this play.
 *
 * Rules are
 * 1. You roll two dice.
 * 2. There sum is calculated.
 * 3. If sum is 7, 11 in first throw - you WIN.
 * 4. If sum is 2, 3 or 12 - you LOSE.
 * 5. If sum is 4, 5, 6, 8 or 10 - sum becomes your POINT and will roll the dice until you get the same point again. But if you roll 7 before point, you LOSE.
 */
import java.security.SecureRandom;

public class CrapsCasinoGame {

    private static final SecureRandom generator = new SecureRandom();

    private enum GameState {
        CONTINUE,
        WON,
        LOSE
    };

    /*
     * Constants that represent common rolls of the dice.
     */
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;

    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main( String ... args ) {

        int point = 0;
        GameState state;

        int sumOfDice = rollDices();

        switch( sumOfDice ) {

            case SEVEN:
            case YO_LEVEN:
                state = GameState.WON;
                break;

            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                state = GameState.LOSE;

            default:
                state = GameState.CONTINUE;
                point = sumOfDice;
                System.out.printf( "Point is %d\n", point );
                break;

        }

        while( state == GameState.CONTINUE ) {

            sumOfDice = rollDices();

            if( sumOfDice == point ) {
                state = GameState.WON;
            } else if( sumOfDice == SEVEN ) {
                state = GameState.LOSE;
            }
        }

        if( state == GameState.WON ) {
            System.out.println( "You won !!!" );
        } else {
            System.out.println( "House won !!!" );
        }

    }

    public static int rollDices() {

        int first = 1 + generator.nextInt( 6 );
        int second = 1 + generator.nextInt( 6 );

        System.out.printf( "Player rolled %d and %d.%n", first, second );
        return first + second;

    }
}
