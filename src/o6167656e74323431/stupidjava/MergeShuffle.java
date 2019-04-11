package o6167656e74323431.stupidjava;

import java.security.SecureRandom;
import java.util.Arrays;
import java.lang.reflect.Array;

/**
 * This class provides a probabilistic a O(n*log(n)) method for shuffling arrays
 * using merge-sort as a framework for the algorithm.
 *
 * @author     6167656e74323431
 *
 * @version    1.1
 */
public final class MergeShuffle
{
	/**
	 * Private default constructor to prevent the creation of instances of the
	 * MergeShuffle class
	 */
	private MergeShuffle()
	{
	}

	/**
	 * Function that uses a merge-sort style algorithm to sort an array of
	 * numbers. This function does not do the operations in place, instead it
	 * returns a shuffled copy of the original array.
	 *
	 * @param      target  The original version of this array that will be
	 *                     copied, and then shuffled.
	 *
	 * @return     A shuffled copy of the original array.
	 *
	 * @throws     NullPointerException  If target is equal to null.
	 */
	@SuppressWarnings("unchecked")
	public static <T> T[] shuffleArray(T[] target)
	{
		if (target.length == 1)
			return target;
		T[] lowerTarget = Arrays.copyOfRange(target, 0, target.length / 2);
		T[] upperTarget = Arrays.copyOfRange(target, target.length / 2, target.length);
		lowerTarget = shuffleArray(lowerTarget);
		upperTarget = shuffleArray(upperTarget);
		T[] endArray = (T[])Array.newInstance(target[0].getClass(), target.length);
		int endArrayPointer = 0, lowerTargetPointer = 0, upperTargetPointer = 0;
		while (endArrayPointer < endArray.length)
			if (lowerTargetPointer == lowerTarget.length)
				endArray[endArrayPointer++] = upperTarget[upperTargetPointer++];
			else if (upperTargetPointer == upperTarget.length)
				endArray[endArrayPointer++] = lowerTarget[lowerTargetPointer++];
			else if ((new SecureRandom()).nextDouble() < 0.5)
				endArray[endArrayPointer++] = lowerTarget[lowerTargetPointer++];
			else
				endArray[endArrayPointer++] = upperTarget[upperTargetPointer++];
		return endArray;
	}
}