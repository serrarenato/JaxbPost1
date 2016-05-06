package br.com.letsgoti.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, Date> {

	public Date unmarshal(String v) throws Exception {
		return new Date(v)	;
	}

	public String marshal(Date v) throws Exception {
		//SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
		return v.toString();
		//return dt.format(v).toString();
	}
}