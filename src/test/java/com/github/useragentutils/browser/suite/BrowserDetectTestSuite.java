package com.github.useragentutils.browser.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.github.useragentutils.browser.BlackberryParameterizedTest;
import com.github.useragentutils.browser.BotParameterizedTest;
import com.github.useragentutils.browser.CFNetworkParameterizedTest;
import com.github.useragentutils.browser.CaminoParameterizedTest;
import com.github.useragentutils.browser.ChromeMobileParameterizedTest;
import com.github.useragentutils.browser.ChromeParameterizedTest;
import com.github.useragentutils.browser.FirefoxParameterizedTest;
import com.github.useragentutils.browser.InternetExplorerMobileParameterizedTest;
import com.github.useragentutils.browser.InternetExplorerParameterizedTest;
import com.github.useragentutils.browser.InternetExplorerXboxParameterizedTest;
import com.github.useragentutils.browser.KonquerorParameterizedTest;
import com.github.useragentutils.browser.LotusParameterizedTest;
import com.github.useragentutils.browser.LynxParameterizedTest;
import com.github.useragentutils.browser.OperaParameterizedTest;
import com.github.useragentutils.browser.OthersParameterizedTest;
import com.github.useragentutils.browser.OutlookParameterizedTest;
import com.github.useragentutils.browser.SafariParameterizedTest;
import com.github.useragentutils.browser.ThunderbirdParameterizedTest;
import com.github.useragentutils.browser.ToolParameterizedTest;

@RunWith(Suite.class)
@SuiteClasses({ 
		BlackberryParameterizedTest.class, 
		BotParameterizedTest.class,
		CaminoParameterizedTest.class, 
		CFNetworkParameterizedTest.class,
		ChromeParameterizedTest.class,
		ChromeMobileParameterizedTest.class, 
		FirefoxParameterizedTest.class,
		InternetExplorerMobileParameterizedTest.class,
		InternetExplorerParameterizedTest.class,
		InternetExplorerXboxParameterizedTest.class,
		KonquerorParameterizedTest.class, 
		LotusParameterizedTest.class,
		LynxParameterizedTest.class, 
		OperaParameterizedTest.class,
		OthersParameterizedTest.class, 
		OutlookParameterizedTest.class,
		SafariParameterizedTest.class, 
		ThunderbirdParameterizedTest.class,
		ToolParameterizedTest.class })
public class BrowserDetectTestSuite {

}
