package test;

public class Test {
    public static void main(String[] args) {
        //创建一个数组用来存储学生对象‘
        Student[] arr=new Student[3];
        //创建学生对象并添加到数组中
        Student stu1=new Student(18,"男",1,"张三");
        Student stu2=new Student(19,"女",2,"李四");
        Student stu3=new Student(20,"男",3,"王五");
        arr[0]=stu1;
        arr[1]=stu2;
        arr[2]=stu3;
    }


    public  static void getIndex(){
        boolean flag=true;
    }
}