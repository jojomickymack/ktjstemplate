import kotlinx.html.button
import kotlinx.html.div
import kotlinx.html.dom.create
import kotlinx.html.h1
import kotlinx.html.js.onClickFunction
import kotlinx.html.p
import kotlin.browser.document

fun getStuff(): Map<String, String> {
    return mapOf("dragon" to "coffee",
            "kingston" to "soda",
            "powerball" to "detroit")
}

fun main(args: Array<String>) {

    val data: Map<String, String> = getStuff()

    document.body?.appendChild(document.create.div {
        h1 {
            +"My Crazy Page"
        }
        button {
            +"Click Me"
            onClickFunction = {
                data.forEach { document.body?.appendChild(document.create.div {
                        p {
                          +"${it.key} : ${it.value}"
                        }
                    })
                }
            }
        }
    })
}