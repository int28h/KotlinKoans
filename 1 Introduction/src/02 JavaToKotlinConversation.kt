/**
 * Please convert the java function toJSON .
 * 
 * import java.util.Collection;
 * import java.util.Iterator;
 * 
 * public class JavaCode {
 *     public String toJSON(Collection<Integer> collection) {
 *         StringBuilder sb = new StringBuilder();
 *         sb.append("[");
 *         Iterator<Integer> iterator = collection.iterator();
 *         while (iterator.hasNext()) {
 *             Integer element = iterator.next();
 *             sb.append(element);
 *             if (iterator.hasNext()) {
 *                 sb.append(", ");
 *             }
 *         }
 *         sb.append("]");
 *         return sb.toString();
 *     }
 * }
 * 
 * Intellij IDEA have a handy tool for Java developers: Java to Kotlin converter. You can just copy-paste the code to Kotlin file and agree to automatically convert it to Kotlin.
 */
 fun toJSON(collection: Collection<Int>): String {
    val sb = StringBuilder()
    sb.append("[")
    val iterator = collection.iterator()
    while (iterator.hasNext()) {
        val element = iterator.next()
        sb.append(element)
        if (iterator.hasNext()) {
            sb.append(", ")
        }
    }
    sb.append("]")
    return sb.toString()
}
