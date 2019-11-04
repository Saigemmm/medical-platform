package org.system.web.converter;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

public class MyDateConverter extends DefaultTypeConverter {
	SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

	@Override
	public Object convertValue(Map<String, Object> context, Object value, Class toType) {
		if (toType == java.sql.Date.class) {
			String dateStr = ((String[]) value)[0];
			java.util.Date date = null;
			try {
				date = format.parse(dateStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (date != null) {
				return new java.sql.Date(date.getTime());
			}
		} else if (toType == String.class) {
			java.sql.Date date = (Date) value;
			return format.format(date);
		}
		return null;
	}

}
