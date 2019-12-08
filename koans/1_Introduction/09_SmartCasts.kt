/**
 * Rewrite the following Java code using smart casts and when expression:
 * 
 * public int eval(Expr expr) {
 *     if (expr instanceof Num) {
 *         return ((Num) expr).getValue();
 *     }
 *     if (expr instanceof Sum) {
 *         Sum sum = (Sum) expr;
 *         return eval(sum.getLeft()) + eval(sum.getRight());
 *     }
 *     throw new IllegalArgumentException("Unknown expression");
 * }
 * 
 * http://kotlinlang.org/docs/reference/typecasts.html#smart-casts
 * http://kotlinlang.org/docs/reference/control-flow.html#when-expression
 * http://kotlinlang.ru/docs/reference/typecasts.html
 * http://kotlinlang.ru/docs/reference/control-flow.html
*/
fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> expr.value
            is Sum -> eval(expr.left) + eval(expr.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr