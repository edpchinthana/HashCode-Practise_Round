import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String args[]) throws IOException {
        File file = new File("/media/pasindu/Studies/Projects/HashCode/Practice Round/src/e_also_big.in");
        FileReader fr = new FileReader(file);
        BufferedReader bw = new BufferedReader(fr);

        //Reading the first line
        String NStr = bw.readLine();
        //Spliting two numbers
        String[] Narr = NStr.split(" ");
        int N = Integer.valueOf(Narr[0]);
        int M = Integer.valueOf(Narr[1]);
        int[] Marr = new int[M];
        String st = bw.readLine();
        String[] s = st.split(" ");
        Marr = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
        System.out.println(Marr[0]);
    }

}


