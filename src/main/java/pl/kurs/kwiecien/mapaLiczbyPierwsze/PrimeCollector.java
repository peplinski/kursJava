package pl.kurs.kwiecien.mapaLiczbyPierwsze;

import java.util.HashMap;
import java.util.Map;

class PrimeCollector {
    private int fromNumber = 1;
    private int toNumber = 30;
    public Map<Integer, Boolean> mapIntToPrime() {
        Map<Integer, Boolean> primes = new HashMap<>();
        for (int i = fromNumber; i < toNumber; i++) {
            primes.put(i, isPrime(i));
        }
        return primes;
    }
    private boolean isPrime(int n) {
        int start = fromNumber;
        if (fromNumber <= 1) {
            start = 2;
        }
        for (int i = start; i < toNumber; i++) {
            if (i != n && n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
class Main {
    public static void main(String[] args) {
//        PrimeCollector pc = new PrimeCollector();
//        for (int i = 1; i <= 30; i++) {
//            System.out.println(i + ": " + pc.isPrime(i));
//        }
        PrimeCollector pc = new PrimeCollector();
        Map<Integer, Boolean> primes = pc.mapIntToPrime();
        for (Map.Entry<Integer, Boolean> prime : primes.entrySet()) {
            System.out.println(prime.getKey() + ": " + prime.getValue());
        }
    }
}
