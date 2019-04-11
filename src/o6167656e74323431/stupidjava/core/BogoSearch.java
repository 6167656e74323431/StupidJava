package o6167656e74323431.stupidjava.core;

import java.security.SecureRandom;

/**
 * This class provides a probabilistic array searching algorithm.
 *
 * @author     6167656e74323431
 *
 * @version    1.1
 */
public final class BogoSearch
{

	/**
	 * Private default constructor to prevent the creation of instances of the
	 * BogoSearch class
	 */
	private BogoSearch()
	{
	}

	/**
	 * A probabilistic function to see if a comparable object exists within an
	 * array of comparable objects. The object equality is checked via
	 * .compareTo() == 0
	 *
	 * @param      haystack  An array of comparable objects for this searching
	 *                       method to search through
	 * @param      needle    The object that is trying to be found in the
	 *                       haystack
	 *
	 * @return     Returns true if the needle exists within the haystack, false
	 *             if the needle is probably not in the haystack
	 *
	 * @throws     NullPointerException  If either the needle, or the haystack are
	 *                                   equal to null
	 */
	@SuppressWarnings("unchecked")
	public static boolean searchArray(Comparable[] haystack, Comparable<?> needle)
	{
		if (haystack[(new SecureRandom()).nextInt(haystack.length)].compareTo(needle) == 0)
			return true;
		try
		{
			return searchArray(haystack, needle);
		}
		catch (StackOverflowError e)
		{
		}
		return false;
	}
}