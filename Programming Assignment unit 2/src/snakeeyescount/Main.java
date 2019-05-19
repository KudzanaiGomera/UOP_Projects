
package snakeeyescount;

public class Main {

    
    public static void main(String[] args) {
        int die1, die2, countSnakeEyes, rolls;
        countSnakeEyes = 0;

        for (rolls = 0; rolls < 1000; rolls++) {
            die1 = (int) (Math.random() * 6) + 1;
            die2 = (int) (Math.random() * 6) + 1;
            if (die1 == 1 && die2 == 1) {
                countSnakeEyes += 1;
            }
        }
        TextIO.putln("Snake Eyes After "+countSnakeEyes+" rolls of dice.");
        TextIO.putln("the average is  " +countSnakeEyes / 1000.0 + " after 1000 rolls of the dice.");
    
    }
    
}
