/**
 * Created by Abhimanyu
 * on 2023-01-31 January 2023
 **/
package org.abhi.mvc;

public class MVCDriver {
    public static void main(String[] args) {
        //fetch student record based on his roll no from the database
        StudentModel model  = retriveStudentFromDatabase();

        //Create a view : to write student details on console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //update model data
        controller.setStudentName("Frank");

        controller.updateView();
    }

    private static StudentModel retriveStudentFromDatabase(){
        StudentModel student = new StudentModel();
        student.setName("Jack");
        student.setRollNo("11");
        return student;
    }
}
