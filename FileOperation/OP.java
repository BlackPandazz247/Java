package FileOperation;
import java.util.*;
import java.io.*;

public class OP{
    private Scanner input;
    private File myObj;

    public OP()
    {
        myObj = null;
        input = new Scanner(System.in);
    }

    public void create(String filename)
    {   
        try{
            myObj = new File(filename);
        
            if(myObj.createNewFile())
                System.out.println("File "+ myObj.getName() +" created");
            else
                System.out.println("File alredy exists");
        }catch (IOException e){
            System.out.println("!ERROR!");
            e.printStackTrace();
        }
    }

    public void open(String filename)
    {
        myObj = new File(filename);
        if(!myObj.exists())
            System.out.println("File doesn't exist");
    }

    public void write()
    {
        try{
            FileWriter myWriter = new FileWriter(myObj, true);
            String str;
            
            System.out.print("Write the message: ");
            str = input.nextLine();
            myWriter.append(str + "\n");
            myWriter.close();
        }catch(IOException e){
            System.out.println("!ERROR!");
            e.printStackTrace();
        }
    }

    public void read() 
    {
        try{
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine())
                System.out.println(myReader.nextLine());
            myReader.close();
        }catch(FileNotFoundException e)
        {
            System.out.println("File not found");
            e.printStackTrace();
        }       
    }

    public void getFileInfo()
    {
        System.out.println("File name: "+ myObj.getName());
        System.out.println("Absolute path: "+ myObj.getAbsolutePath());
        System.out.println("Writable: "+ myObj.canWrite());
        System.out.println("Readable: "+ myObj.canRead());
        System.out.println("Size: "+ myObj.length());
    }

    public void delete()
    {
        if(myObj.delete())
            System.out.println("File "+ myObj.getName() +" deleted");
        else
            System.out.println("Failed to delete the file");
    }
}