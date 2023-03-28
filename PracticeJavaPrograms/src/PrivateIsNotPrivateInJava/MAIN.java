package PrivateIsNotPrivateInJava;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import DeleteStringCharacter.DeleteStringCharacter;

public class MAIN {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

				
		try 
		{
			
			//DeleteStringCharacter t1 =new DeleteStringCharacter();  // Not possible because constructor is private
			//t1.deleteChar(str1, c1);  
			
			String str1="My Background is BS-Computer Science";		
			char c1='B';
			// StringRelated(package name) and DeleteStringCharacter(class name)
			Class c = Class.forName("StringRelated.DeleteStringCharacter");	
			
			
			 System.out.println("*****************************************************************");			 
			 String st= c.getName();
			 System.out.println("Class Name : "+st);
			 
			 Field[] st1=c.getDeclaredFields();
			 for(Field field:st1)
			 {
				 System.out.println("Fields Name : "+field.getName());
			 }
			 
			 Method[] met=c.getDeclaredMethods();
			 for(Method method:met)
			 {
				 System.out.println("Methods name : "+method.getName());
			 }			 
			 System.out.println("******************************************************************");
			
			
		    Constructor[] dc=c.getDeclaredConstructors();		
		    for(Constructor constructor:dc)
		    {
			    constructor.setAccessible(true); 			    
			try 
			{
				 DeleteStringCharacter dSC = (DeleteStringCharacter)constructor.newInstance();
				 dSC.deleteChar(str1, c1);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		  }
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
