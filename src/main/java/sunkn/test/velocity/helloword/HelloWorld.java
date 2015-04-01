/** Created on 2014年11月7日 下午3:57:25 
 *
 * @author sunkn
 *
 * Copyright (C) 2014, KOAL SOFTWARE.
 */
package sunkn.test.velocity.helloword;

import java.io.StringWriter;

import org.apache.velocity.app.VelocityEngine;

import org.apache.velocity.Template;

import org.apache.velocity.VelocityContext;

/**
 * 
 * 
 * @author sunkn
 * 
 */
public class HelloWorld {

	public static void main(String[] args) throws Exception {

		/* first, get and initialize an engine */

		VelocityEngine ve = new VelocityEngine();

		ve.init();

		/* next, get the Template */

		Template t = ve.getTemplate("src/main/templates/helloword/hellosite.vm");

		/* create a context and add data */

		VelocityContext context = new VelocityContext();

		context.put("name", "Eiffel Qiu");

		context.put("site", "http://www.eiffelqiu.com");

		/* now render the template into a StringWriter */

		StringWriter writer = new StringWriter();

		t.merge(context, writer);

		/* show the World */

		System.out.println(writer.toString());

	}
}