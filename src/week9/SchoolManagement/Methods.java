package week9.SchoolManagement;

import java.sql.SQLOutput;
import java.util.Scanner;

import static week9.SchoolManagement.Person.personType;

public class Methods implements SchoolManagement{
    static Scanner input=  new Scanner(System.in);
    @Override
    public void create() {
        System.out.println(" *** Welcome to create " + personType + " page ***");
             // Teacher(String fullName, String idNumber, int age, String department, String teacherID)

        System.out.println("Enter fullname: ");
        String name = input.next();

        System.out.println("Enter ID number: ");
        try {
            String idNumber = input.next();
            idNumber = idNumber.replace(" ", ""); // This line of code is to catch the spaces when they come from the user.

            if (personType.equals("STUDENT")) {
                System.out.println("Enter age: ");
                try {
                    int age = input.nextInt();
                    if (age < 8 || age > 19) {
                        throw new ArithmeticException("Your age is out of the range.");
                    } else {
                        // studentNumber, String course
                        System.out.println("Enter your student number: ");
                        int studentNumber = input.nextInt();

                        System.out.println("Enter your course: ");
                        String course = input.next();

                        Student std = new Student(name, idNumber, age, studentNumber, course);
                        student.add(std);
                        System.out.println("Added student is: " + std.getFullName());

                    }
                } catch (Exception e) {
                    throw new ArithmeticException(e.getMessage());
                }

                } else { // For teacher.
                    System.out.println("Enter your age: ");
                    int age = input.nextInt();

                    System.out.println("Enter your department: ");
                    String department = input.next();

                    System.out.println("Enter your teacher ID number: ");
                    String teacherID = input.next();

                    Teacher teacher = new Teacher(name, idNumber, age, department, teacherID);
                    teachers.add(teacher);
                    System.out.println("Added teacher: " + teacher.getFullName());

                }

            } catch(Exception e){
                System.out.println("You have entered wrong information.");
                create();
            }
    }

    @Override
    public void subMenu() {
            System.out.println("============= OPERATIONS =============\n" +
                    "1- ADD\n" +
                    "2- SEARCH\n" +
                    "3- LIST\n" +
                    "4- DELETE\n" +
                    "5- UPDATE\n" +
                    "6- MAIN MENU\n" +
                    "Q- EXIT");
            String option=input.next();

            switch(option){
                case "1":
                    create();
                    subMenu();
                    break;
                case "2":
                    search();
                    subMenu();
                    break;
                case "3":
                    list();
                    subMenu();
                    break;
                case "4":
                    delete();
                    subMenu();
                    break;
                case "5":
                    update();
                    subMenu();
                    break;
                case "6":
                    Main.mainMenu();
                    break;
                case "Q":
                    exit();
                    // System.exit(0);
                    break;
                default:
                    System.out.println("You entered wrong data! Try again!");
                    subMenu();
                    break;
            }
    }

    @Override
    public void search() {
        System.out.println(" *** Welcome to search " + personType + " page ***");
        boolean flag = true;

        System.out.println("Enter ID number you want to search for: ");
        String idNumber = input.next();

        if(personType.equalsIgnoreCase("STUDENT")){ // BLOCK OF CODE TO SEARCH FOR STUDENTS.
            for (Person each: student
                 ) {
                if(idNumber.equalsIgnoreCase(each.getIdNumber())){
                    System.out.println("The student you search " + each.getFullName());
                    flag = false;
                }else System.out.println("There is no student with such " + idNumber);
            }
        } else { // BLOCK OF CODE TO SEARCH FOR TEACHERS.
            for (Person each: teachers
            ) {
                if(idNumber.equalsIgnoreCase(each.getIdNumber())){
                    System.out.println("The teacher you search " + each.getFullName());
                    flag = false;
                }else System.out.println("There is no teacher with such " + idNumber);
//                if(flag){
//                    System.out.println("There is no teacher with such " + idNumber);
//                }
            }
        }
    }

    @Override
    public void list() {
        System.out.println(" *** Welcome to list " + personType + " page ***");
        if(personType.equalsIgnoreCase("STUDENT")){ // BLOCK OF CODE TO LIST FOR STUDENTS.
            for (Person each: student
            ) {
                System.out.println(each);
            }
        } else { // BLOCK OF CODE TO LIST FOR TEACHERS.
            for (Person each: teachers
            ) {
                System.out.println(each);
            }
        }
    }

    @Override
    public void exit() {
        System.out.println("Come back again! ");
    }

    @Override
    public void delete() {
        System.out.println(" *** Welcome to delete " + personType + " page ***");
        boolean flag = true;

        System.out.println("Enter ID number you want to search for: ");
        String idNumber = input.next();

        if(personType.equalsIgnoreCase("STUDENT")){ // BLOCK OF CODE TO DELETE STUDENTS.
            for (Person each: student
            ) {
                if(idNumber.equalsIgnoreCase(each.getIdNumber())){
                    System.out.println("The student you search deleted " + each.getFullName());
                    student.remove(each); // This line of code deletes the direct Student with ID number.
                    flag = false;
                }else System.out.println("There is no student with such " + idNumber);

            }
        } else { // BLOCK OF CODE TO DELETE TEACHERS.
            for (Person each: teachers
            ) {
                if(idNumber.equalsIgnoreCase(each.getIdNumber())){
                    System.out.println("The teacher you search deleted " + each.getFullName());
                    teachers.remove(each); // This line of code deletes the direct Teacher with ID number.
                    flag = false;
                }else System.out.println("There is no teacher with such " + idNumber);

            }
        }
    }

    @Override
    public void update() { // We create update method.
        System.out.println(" *** Welcome to update " + personType + " page ***");
        boolean flag = true;

        System.out.println("Enter ID number you want to update for: ");
        String idNumber = input.next();
        input.nextLine();

        if(personType.equalsIgnoreCase("STUDENT")){ // BLOCK OF CODE TO UPDATE STUDENTS.
            for (Student each: student
            ) {
                if(idNumber.equalsIgnoreCase(each.getIdNumber())){
                    System.out.println("This is short information about the student you want to update " + each); // TO DO: get rid of {}

                    System.out.println("Enter full name: ");
                    String name = input.nextLine();
                    each.setFullName(name);

                    System.out.println("Enter student number: ");
                    int studentNumber = input.nextInt();
                    each.setStudentNumber(studentNumber);

                    System.out.println("Enter your course: ");
                    String course = input.nextLine();
                    each.setCourse(course);
                    input.nextLine();

                    System.out.println("Enter your age: ");
                    int age = input.nextInt();
                    each.setAge(age);

                    System.out.println("Updated student: " + each);

                    flag = false;
                }else {
                    System.out.println("There is no student with such: " + idNumber);
                }
            }
        } else { // BLOCK OF CODE TO UPDATE TEACHERS.
            for (Teacher each: teachers
            ) {
                if(idNumber.equalsIgnoreCase(each.getIdNumber())){
                    System.out.println("This is short information about the teacher you want to update " + each); // TO DO: get rid of {}

                    System.out.println("Enter full name: ");
                    String name = input.nextLine();
                    each.setFullName(name);

                    System.out.println("Enter teacher's ID number: ");
                    String teacherID = input.nextLine();
                    each.setTeacherID(teacherID);

                    System.out.println("Enter department: ");
                    String department = input.nextLine();
                    each.setDepartment(department);

                    System.out.println("Enter your age: ");
                    int age = input.nextInt();
                    each.setAge(age);

                    System.out.println("Updated teacher: " + each);
                    flag = false;
                }else System.out.println("There is no teacher with such: " + idNumber);
            }
        }
    }
}
