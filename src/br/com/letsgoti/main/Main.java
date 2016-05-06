package br.com.letsgoti.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import br.com.letsgoti.model.Costumer;
import br.com.letsgoti.model.Phone;

public class Main {

	public static void main(String[] args) {
		
		List<Phone> listPhones = new ArrayList<Phone>();
		
		listPhones.add(new Phone("celular","99991111"));
		listPhones.add(new Phone("fixo","33331111"));
		listPhones.add(new Phone("recado","33332222"));
		
		Costumer costumer = new Costumer();
		costumer.setDateBorn(new Date("15/05/2015"));
		costumer.setEmail("joao@gmail.com");
		costumer.setFirstName("Joao");
		costumer.setLastName("Silva");
		costumer.setSex("M");
		costumer.setId(1);
		costumer.setPhones(listPhones);
		
		try {
			JAXBContext context = JAXBContext.newInstance(Costumer.class);
			Marshaller m = context.createMarshaller();
			
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			m.marshal(costumer, System.out);
		} catch (JAXBException e) {			
			e.printStackTrace();
		}

	}

}
