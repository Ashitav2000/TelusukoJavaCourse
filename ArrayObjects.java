class Student{
    int roll;
    String name;
    int marks;
}
public class ArrayObjects {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "Ashita";
        s1.marks= 97;

        Student s2 = new Student();
        s2.roll = 2;
        s2.name = "Ashit";
        s2.marks= 96;

        Student s3 = new Student();
        s3.roll = 3;
        s3.name = "Ashi";
        s3.marks= 98;
        // to create an array of students
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i =0;i<students.length;i++){
            System.out.println(students[i].name+" : " + students[i].marks);
        }


        int[] n = new int[4];
        n[0]=4;
        n[1]=5;
        n[2]=6;
        n[3]=7;

        for(int i =0; i<n.length; i ++){
            System.out.println(n[i]);
        }
    }
}
