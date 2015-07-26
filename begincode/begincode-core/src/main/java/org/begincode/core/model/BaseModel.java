package org.begincode.core.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class BaseModel {
    
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}