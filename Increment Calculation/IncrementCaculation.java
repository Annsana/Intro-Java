import java.util.Scanner;
public class IncrementCalculation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        int salary = sc.nextInt();
        System.out.println("Enter the Performance appraisal rating");
        double rating = sc.nextDouble();
        
        if(salary<=0){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        else if(rating<1 || rating>5){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        else{
            if(rating>=1 && rating<=3){
                double percentage = (double)10/100;
                double new_sal = salary*percentage;
                int sal = (int)new_sal + salary;
                System.out.println(sal);
            }
            else if(rating>=3.1 && rating<=4){
                double percentage =  (double)25/100;
                double new_sal = salary*percentage;
                System.out.println((int)new_sal+salary);
            }
            else if(rating>=4.1 && rating<=5){
                double percentage =  (double)30/100;
                double new_sal = salary*percentage;
                System.out.println((int)new_sal+salary);
            }
              
              
              
        }
    }
}
