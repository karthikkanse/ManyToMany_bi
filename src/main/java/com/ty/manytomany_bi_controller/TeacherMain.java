package com.ty.manytomany_bi_controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manytomany_bi_dto.Student;
import com.ty.manytomany_bi_dto.Teacher;

public class TeacherMain {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Student s1=new Student();
		s1.setName("kumar");
		s1.setAddress("MAR");
		s1.setPhone(987898);
		
		Student s2=new Student();
		s2.setName("abhi");
		s2.setAddress("bng");
		s2.setPhone(885589);
		
		Student s3=new Student();
		s3.setName("punit");
		s3.setAddress("llg");
		s3.setPhone(225569);
		
		Student s4=new Student();
		s4.setName("umesh");
		s4.setAddress("WH");
		s4.setPhone(445654);
		
		
		Teacher t1=new Teacher();
		t1.setName("Rahul");
		t1.setSubject("java");
		t1.setAddress("OAR");
		t1.setPhone(996455);
		
		Teacher t2=new Teacher();
		t2.setName("chandan");
		t2.setSubject("adv java");
		t2.setAddress("Rajaji");
		t2.setPhone(887799);
		
		Teacher t3=new Teacher();
		t3.setName("rishab");
		t3.setSubject("HTML");
		t3.setAddress("BSVNGDI");
		t3.setPhone(1122558);
		
		
		List<Student> l=new ArrayList<Student>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		List<Student> l1=new ArrayList<Student>();
		l1.add(s2);
		l1.add(s4);
		
		//
		
		List<Teacher> a1=new ArrayList<Teacher>();
		a1.add(t1);
		a1.add(t2);
		
		List<Teacher> a2=new ArrayList<Teacher>();
		a2.add(t3);
		
		
		s1.setTeacher(a2);
		s2.setTeacher(a1);
		s3.setTeacher(a1);
		s4.setTeacher(a2);
		
		t1.setStudent(l1);
		t2.setStudent(l1);
		t3.setStudent(l1);		
		
		entityTransaction.begin();
		
		
		entityManager.persist(s1);
		entityManager.persist(s2);
		entityManager.persist(s3);
		entityManager.persist(s4);
		
		entityManager.persist(t1);
		entityManager.persist(t2);
		entityManager.persist(t3);
		
		entityTransaction.commit();
		
		
		
		
		
		
		

	}

}
