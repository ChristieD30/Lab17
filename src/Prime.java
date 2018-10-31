
import java.util.stream.LongStream;

import java.util.stream.LongStream;

public class Prime {

    public static boolean isPrime(long num) {

        return num > 1 && LongStream.rangeClosed(2, (long)Math.sqrt(num)).noneMatch(div-> num % div== 0);

    }

}

