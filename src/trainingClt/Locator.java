package trainingClt;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.youtube.traningEjb.Domain.Student;
import com.youtube.traningEjb.Service.StudentService;
import com.youtube.traningEjb.Service.StudentServiceImpl;

public class Locator {
	
	 static void invoke(Student student) throws NamingException {
		// TODO Auto-generated method stub
		final StudentService studentService=lookUp();
		
		studentService.addStudent(student);
	}
		
	
	
		public static StudentService lookUp() throws NamingException
		{
			Hashtable<Object, Object> jnidiProperties=new Hashtable<>();
			jnidiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
			final Context context=new InitialContext(jnidiProperties);
			final String appName="";
			final String moduleName="exampleEjb";
			final String distinctName="";
			final String beanName=StudentServiceImpl.class.getSimpleName();
			final String viewClassName=StudentService.class.getName();
			return ((StudentService) context.lookup("ejb:"+appName+"/"+moduleName+"/"+distinctName+"/"+beanName+"!"+viewClassName));
					
		}
}
