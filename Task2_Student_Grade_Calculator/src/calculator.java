import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        double TotalMarks;
        double averagepercentage;
        String name ;

        Scanner marks=new Scanner(System.in);

        System.out.println("Enter the name of the student = ");
        name = marks.nextLine();
        System.out.println("Enter the marks between 1 to 100 for each subject .");
        System.out.println("\nEnter the marks obtained in English = ");
        int English=marks.nextInt();
        System.out.println("\nEnter the marks obtained in Mathematics = ");
        int Mathematics=marks.nextInt();
        System.out.println("\nEnter the marks obtained in Science = ");
        int Science=marks.nextInt();
        System.out.println("\nEnter the marks obtained in Sanskrit = ");
        int Sanskrit=marks.nextInt();
        System.out.println("\nEnter the marks obtained in History = ");
        int History=marks.nextInt();

        TotalMarks=(English+Mathematics+Science+Sanskrit+History);

        averagepercentage =((TotalMarks)/5);

        char Grade = ' ';
        if(averagepercentage >90) {
            Grade = 'A';
        }
        else if(averagepercentage >80) {
            Grade = 'B';
        }
        else if(averagepercentage >70) {
            Grade = 'C';
        }
        else if(averagepercentage >60) {
            Grade = 'D';
        }
        else if(averagepercentage >50) {
            Grade = 'E';
        }
        else if(averagepercentage <50) {
            Grade = 'F';
        }

        System.out.println("The name of student is "+name+".");
        System.out.println("The total marks of "+name+" = "+TotalMarks);
        System.out.println("The Average Percentage of the "+name+" = "+averagepercentage);
        System.out.println("The grade obtained by the "+name+" is = "+Grade);
        marks.close();

    }

}