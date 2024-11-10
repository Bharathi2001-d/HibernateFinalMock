package HibernateFinalMock.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
public static void main(String[] args) throws IOException {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("monday");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
//	----inserting values----
    Student student=new Student();
    student.setSName("Rohan");
	student.setSpercentage(95.89);
	student.setSDOB("01-05-2001");
	FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Bharathi\\OneDrive\\Desktop\\lord shiva.jpeg");
	byte[] arr=new byte[fileInputStream.available()];
	fileInputStream.read(arr);
	student.setSImage(arr);
	entityTransaction.begin();
	entityManager.persist(student);
	entityTransaction.commit();
	
	
	//-----finding the values---
//	Student stu = entityManager.find(Student.class, 0);
//	System.out.println(stu);
//	
	//-----updating the value
//	Student stu = entityManager.find(Student.class, 0);
//	stu.setSName("Dhanraj");
//	entityTransaction.begin();
//	entityManager.merge(stu);
//	entityTransaction.commit();
	
	//----deleting the values
//	Student stu1 = entityManager.find(Student.class, 0);
//	entityTransaction.begin();
//	entityManager.remove(stu1);
//	entityTransaction.commit();
	
	
	
//	
}
}
