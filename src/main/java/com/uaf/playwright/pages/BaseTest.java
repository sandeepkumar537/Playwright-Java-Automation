package com.uaf.playwright.pages;

//import com.microsoft.playwright.Page;
//import com.uaf.driver.PlaywrightFactory;
//import com.uaf.utils.PropertyLoader;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//
//public class BaseTest {
//    protected PlaywrightFactory playwrightFactory;
//    protected Page page;
//
//    @BeforeEach
//    public void setUp() {
//        this.playwrightFactory = new PlaywrightFactory();
//        this.page = playwrightFactory.getPage(PropertyLoader.getProperty("browser").toUpperCase());
//        this.page.navigate(PropertyLoader.getProperty("app.url"));
//    }
//
//    @AfterEach
//    public void tearDown() {
//        this.page.context().browser().close();
//        playwrightFactory.getPlaywright().close();
//    }
//
//
////    @RegisterExtension
////    TestWatcher testWatcher = new TestWatcher() {
////        @Override
////        public void testFailed(ExtensionContext context, Throwable cause) {
////            page.screenshot(new Page.ScreenshotOptions()
////                    .setPath(Paths.get("screenshot_" + RandomStringUtils.randomNumeric(4) + ".png"))
////                    .setFullPage(true));
////        }
////    };
//}
