/**
 * 
 */
package com.github.useragentutils;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.useragentutils.Browser;
import com.github.useragentutils.OperatingSystem;
import com.github.useragentutils.UserAgent;

/**
 * @author harald
 *
 */
public class UserAgentTest {

	/**
	 * Test method for {@link com.github.useragentutils.UserAgent#parseUserAgentString(java.lang.String)}.
	 */
	@Test
	public void testParseUserAgentString() {
		UserAgent userAgent = UserAgent.parseUserAgentString("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.2; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)");
		assertEquals(OperatingSystem.WINDOWS_XP, userAgent.getOperatingSystem());
		assertEquals(Browser.IE6, userAgent.getBrowser());
	}
	
	/**
	 * Test method for {@link com.github.useragentutils.UserAgent#parseUserAgentString(java.lang.String)} 
	 * that checks for proper handling of a <code>null</code> userAgentString.
	 */
	@Test
	public void testParseUserAgentStringNull() {
		UserAgent userAgent = UserAgent.parseUserAgentString(null);
		assertEquals(OperatingSystem.UNKNOWN, userAgent.getOperatingSystem());
		assertEquals(Browser.UNKNOWN, userAgent.getBrowser());
		assertNull(userAgent.getBrowserVersion());
	}

	/**
	 * Test method for {@link com.github.useragentutils.UserAgent#toString()}.
	 */
	@Test
	public void testToString() {
		UserAgent userAgent = UserAgent.parseUserAgentString("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.2; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)");
		assertEquals(OperatingSystem.WINDOWS_XP.toString() + "-" + Browser.IE6.toString(), userAgent.toString());
	}

	/**
	 * Test method for {@link com.github.useragentutils.UserAgent#valueOf(int)}.
	 */
	@Test
	public void testValueOf() {
		UserAgent userAgent = UserAgent.parseUserAgentString("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.2; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)");
		UserAgent retrievedUserAgent = UserAgent.valueOf(userAgent.getId());
		assertEquals(userAgent, retrievedUserAgent);
	}

	/**
	 * Test method for {@link com.github.useragentutils.UserAgent#valueOf(String)}.
	 */
	@Test
	public void testValueOf2() {
		UserAgent userAgent = UserAgent.parseUserAgentString("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.2; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)");
		UserAgent retrievedUserAgent = UserAgent.valueOf(userAgent.toString());
		assertEquals(userAgent, retrievedUserAgent);
	}
	
}
