`**Playwright**

Playwright is an **open-source** automation library developed by **Microsoft** for **end-to-end** testing of web applications.

- Allows multiple borwsers—**Chrome**, **Edge**, **Firefox**, and **WebKit** (Safari)
- Support multiple languages
- Languages: **JavaScript**, **TypeScript**, **Python**, **C#**, **Java**
- Cross-platform compatibility (Windows, macOS, Linux)
- Headless and headful modes
- Auto-waiting for elements
- Network interception and mocking
- **Parallel** test execution
- **Screenshot** and **video** capture
- Rich API for interacting with web elements
- Integration with CI/CD tools
- Auto Waits and Retries
- Tracing and Debugging Tools
- Mobile Emulation

**Powerful tooling**:
- Code generation
- Playwright Inspector
- Trace Viewer

A concise comparison of Playwright and Selenium to help choose the right tool for end-to-end browser automation.

| Aspect                     |                                                                       Playwright |                                                                           Selenium |
|----------------------------|---------------------------------------------------------------------------------:|-----------------------------------------------------------------------------------:|
| Language support           |                                        JavaScript/TypeScript, Python, Java, .NET |                        Java, C#, Python, Ruby, JavaScript (via WebDriver bindings) |
| Architecture               | Uses browser-specific drivers (CDP/WebSocket) with built-in automation protocols |               Uses WebDriver protocol (remote WebDriver servers / browser drivers) |
| Browser support            |                                           Chromium, Firefox, WebKit (single API) | Chromium-based, Firefox, Safari (via drivers); broader historical browser coverage |
| Parallel execution         |                            First-class support with independent browser contexts |                    Parallelism via multiple driver instances / grid but more setup |
| Auto-waiting / reliability |                                 Built-in auto-waiting for actions and assertions |                Requires explicit waits / expected conditions (more flakiness risk) |
| Selectors & locators       |  Rich locators (text, role, CSS, XPath, chained locators) and strictness options |                 CSS/XPath primarily; newer initiatives improving advanced locators |
| Headless & headed          |                          Easy headless/headed switching and fast debugging tools |                                 Supported via drivers; debugging typically heavier |
| Mobile support             |  Mobile emulation and WebKit/Chromium mobile contexts; Playwright Mobile project |                              Selenium supports Appium for native mobile automation |
| Test runner                |              Official Playwright Test runner with fixtures, retries, parallelism |                        Multiple third-party runners (JUnit, TestNG, pytest, NUnit) |
| Performance                |              Generally faster due to modern protocols and single-process control |                Potentially slower due to WebDriver round-trips and driver overhead |
| Debugging & tooling        |                   Built-in inspector, trace viewer, screenshots, video recording |               Tools exist (Selenium IDE, browser devtools), but integration varies |
| Ecosystem & maturity       |                                 Newer but rapidly growing, modern API ergonomics |                     Very mature, large ecosystem and long-term enterprise adoption |
| CI / Grid                  |                  Simple CI integration; supports browser binaries and containers |                         Well-established Selenium Grid and cloud providers support |

**Short notes:**
- Playwright tends to be more modern and less flaky for web UI automation thanks to auto-waiting and unified browser protocols.
- Selenium is mature with broad language and vendor support; better for legacy environments or where WebDriver is required.


**Set-up Playwright**:
- JDK 8 or higher (Java 21 or Java 23)
- Maven/Gradle
- IntelliJ IDEA CE

**Maven pom config**

```xml
 <dependencies>
        <dependency>
            <groupId>com.microsoft.playwright</groupId>
            <artifactId>playwright</artifactId>
            <version>1.49.0</version>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.11.4</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.assertj</groupId>
            <artifactId>assertj-core</artifactId>
            <version>3.26.3</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
```

Base Package:
import com.microsoft.playwright.*

First Test:
```java
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SamplePlaywrightTest {

    @Test
    public void test() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://thinking-tester-contact-list.herokuapp.com/");

        Assertions.assertEquals("Contact List App", page.title());
    }
}
```

**Playwright Architecture**
```
Playwright (Create browser Instances)
    |
Browser (Manage a specific browser instance)
    |
BrowserContext (Isolated session in a browser instance - Manage cookies, storage and session data)
    |
Page (interact with Single tav within a browser session)
```

**Playwright Module**
Playwright
- **chromium()**—to get Chrome **BrowserType**
- **firefox()**—to get Chrome **BrowserType**
- **webkit()**—to get Chrome **BrowserType**
- **request()**—To work with api request—it will return **APIRequest** class object

**Browser Launch Options**
- setArgs()
- setEnv()
- setDownloadPath()
- setHeadless()
- setProxy()
- setSlowMo()

TODO: Coding examples

**@UsePlaywright**


**Allure Reporting Integration**


