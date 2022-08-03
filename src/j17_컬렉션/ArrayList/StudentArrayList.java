package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import j15_스태틱.Student;

public class StudentArrayList {

	public static void main(String[] args) {
		Student student1 = new Student("조문기");
		Student student2 = new Student("김호영");
		Student student3 = new Student("서재효");
		Student student4 = new Student("신승환");
		Student student5 = new Student("전나경");
		
		/*
		 * studentList
		 * 만들어서 학생들 전부 다 add
		 * Student 배열을 생성하고 그 배열을 리스트로 변환후에 (인터페이스의 리스트 asList 쓰라는 거임)
		 * 새로운 ArrayList를 생성하여 전체를 추가 (addAll 사용)
		 */
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
//		내답
//		List<String> asList = Arrays.asList(new String[] {"조문기", "김호영", "서재효", "신승환", "전나경"});
//		list.addAll(asList);
//		System.out.println(asList);
		
		Student[] students = {student1, student2, student3, student4, student5};
		studentList.addAll(Arrays.asList(students));
		System.out.println(studentList);
		for(Student student : studentList) {
			System.out.println(student);
		}
		
		/*
		 * 학생 이름이 서재효인 객체를 찾아서
		 * 출력하고 삭제하기
		 */
		
		for(int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			if(studentList.get(i).getName().equals("서재효")) {
				System.out.println(studentList.get(i));
				studentList.remove(i);
			}
		}
		
		for(Student student : studentList) {
			if(student.getName().equals("전나경")) {
				System.out.println(student);
				studentList.remove("전나경");
				System.out.println(studentList);
			}
		}
		
		System.out.println(studentList);
		
		
		
	}

}











