package utils

import com.codeborne.selenide.ElementsCollection
import com.codeborne.selenide.Selenide
import com.codeborne.selenide.SelenideElement
import org.junit.jupiter.api.BeforeAll

open class BaseTest {

    @BeforeAll
    fun setUp() {
        Selenide.open("https://google.com/ncr")
    }

    fun get(selector: String) : SelenideElement {
        return Selenide.`$`(selector)
    }

    fun all(selector: String) : ElementsCollection {
        return Selenide.`$$`(selector)
    }
}