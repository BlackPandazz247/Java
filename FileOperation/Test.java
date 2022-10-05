package FileOperation;
import java.util.*;

public class Test{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String filename;
        int menu;
        OP myObj;

        System.out.print("Insert the filename to work with (please write extension): ");
        filename = input.nextLine();

        myObj = new OP(); 
        myObj.create(filename);

        do
        {
            System.out.print("\n1)Create a file\n2)Open a file\n3)Write\n4)Read\n5)Get info\n6)Delete\n0)-EXIT-\n: ");
            menu = input.nextInt(); input.nextLine();
            switch(menu)
            {
                case 0:
                    System.out.println("-EXIT-");
                    break;
                case 1:
                    System.out.print("Insert filename: ");
                    filename = input.nextLine();
                    myObj.create(filename);
                    break;
                case 2:
                    System.out.print("Insert filename: ");
                    filename = input.nextLine();
                    myObj.open(filename);
                    break;
                case 3:
                    myObj.write();  
                    break;
                case 4:
                    myObj.read();
                    break;
                case 5:
                    myObj.getFileInfo();
                    break;
                case 6:
                    myObj.delete();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while(menu != 0);
        input.close();
    }
}