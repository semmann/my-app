package com.semmann.sample;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.semmann.sample.polymorphism.PolyExample;
import com.semmann.sample.polymorphism.PolyImplCircle;
import com.semmann.sample.polymorphism.PolyImplRectangle;


/**
 * Hello world!
 *
 **/

public class App {

	List<PolyExample> polylist;

	private final static Logger logger = Logger.getLogger(App.class);
	public static void main(String[] args) {
		System.out.println("Hello World!");
		logger.info("Hello World!");
		App app = new App();
		app.getShape();

	}

	public void getShape() {
		polylist = new ArrayList<PolyExample>();
		polylist.add(new PolyImplCircle());
		polylist.add(new PolyImplRectangle());

		Iterator<PolyExample> it = polylist.iterator();

		while (it.hasNext()) {

			//System.out.println(it.next().Shaspe());
			logger.info(it.next().Shaspe());
		}
	}
}
