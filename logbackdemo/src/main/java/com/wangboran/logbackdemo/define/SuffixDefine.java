package com.wangboran.logbackdemo.define;

import ch.qos.logback.core.PropertyDefinerBase;

/**
 * 类描述
 *
 * @author WangBoran
 * @since 2020/10/13 16:15
 */
public class SuffixDefine extends PropertyDefinerBase {

	@Override
	public String getPropertyValue() {
		return "_suffix";
	}
}