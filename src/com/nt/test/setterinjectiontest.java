package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.wishmsggenerator;

public class setterinjectiontest {
	public static void main(String[] args) { 
		BeanFactory factory=null;
		Resource res=null;
		wishmsggenerator generator=null;
		Object obj=null;
		String result=null;
		//locate spring cfgs file
		res=new FileSystemResource("src/com/nt/cfgs/applicationcontext.xml");
		//create ioc container
		factory=new XmlBeanFactory(res);
		//get main bean object
		obj=factory.getBean("wish");
		//type casting
		generator=(wishmsggenerator)obj;
		//call method
		result=generator.generatorwishmsg("raja");
		System.out.println(result);
		}
}

	

				
				
				
				
				
				
				
						
				
				
				
				
				
		
		
	


