import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine()); 
        
        System.out.printf("%d is %s", input, input % 2 == 0 ? "even" : "odd");
    }
}