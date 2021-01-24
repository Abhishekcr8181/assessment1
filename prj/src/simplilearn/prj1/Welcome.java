package simplilearn.prj1;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Welcome {

public static void main(String[] args) {
		
		System.out.println("welcome to lockers.pvt.ltd");
	    System.out.println("          developer abhishek");

	    
	   try(Scanner sc = new Scanner(System.in)){
		   while(true) {
			   System.out.println("");
			   System.out.println("enter the options you want to perform");
			   System.out.println("choose 1 to see the files in current directory");
			   System.out.println("choose 2 to for add file");
			   System.out.println("choose 3 to for delete file");
			   System.out.println("choose 4 to for search file");
			   System.out.println("choose 5 to for closeapp ");
			   int n = sc.nextInt();
			   switch (n) {
			   case 1:
				   ReadFile readobject= new ReadFile();
				   readobject.newfile();
				   break;
				   
			   case 2:
				 FileOperation addobject1= new FileOperation();
				
				
				
		         addobject1.Addfile();
		         break;
		         
			  case 3:   
				  DeleteFile1 object3= new DeleteFile1();
				
				  System.out.println("You are about the delete the files! \n");
                
                Scanner files = new Scanner(System.in);
                  try {
					Files.delete(null);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                         object3.delete();
                         
				String files1 = null;
				
                      System.out.println("All your expenses are erased!\n");
			   
               
					System.out.println("File deleted!");
					
			  	 default:
                  System.out.println("You have made an invalid choice!");
                  break;
			  	 case 5:
			  		System.out.println("Closing your application... \nThank you!");
				}
			
		   }	
				 
		   } 
				  }

		  

}
	

   

	


        
	


