
public class example{//here we must have to keep class public and class name should be same as program name.
           int x;//varible declared
           int y;//variable declared not initialized.
           String name;
             
                public static void main(String []args){
                      example pnt=new example();
                          System.out.println("pnt is"+pnt.name+" "+pnt.x+" "+pnt.y);//prints pnt is null 0 0.      
                }
}
