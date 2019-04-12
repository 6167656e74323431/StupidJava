package o6167656e74323431.stupidjava;

import java.security.SecureRandom;
import java.util.Arrays;
import java.lang.reflect.Array;

/**
 * This class provides an O(n*log(n)) method for shuffling arrays using
 * merge-sort as a framework for the algorithm.
 *
 * @author     6167656e74323431
 *
 * @version    1.2
 */
public final class MergeShuffle
{
	/**
	 * Private default constructor to prevent the creation of instances of the
	 * MergeShuffle class
	 */
	private MergeShuffle()
	{ /* \o> */ }

	/**
	 * Function that uses a merge-sort style algorithm to sort an array of
	 * numbers. This function does not do the operations in place, instead it
	 * returns a shuffled copy of the original array.
	 *
	 * @param      target  The original version of this array that will be
	 *                     copied, and then shuffled.
	 *
	 * @return     A shuffled copy of the original array.
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Object> T[] shuffleArray(T[] target)
	{
		try
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
		catch (NullPointerException e)
		{
			throw new IllegalArgumentException("Argument must not be null");
		}
	}

	/**
	 * Overloaded version of the shuffleArray function to deal with the byte
	 * primitive data-type. <br> <b>Note:</b> Unimplemented
	 *
	 * @see        o6167656e74323431.stupidjava.MergeShuffle#shuffleArray(Object[])
	 *
	 * @param      target  The original version of this array that will be
	 *                     copied, and then shuffled.
	 *
	 * @return     A shuffled copy of the original array.
	 */
	public static byte[] shuffleArray(byte[] target)
	{ throw new UnsupportedOperationException("Shuffle unimplemented for byte[]."); }

	/**
	 * Overloaded version of the shuffleArray function to deal with the short
	 * primitive data-type. <br> <b>Note:</b> Unimplemented
	 *
	 * @see        o6167656e74323431.stupidjava.MergeShuffle#shuffleArray(Object[])
	 *
	 * @param      target  The original version of this array that will be
	 *                     copied, and then shuffled.
	 *
	 * @return     A shuffled copy of the original array.
	 */
	public static short[] shuffleArray(short[] target)
	{ throw new UnsupportedOperationException("Shuffle unimplemented for short[]."); }

	/**
	 * Overloaded version of the shuffleArray function to deal with the int
	 * primitive data-type. <br> <b>Note:</b> Unimplemented
	 *
	 * @see        o6167656e74323431.stupidjava.MergeShuffle#shuffleArray(Object[])
	 *
	 * @param      target  The original version of this array that will be
	 *                     copied, and then shuffled.
	 *
	 * @return     A shuffled copy of the original array.
	 */
	public static int[] shuffleArray(int[] target)
	{ throw new UnsupportedOperationException("Shuffle unimplemented for int[]."); }

	/**
	 * Overloaded version of the shuffleArray function to deal with the long
	 * primitive data-type. <br> <b>Note:</b> Unimplemented
	 *
	 * @see        o6167656e74323431.stupidjava.MergeShuffle#shuffleArray(Object[])
	 *
	 * @param      target  The original version of this array that will be
	 *                     copied, and then shuffled.
	 *
	 * @return     A shuffled copy of the original array.
	 */
	public static long[] shuffleArray(long[] target)
	{ throw new UnsupportedOperationException("Shuffle unimplemented for long[]."); }

	/**
	 * Overloaded version of the shuffleArray function to deal with the float
	 * primitive data-type. <br> <b>Note:</b> Unimplemented
	 *
	 * @see        o6167656e74323431.stupidjava.MergeShuffle#shuffleArray(Object[])
	 *
	 * @param      target  The original version of this array that will be
	 *                     copied, and then shuffled.
	 *
	 * @return     A shuffled copy of the original array.
	 */
	public static float[] shuffleArray(float[] target)
	{ throw new UnsupportedOperationException("Shuffle unimplemented for float[]."); }

	/**
	 * Overloaded version of the shuffleArray function to deal with the double
	 * primitive data-type. <br> <b>Note:</b> Unimplemented
	 *
	 * @see        o6167656e74323431.stupidjava.MergeShuffle#shuffleArray(Object[])
	 *
	 * @param      target  The original version of this array that will be
	 *                     copied, and then shuffled.
	 *
	 * @return     A shuffled copy of the original array.
	 */
	public static double[] shuffleArray(double[] target)
	{ throw new UnsupportedOperationException("Shuffle unimplemented for double[]."); }

	/**
	 * Overloaded version of the shuffleArray function to deal with the char
	 * primitive data-type. <br> <b>Note:</b> Unimplemented
	 *
	 * @see        o6167656e74323431.stupidjava.MergeShuffle#shuffleArray(Object[])
	 *
	 * @param      target  The original version of this array that will be
	 *                     copied, and then shuffled.
	 *
	 * @return     A shuffled copy of the original array.
	 */
	public static char[] shuffleArray(char[] target)
	{ throw new UnsupportedOperationException("Shuffle unimplemented for char[]."); }

	/**
	 * Overloaded version of the shuffleArray function to deal with the boolean
	 * primitive data-type. <br> <b>Note:</b> Unimplemented
	 *
	 * @see        o6167656e74323431.stupidjava.MergeShuffle#shuffleArray(Object[])
	 *
	 * @param      target  The original version of this array that will be
	 *                     copied, and then shuffled.
	 *
	 * @return     A shuffled copy of the original array.
	 */
	public static boolean[] shuffleArray(boolean[] target)
	{ throw new UnsupportedOperationException("Shuffle unimplemented for boolean[]."); }
}