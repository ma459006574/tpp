/**
* Project Name:tpp
* Date:2016年5月6日上午10:12:20
* Copyright (c) 2016, jinjuma@yeah.net All Rights Reserved.
*/

package org.test.tpp.exception;

/**
 * 铁路路线规划异常 <br/>
 * date: 2016年5月6日 上午10:12:20 <br/>
 * @author jinjuma@yeah.net
 * @version 
 */
public class TppException extends RuntimeException {

	private static final long serialVersionUID = 3160417017733764699L;

	/**
	* Creates a new instance of TppException.
	* @param message 消息
	*/
	public TppException(String message) {
		super(message);
	}

    /**
    * Creates a new instance of TppException.
    * @param message 消息
    * @param cause 相关异常
    */
    public TppException(String message, Throwable cause) {
        super(message, cause);
    }
}
