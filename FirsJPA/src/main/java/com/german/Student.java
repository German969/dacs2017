package com.german;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="STUDENT")
public class Student {
	
		@Id
		@Column(name="id")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		
		@Column(name="name")
		private String name;
		
		@Column(name="age")
		private int age;
		
		@Transient //no se va a guardar en la base de datos
		private String adress;
		
		public Student(){
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		public String getAdress() {
			return adress;
		}

		public void setAdress(String adress) {
			this.adress = adress;
		}

		public Student(String name, int age, String adress) {
			super();
			this.name = name;
			this.age = age;
			this.adress = adress;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + "]";
		}
		
		
		
}
