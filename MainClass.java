import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Virtual Key for Your Repositories");
		System.out.println("Developer Name: K.Deepthi");
		System.out.println("\t Menu \t" + " \n 1.Create file \n" + "\n 2. Search file \n" + "\n 3. Sort files\n" + "\n 4. Delete file \n" + 
		"\n 5 .Close application \n");
		
		System.out.println("\n Enter your Option \n");
		
		Scanner obj=new Scanner(System.in);
		
		int ch= obj.nextInt();
		
		switch(ch) {
			
			case 1:
				
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter path where yu wnat to create a directoty");	
				String path = sc.next();
				System.out.println("Enter directoty name");
				
				path=path+sc.next();
				
				File f=new File(path);
				
				if(f.mkdir())
					System.out.println("Directoty created");
				else
					System.out.println("Already created");
				
				System.out.println("How many files you wnat to create");
				
				int n=sc.nextInt();
				
				for(int i=1;i<=n;i++) {
				
				System.out.println("Create a file now");
				
				String name;
				
				name=sc.next();
				
				File f2=new File(path +"\\" + name);
				
				try {
				
				if(f2.createNewFile())
					System.out.println("File created");
				else
					System.out.println("Error occured");
				}
				
				catch(Exception e) {
					System.out.println("Some error occured");
				}
				
				}
				sc.close();
				break;
				//System.out.println("Enter you next option");
				//ch=obj.nextInt();
				
			
	case 2:
				
				Scanner sc1=new Scanner(System.in);
				
				System.out.println("Enter Directory name");
				
				String Dname=sc1.next();
				
				File f1=new File("C:\\"+ Dname);
				
				String[] files=f1.list();
				
				sc1.close();
				
				try {
				
				if(files==null)
					System.out.println("No files found");
				else
				{
						for(int i=0;i<files.length;i++) {
							String Fname  = files[i];
							System.out.println(Fname);
						
					}
				}
				}
				catch(Exception e) {
					System.out.println("Some error occured");
				}break;
				
				
			
	case 3:			
				Scanner sc2=new Scanner(System.in);
				
				System.out.println("Enter Directory name");
				
				String D1name=sc2.next();
				
				File f2=new File("C:\\"+ D1name);
				
				sc2.close();
				
				List<String> listFile = Arrays.asList(f2.list());
				
				Collections.sort(listFile);
				for(String s: listFile) {
					System.out.println(s);
				}
				
				System.out.println("===========================================================");
				Collections.sort(listFile,Collections.reverseOrder());
				for(String s: listFile) {
					System.out.println(s);
				}
				break;
				
				
	case 4:			
				
				String Directory, file;
				
				Scanner sc3= new Scanner(System.in);
				
				System.out.println("Enter Directory name");
				
				Directory=sc3.next();
				
				System.out.println("Enter file name whch you wnat to delete");
				
				file=sc3.next();
				
				
				File f3=new File("C:\\" + Directory + "\\" + file);
				
				if(f3.delete())
					System.out.println("File deleted");
				else
					System.out.println("Error occured");
				
				sc3.close();
				break;
				
		case 5:
			
			System.out.println("Customr chooed to close the Application");
			System.exit(0);	
			break;
		}
		
		obj.close();
		
		
	}
	
}
