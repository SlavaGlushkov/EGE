package Task25;

import java.math.BigInteger;
import java.util.ArrayList;

public class Task25_1 {
    static ArrayList<Integer> primes = new ArrayList<>();
    public static void main(String[] args) {
        for (int i = 2; i < Math.cbrt(965324) + 12; i++) {
            if (isPrime(i)){    
                primes.add(i);
            }
        }
        for (int i = 0; i < primes.size(); i++) {
            for (int j = i + 1; j < primes.size(); j++) {
                for (int k = j + 1; k < primes.size(); k++) {
                    long x = primes.get(i) * primes.get(j) * primes.get(k);
                    if (x >= 326782 && x <= 965324 && primes.get(k) - primes.get(i) <= 12)
                        System.out.printf("%d %d %d %d %d\n", primes.get(i), primes.get(j), primes.get(k), x,
                                primes.get(k) - primes.get(i));
                }
            }
        }
    }

    static boolean isPrime(long x){
        return BigInteger.valueOf(x).isProbablePrime(39);
    }
}
