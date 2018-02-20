
public class Solution {
    
    public static void main(String[] args) {
        Rand13 r13 = new Rand13();
        int[] freq = new int[13];
        
        for(int i = 0; i < 100000; i++)
            freq[r13.generate()-1]++;
        for(int i = 0; i < 13; i++)
            System.out.println(i+1 + "\t" + freq[i]);
    }
}
