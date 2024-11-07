package metrocs;
import java.util.Collections;
import java.util.List;

/**
 * Expansion of classic Hello World program
 * to support demonstration of unit testing.
 *
 * @author Dr. Jody Paul
 * @version 1.1.1
 */
public class DSRankOutput {
  /**
   * Produces desired string on stdout.
   *
   * @param args ignored
   */
  public static void main(final String[] args) {
  }

  /**
   * Constructs the greeting.
   *
   * @param toStr to whom the greeting is directed
   * @return the constructed greeting.
   */



  /*/
  * The system displays a list of decision outcomes.
  * Decision outcomes are ordered from most desirable to least desirable.
  * Each item has an associated ranking value next to it.
  * The list is generated based on the product's process of the user’s input (options, criteria, rankings).
  /*/



  /*/ INPUT : Obj, Str, Array, List, USE COLLECTIONS
  *   OUTPUT: Str, Array, List
  *   NOTE FROM THE GOAT --- keep it general, use collections se we can input a large variety of data types
  /*/

  public String toString(final String toStr) {
    return toStr;
    }

  public List toList(final List toItems) {
  return toItems;
    }

  public <T> List<T> sort(final List<T> items) {
    return items;
    }

  /*
  public <T extends Comparable<? super T>> List<T> sortArray(final List<T> items) {
    Collections.sort(items);
    return items;
  }
  */

}