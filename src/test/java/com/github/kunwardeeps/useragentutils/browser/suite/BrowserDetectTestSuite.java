package com.github.kunwardeeps.useragentutils.browser.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.github.kunwardeeps.useragentutils.browser.BlackberryParameterizedTest;
import com.github.kunwardeeps.useragentutils.browser.BotParameterizedTest;
import com.github.kunwardeeps.useragentutils.browser.CFNetworkParameterizedTest;
import com.github.kunwardeeps.useragentutils.browser.CaminoParameterizedTest;
import com.github.kunwardeeps.useragentutils.browser.ChromeMobileParameterizedTest;
import com.github.kunwardeeps.useragentutils.browser.ChromeParameterizedTest;
import com.github.kunwardeeps.useragentutils.browser.FirefoxParameterizedTest;
import com.github.kunwardeeps.useragentutils.browser.InternetExplorerMobileParameterizedTest;
import com.github.kunwardeeps.useragentutils.browser.InternetExplorerParameterizedTest;
import com.github.kunwardeeps.useragentutils.browser.InternetExplorerXboxParameterizedTest;
import com.github.kunwardeeps.useragentutils.browser.KonquerorParameterizedTest;
import com.github.kunwardeeps.useragentutils.browser.LotusParameterizedTest;
import com.github.kunwardeeps.useragentutils.browser.LynxParameterizedTest;
import com.github.kunwardeeps.useragentutils.browser.OperaParameterizedTest;
import com.github.kunwardeeps.useragentutils.browser.OthersParameterizedTest;
import com.github.kunwardeeps.useragentutils.browser.OutlookParameterizedTest;
import com.github.kunwardeeps.useragentutils.browser.SafariParameterizedTest;
import com.github.kunwardeeps.useragentutils.browser.ThunderbirdParameterizedTest;
import com.github.kunwardeeps.useragentutils.browser.ToolParameterizedTest;

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
