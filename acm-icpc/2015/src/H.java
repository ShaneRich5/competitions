import org.omg.CORBA.NameValuePair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class H {
    private char[] even = {'2','4','6','8'};
    private char[] odd = {'1','3','5','7','9'};

    public H()
    {
        Scanner scan = new Scanner(System.in);
        while(true) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if(x == 0 && y == 0)
                break;
            int total = x+y;
            ArrayList<String> states = getStates(x,y);






        }
    }

    public int countfromStates(ArrayList<String> states)
    {
        for(int i =0; i < states.size(); ++i)
        {
            StringBuffer state = new StringBuffer(states.get(i));
            for(int j = 0; j < state.length(); ++j)
            {
                if(state.charAt(j) == '1')
                {
                    state.setCharAt(j,even[0]);
                }
                if(state.charAt(j) == '0') {
                    state.setCharAt(j, odd[0]);
                }
                for()
            }

        }
        return 0;
    }

    public ArrayList<String> getStates(int E, int O)
    {
        ArrayList<String> retArray = new ArrayList<String>();
        StringBuffer strng= new StringBuffer("");
        for(int i = 0; i < E; ++i)
            strng.append("E");
        for(int i = 0; i< O; ++i)
            strng.append("O");
        if(!retArray.contains(strng.toString()))
            retArray.add(strng.toString());
        for(int i = 0; i < strng.length(); ++i)
            for(int j =2; j > 0; --j)
            {
                String last = "";
                last += strng.charAt(strng.length()-1);
                String nextLast ="";
                nextLast += strng.charAt(strng.charAt(strng.length()-2));
                strng.replace(j-2,j-2,last);
                strng.replace(j-1,j-1,nextLast);
                retArray.add(strng.toString());
            }
        return retArray;
    }

}
