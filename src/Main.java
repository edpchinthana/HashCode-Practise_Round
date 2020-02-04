import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String args[]) throws IOException {
        File file = new File("/media/pasindu/Studies/Projects/HashCode/Practice Round/src/e_also_big.in");
        FileReader fr = new FileReader(file);
        BufferedReader bw = new BufferedReader(fr);

        //Reading the first line
        String NStr = bw.readLine();

        //Spliting two numbers
        String[] Narr = NStr.split(" ");
        int N = Integer.valueOf(Narr[0]); //Maximum number of pizza slices
        int M = Integer.valueOf(Narr[1]);//Number of different types of pizza
        int[] Marr = new int[M];

        String st = bw.readLine();
        String[] s = st.split(" ");
        Marr = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
        //System.out.println(N);

        int total=0;
        int count=0;
        Stack<Integer> stack = new Stack<Integer>();
        //ArrayList list = new ArrayList<Integer>();
        for(int x=M-1; total<N&&x>=0;x--){
            if(total+Marr[x]<N){
                total+=Marr[x];
                //list.add(x);
                stack.push(x);
                count++;
            }
        }

        int [] arr = new int[count];

        for(int x=0;x<count;x++){
            arr[x]=stack.pop();
        }
        File output = new File("output5.txt");
        FileWriter fw = new FileWriter(output);
        //w.write(count.toString());
        String a = String.valueOf(count);
        fw.write(a+"\n");
        for(int x=0;x<count;x++){
            a=String.valueOf(arr[x]);
            fw.append(a+" ");
        }
        fw.close();

    }

}


