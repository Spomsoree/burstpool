import org.w3c.dom.Element
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLInputElement
import org.w3c.fetch.RequestInit
import org.w3c.fetch.Response
import kotlin.browser.document
import kotlin.browser.window
import kotlin.js.Promise
import kotlin.reflect.KClass

external fun decodeURIComponent(encodedURI: String): String

object WebUtil {
    private val modalListeners: MutableMap<String, () -> Unit> = mutableMapOf()

    fun setCookie(name: String, value: String) {
        document.cookie = "$name=$value;"
    }

    fun getCookie(nameStr: String): String? {
        val name = "$nameStr="
        val decodedCookie = decodeURIComponent(document.cookie)
        val ca = decodedCookie.split(';')
        for (i in 0 until ca.size) {
            var c = ca[i]
            while (c[0] == ' ') {
                c = c.substring(1)
            }
            if (c.indexOf(name) == 0) {
                return c.substring(name.length, c.length)
            }
        }
        return null
    }

    fun <T: Any> fetchJson(address: String, post: Boolean = false): Promise<T?> {
        return window.fetch(address, object: RequestInit {
            override var method: String? = if (post) "POST" else "GET"
        })
                .then { it.json() }
                .then { it.unsafeCast<T>() }
    }

    fun schedule(handler: () -> Unit, repeatEveryMs: Int, runImmediately: Boolean = true) {
        window.setInterval(handler, repeatEveryMs)
        if (runImmediately) handler()
    }

    fun addModalShowListener(modalId: String, listener: () -> Unit) {
        modalListeners[modalId] = listener
    }

    fun initModalShowListeners() {
        document.addEventListener("show.bs.modal", { event ->
            modalListeners.forEach { entry ->
                if (entry.key == event.target.asDynamic().id as String?) {
                    entry.value()
                }
            }
        })
    }
}

fun Element.show() {
    if (this !is HTMLElement) return
    this.style.display = "block"
}

fun Element.hide() {
    if (this !is HTMLElement) return
    this.style.display = "none"
}

var Element.value: String
    get() {
        if (this !is HTMLInputElement) return ""
        return this.value
    }
    set(value: String) {
        if (this !is HTMLInputElement) return
        this.value = value
    }

fun Element.click() {
    if (this !is HTMLElement) return
    this.click()
}