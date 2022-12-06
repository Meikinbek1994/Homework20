import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length:");
        String length = scanner.nextLine();
        System.out.println("Enter height:");
        String height = scanner.nextLine();
        System.out.println("Enter width:");
        String width = scanner.nextLine();
        Parallelepiped parallelepiped;

        try {
            int lengthInt,heightInt,widthInt;
            try{
                lengthInt=Integer.parseInt(length);
            heightInt=Integer.parseInt(height);
            widthInt=Integer.parseInt(width);
            }catch (Exception e){
                throw new MyException("Length, height and width can not be a letter.");
            }
            parallelepiped = new Parallelepiped(lengthInt, heightInt, widthInt);


            if (lengthInt < 0 || heightInt < 0 || widthInt < 0) {
                    throw new MyException("Length, height and width can not be a negative number.");
                }

                if(lengthInt>20||heightInt>20||widthInt>20){
                    throw new MyException("Length, height and width can not be bigger than 20.");
                }

                    parallelepiped.getArea();
                    parallelepiped.getVolume();


            } catch (MyException e) {
                    System.out.println(e.getMessage());
            } finally {
                System.out.println("Always works");
            }


        }
}
