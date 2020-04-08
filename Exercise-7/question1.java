import java.io.*;
import java.util.*;
class question1
{
	public static void main(String arg[])
	{
		String fname;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the file name");
		fname = sc.nextLine();
		File f = new File(fname);
		if(f.exists())
			System.out.println("file exists");
		else
			System.out.println("file is does not exists");
		if(f.canRead())
			System.out.println("file can read");
		else
			System.out.println("file cannot read");
		if(f.canWrite())
			System.out.println("it is a writable");
		else
			System.out.println("it is not a writeable");
		if (fname.endsWith(".jpg") || fname.endsWith(".gif") || fname.endsWith(".png"))
                	System.out.println("The given file is an image file.");
            	else if (fname.endsWith(".exe"))
                            	System.out.println("The given file is an executable file.");            
            	else if (fname.endsWith(".txt"))               
                	System.out.println("The given file is a text file.");            
            	else            
                	System.out.println("The file type is unknown.");    
		System.out.println("file length is"+f.length() + "in bytes.");
	}
}      
		