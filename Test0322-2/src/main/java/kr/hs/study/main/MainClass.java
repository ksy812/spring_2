package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.beans.Magazine;
import kr.hs.study.beans.Novel;
import kr.hs.study.beans.Poet;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
	
		Book obj1 = ctx.getBean("book1", Novel.class);
		obj1.buy();
		
		Book obj2 = ctx.getBean("book2", Poet.class);
		obj2.buy();
		
		Book obj3 = ctx.getBean("book3", Magazine.class);
		obj3.buy();
		
		System.out.println("-------------------------------");
		
		obj1.sell();
		obj2.sell();
		obj3.sell();
		
		System.out.println("-------------------------------");
		
		obj1.create();
		obj2.create();
		obj3.create();
		
		
		ctx.close();
	}

}
