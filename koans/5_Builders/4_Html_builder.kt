/*
1. Fill the table with the proper values from the product list.

data class Product(val description: String, val price: Double, val popularity: Int)


2. Color the table like a chess board (using getTitleColor() and getCellColor() functions above). Pass a color as an argument to the functions tr, td.

open class Tag(val name: String)

class Attribute(val name : String, val value : String)

fun <T: Tag> T.set(name: String, value: String?): T

fun <T: Tag> Tag.doInit(tag: T, init: T.() -> Unit): T

class Html: Tag("html")
class Table: Tag("table")
class Center: Tag("center")
class TR: Tag("tr")
class TD: Tag("td")
class Text(val text: String): Tag("b")

fun html(init: Html.() -> Unit): Html

fun Html.table(init : Table.() -> Unit): Table
fun Html.center(init : Center.() -> Unit): Center

fun Table.tr(color: String? = null, init : TR.() -> Unit): TR

fun TR.td(color: String? = null, align : String = "left", init : TD.() -> Unit): TD

fun Tag.text(s : Any?): Text
*/
fun renderProductTable(): String {
    return html {
        table {
            tr (color = getTitleColor()) {
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            for ((index, product) in products.withIndex()) {
                tr {
                    td (color = getCellColor(index = 0, row = index)) {
                        text(product.description)
                    }
                    td (color = getCellColor(index = 1, row = index)) {
                        text(product.price)
                    }
                    td (color = getCellColor(index = 2, row = index)) {
                        text(product.popularity)
                    }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) %2 == 0) "#dce4ff" else "#eff2ff"