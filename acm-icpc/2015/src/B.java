import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by shane on 9/26/15.
 */
public class B {

    public B()
    {
        Scanner scan = new Scanner(System.in);
        while(true) {
            int N = scan.nextInt();
            if(N == 0)
                break;
            int X = scan.nextInt();
            int Y = scan.nextInt();
            System.out.println(amtPaths(new vec2(0,0),new vec2(N,N),new vec2(X,Y),new ArrayList<vec2>()));

        }
    }

    public static void main(String[] args)
    {
        new B();
    }

    public int amtPaths(vec2 position,vec2 N, vec2 poison, ArrayList<vec2> visited)
    {
        if(insidePoison(position,poison))
            return 0;
        visited.add(position);

        if(position.equals(N)) {
            for(int i = 0; i < visited.size(); ++ i)
                System.out.print(visited.get(i));
            return 1;
        }
        vec2 left = position.left();
        vec2 right = position.right(N);
        vec2 up = position.up();
        vec2 down = position.down(N);
        int solution = 0;
        if(left != null && !visited(new ArrayList<>(visited),left))
            solution += amtPaths(left,N,poison,new ArrayList<>(visited));
        if(right != null && !visited(visited,right))
            solution += amtPaths(right,N,poison,new ArrayList<>(visited));
        if(up != null && !visited(new ArrayList<>(visited),up))
            solution += amtPaths(up,N,poison,new ArrayList<>(visited));
        if(down != null && !visited(new ArrayList<>(visited),down))
            solution += amtPaths(down,N,poison,new ArrayList<>(visited));

        return solution;


    }

    public boolean visited(ArrayList<vec2> visited,vec2 B)
    {
        for(int i = 0; i < visited.size(); ++i)
        {
            vec2 curr = visited.get(i);
            if(B.x == curr.x && B.y == curr.y)
                return true;
        }
        return false;
    }

    public boolean insidePoison(vec2 pos, vec2 poison)
    {
       return (pos.x >= poison.x && pos.x <= poison.x+2 && pos.y >= poison.y && pos.y <= poison.y+2);
    }

    class vec2
    {
        public vec2(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
        int x;
        int y;

        public boolean equals(vec2 b)
        {
            return this.x == b.x && this.y == b.y;
        }

        public vec2 left()
        {
            if(x > 0)
                return new vec2(x-1,y);
            else
                return null;
        }
        public vec2 right( vec2 N)
        {
            if(x < N.x)
                return new vec2(x+1,y);
            else
                return null;
        }
        public vec2 up()
        {
            if(y > 0)
                return new vec2(x,y-1);
            else
                return null;
        }
        public vec2 down(vec2 N)
        {
            if(y < N.y)
                return new vec2(x,y+1);
            else
                return null;
        }
        @Override
        public String toString()
        {
            return "("+x+","+y+")";
        }
    }



}
