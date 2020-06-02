package com.accurate.solutions.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.*;

import com.accurate.solutions.model.Product;

@WebService
public class Products {

	@WebResult(name = "result")
	@WebMethod(operationName = "productdetail")
	public List<Product> productdetails(@WebParam(name = "name") String name, @WebParam(name = "type") String type) {
		List<Product> plist = new ArrayList<Product>();
		Product pen = new Product();
		pen.setName("Pen");
		pen.setSpecification("It can write");
		pen.setPrice(1.2);
		pen.setType("read");

		Product book = new Product();
		book.setName("Book");
		book.setSpecification("It can use for writing");
		book.setPrice(2.6);
		book.setType("read");

		Product mouse = new Product();
		mouse.setName("mouse");
		mouse.setSpecification("It control your computer");
		mouse.setPrice(10.5);
		mouse.setType("tech");

		Product phone = new Product();
		phone.setName("phone");
		phone.setSpecification("make calls");
		phone.setPrice(999.5);
		phone.setType("tech");
		plist.add(pen);
		plist.add(book);
		plist.add(mouse);
		plist.add(phone);

		List<Product> plist1 = new ArrayList<Product>();
		for (Product p : plist) {
			if (p.getType().equals("read")) {
				plist1.add(pen);
				plist1.add(book);
			} else {
				plist1.add(mouse);
				plist1.add(phone);
			}
		}
		return plist1;
	}
}
