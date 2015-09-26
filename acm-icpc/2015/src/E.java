import java.math.BigInteger;
import java.util.Scanner;

public class E {

    public E(){
        Scanner in = new Scanner(System.in);

        while (true){
            BigInteger n = new BigInteger(in.next());
            BigInteger m = new BigInteger(in.next());

            if ((n.compareTo(BigInteger.ZERO) == 0) && (m.compareTo(BigInteger.ZERO) == 0))
                break;

            BigInteger evenCounter = m.subtract(n).add(BigInteger.valueOf(1));
            for (BigInteger k = n; k.compareTo(m) == 0 || k.compareTo(m) == -1; k = k.add(BigInteger.valueOf(1))) {
                if (isSquare(k))
                    evenCounter = evenCounter.subtract(BigInteger.ONE);
            }
            System.out.println(evenCounter);
        }
    }

    public static void main(String[] args)
    {
        new E();
    }

    private boolean isSquare(BigInteger k){

        return (k.)

        for (BigInteger i = BigInteger.ZERO; i.compareTo(k) == 0 || i.compareTo(k) == -1 ; i = i.add(BigInteger.ONE)){
            if (i.multiply(i).compareTo(k) == 0)
                return true;
        }
        return false;
    }
}
