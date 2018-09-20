package trainingClt;

import javax.naming.NamingException;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.youtube.traningEjb.Domain.Student;




class StudentTest {
	
	@Before
	public void SetUp() throws NamingException
	{
		
		
	}

	@Test
	void AddStudenttest() {
		try {
			
		
			Student student=new Student();
			student.setId("studentID3");
			student.setName("studentname");
			student.setEmail("student@university.com");
			Locator.invoke(student);
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
