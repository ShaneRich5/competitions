import java.util.Scanner;

public class A {

    public A()
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i = 0; i < T; ++i)
        {
            String s1 = scan.next();
            String s2 = scan.next();
            int total = 0;
            for(int j = 0; j < s1.length();++j)
            {
               if(s1.charAt(j) != s2.charAt(j))
                   ++total;
            }
            System.out.println(total);
        }
    }
}
