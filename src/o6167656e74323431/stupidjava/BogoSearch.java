package o6167656e74323431.stupidjava;

import java.security.SecureRandom;

/**
 * This class provides a probabilistic array searching algorithm.
 *
 * @author     6167656e74323431
 *
 * @version    1.4
 */
public final class BogoSearch
{
	/**
	 * Private default constructor to prevent the creation of instances of the
	 * BogoSearch class
	 */
	private BogoSearch()
	{ /* \o> */ }

	/**
	 * A probabilistic function to see if a comparable object exists within an
	 * array of comparable objects. The object equality is checked via
	 * {@code .compareTo() == 0}
	 *
	 * @param      haystack  An array of comparable objects for this searching
	 *                       method to search through
	 * @param      needle    The object that is trying to be found in the
	 *                       haystack
	 *
	 * @return     Returns the array index if the item was found in the array,
	 *             -1 otherwise.
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Comparable> int searchArray(T[] haystack, T needle)
	{
		try
		{
			int checkID = (new SecureRandom()).nextInt(haystack.length);
			if (haystack[checkID].compareTo(needle) == 0)
				return checkID;
			return searchArray(haystack, needle);
		}
		catch (StackOverflowError e)
		{
			return -1;
		}
		catch (NullPointerException e)
		{
			throw new IllegalArgumentException("null argument.");
		}
	}

	/**
	 * Overloaded version of searchArray function to deal with the byte
	 * primitive data-type. <br> <b>Note:</b> Unimplemented
	 *
	 * @see        o6167656e74323431.stupidjava.BogoSearch#searchArray(Comparable[],
	 *             Comparable)
	 *
	 * @param      haystack  Array that contains the items to search through
	 * @param      needle    The item to be searched for
	 *
	 * @return     Returns the array index if the item was found in the array,
	 *             -1 otherwise.
	 */
	public static int searchArray(byte[] haystack, byte needle)
	{ throw new UnsupportedOperationException("Search unimplemented for byte."); }

	/**
	 * Overloaded version of searchArray function to deal with the short
	 * primitive data-type. <br> <b>Note:</b> Unimplemented
	 *
	 * @see        o6167656e74323431.stupidjava.BogoSearch#searchArray(Comparable[],
	 *             Comparable)
	 *
	 * @param      haystack  Array that contains the items to search through
	 * @param      needle    The item to be searched for
	 *
	 * @return     Returns the array index if the item was found in the array,
	 *             -1 otherwise.
	 */
	public static int searchArray(short[] haystack, short needle)
	{ throw new UnsupportedOperationException("Search unimplemented for short."); }

	/**
	 * Overloaded version of searchArray function to deal with the int
	 * primitive data-type. <br> <b>Note:</b> Unimplemented
	 *
	 * @see        o6167656e74323431.stupidjava.BogoSearch#searchArray(Comparable[],
	 *             Comparable)
	 *
	 * @param      haystack  Array that contains the items to search through
	 * @param      needle    The item to be searched for
	 *
	 * @return     Returns the array index if the item was found in the array,
	 *             -1 otherwise.
	 */
	public static int searchArray(int[] haystack, int needle)
	{ throw new UnsupportedOperationException("Search unimplemented for int."); }

	/**
	 * Overloaded version of searchArray function to deal with the long
	 * primitive data-type. <br> <b>Note:</b> Unimplemented
	 *
	 * @see        o6167656e74323431.stupidjava.BogoSearch#searchArray(Comparable[],
	 *             Comparable)
	 *
	 * @param      haystack  Array that contains the items to search through
	 * @param      needle    The item to be searched for
	 *
	 * @return     Returns the array index if the item was found in the array,
	 *             -1 otherwise.
	 */
	public static int searchArray(long[] haystack, long needle)
	{ throw new UnsupportedOperationException("Search unimplemented for long."); }

	/**
	 * Overloaded version of searchArray function to deal with the float
	 * primitive data-type. <br> <b>Note:</b> Unimplemented
	 *
	 * @see        o6167656e74323431.stupidjava.BogoSearch#searchArray(Comparable[],
	 *             Comparable)
	 *
	 * @param      haystack  Array that contains the items to search through
	 * @param      needle    The item to be searched for
	 *
	 * @return     Returns the array index if the item was found in the array,
	 *             -1 otherwise.
	 */
	public static int searchArray(float[] haystack, float needle)
	{ throw new UnsupportedOperationException("Search unimplemented for float."); }

	/**
	 * Overloaded version of searchArray function to deal with the double
	 * primitive data-type. <br> <b>Note:</b> Unimplemented
	 *
	 * @see        o6167656e74323431.stupidjava.BogoSearch#searchArray(Comparable[],
	 *             Comparable)
	 *
	 * @param      haystack  Array that contains the items to search through
	 * @param      needle    The item to be searched for
	 *
	 * @return     Returns the array index if the item was found in the array,
	 *             -1 otherwise.
	 */
	public static int searchArray(double[] haystack, double needle)
	{ throw new UnsupportedOperationException("Search unimplemented for double."); }

	/**
	 * Overloaded version of searchArray function to deal with the char
	 * primitive data-type. <br> <b>Note:</b> Unimplemented
	 *
	 * @see        o6167656e74323431.stupidjava.BogoSearch#searchArray(Comparable[],
	 *             Comparable)
	 *
	 * @param      haystack  Array that contains the items to search through
	 * @param      needle    The item to be searched for
	 *
	 * @return     Returns the array index if the item was found in the array,
	 *             -1 otherwise.
	 */
	public static int searchArray(char[] haystack, char needle)
	{ throw new UnsupportedOperationException("Search unimplemented for char."); }

	/**
	 * Overloaded version of searchArray function to deal with the boolean
	 * primitive data-type. <br> <b>Note:</b> Unimplemented
	 *
	 * @see        o6167656e74323431.stupidjava.BogoSearch#searchArray(Comparable[],
	 *             Comparable)
	 *
	 * @param      haystack  Array that contains the items to search through
	 * @param      needle    The item to be searched for
	 *
	 * @return     Returns the array index if the item was found in the array,
	 *             -1 otherwise.
	 */
	public static int searchArray(boolean[] haystack, boolean needle)
	{ throw new UnsupportedOperationException("Search unimplemented for boolean."); }
}