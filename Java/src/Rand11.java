import java.util.concurrent.ThreadLocalRandom;

public class Rand11 {
    public int generate() {
        return ThreadLocalRandom.current().nextInt(1, 12);  // nextInt is exclusive of max
    }
}
