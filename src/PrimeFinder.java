import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PrimeFinder {

	static int n;

	static int valueAtSequenceNum;

	public static int findPrime(int sequenceNum) {

		for (int i = 0; i < sequenceNum; i++) {

			n++;

			while (!Prime.isPrime(n)) {

				n++;

			}

			valueAtSequenceNum = n;

		}

		return valueAtSequenceNum;

	}

}
