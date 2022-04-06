package javaCodeTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private String name;
    private String number;

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static void main(String[] args) {

        Student student1 = new Student("이범기","1");
        Student student2 = new Student("이범수","2");
        Student student3 = new Student("이범학","3");
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);



        Scanner scanner = new Scanner(System.in);


        while (true)
        {
            System.out.println("계속 검색을 하고싶으면 y 종료하고 싶으면 n");
            String input = scanner.next();
            if (input.equals("y"))
            {
                System.out.println("학생 이름");
                String inputName = scanner.next();
                for (Student stu :studentList) {
                    if (stu.getName().equals(inputName)){
                        System.out.println(stu.getNumber()+"번째에 있습니다.");
                    }
                }
            }
            else if(input.equals("n"))
            {
                System.out.println("프로그램이 종료되었습니다.");
                    break;
            }
            else
            {
                System.out.println("다시 눌러주세요");
            }


        }



    }

}
