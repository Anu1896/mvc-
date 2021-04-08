/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author miracle
 */
public class mvcpattren 
{
    public static void main(String[] args) 
    {
        student model  = retrivestudentFromDatabase();
  
        studentview view = new studentview();
  
        studentcontroller controller = new studentcontroller(model, view);
  
        controller.updateView();
  
        controller.setStudentName("sri");
  
        controller.updateView();
    }
  
    private static student retrivestudentFromDatabase()
    {
        student student = new student();
        student.setName("srijana");
        student.setRollNo("4927");
        return student;
    }
      
}
    

