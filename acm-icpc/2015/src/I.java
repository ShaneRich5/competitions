import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by shane on 9/26/15.
 */
public class I {

    public I(){
        Scanner in = new Scanner(System.in);

        while (true) {


            long finalStep = in.nextLong();

            if (finalStep == 0)
                break;

            // build initial sequence
            List<Long> sequence = new ArrayList<Long>();
            sequence.add(1L);
            sequence.add(2L);
            sequence.add(1L);

            if (finalStep == 1) {
                System.out.println("2");
            } else if (finalStep == 2) {
                System.out.println("1");
            } else {

                // each step
                for (long currentStep = 3; currentStep <= finalStep; currentStep++) {

                    // each index
                    for (int index = 0; index < sequence.indexOf(2L); index++) {

                        int next = index + 1;

                        if (sequence.get(index) + sequence.get(next) == currentStep) {

                            sequence.add(next, currentStep);

                        }

                    }

                }

                System.out.println(findOccurrence(sequence.subList(0, sequence.indexOf(2L)), finalStep));
            }
        }
    }

    private int findOccurrence(List<Long> sequence, long finalStep) {

        int count = 0;

        for (int i = 0; i < sequence.size(); i++){
            if (sequence.get(i) == finalStep)
                count++;
        }

        return count * 2;
    }

    public static void main(String[] args){

        new  I();

    }
}
