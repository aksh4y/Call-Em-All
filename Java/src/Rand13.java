
public class Rand13 {
    int r13 = 0;
    Rand11 r11;
    
    Rand13() {
        r11 = new Rand11(); // Gives random number between 1 and 11 with equal probability
    }
    
    public int generate() {
        for(int i = 1; i <= 13; i++)
            r13 += r11.generate() * i;
        return r13 % 13 + 1;        
    }
}
