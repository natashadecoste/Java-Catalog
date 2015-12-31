import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
package catalog;



public class UserInterface {
		private ArrayList<String> Readables;
		private static ArrayList<String> AudioProducts;
		private int currentPage; // the page number (P1..P10)
		private String username;
		
		/*
		public void changeCurrentPage(int pageNum){
		//public int changeCurrentPage(int pageNum){ // This method is for page navigation. Based on the values of the state variable, call different pages
			int userDecision = 0;
			if(pageNum == 1){
				// CALL P1
				
				System.out.println("Hello.");
				System.out.println();
				System.out.println("Options:");
				System.out.println("1. Sign in ");
				System.out.println("2. Sign up. ");
				System.out.println();
				System.out.println("Choose your option: ");
				// make a scanner to get inputs from the user
				// parse through usernames to check if user exists
				
			}
			else if(pageNum == 2){
				// CALL P2
				System.out.println("Choose your username: ");
				//scanner to get user input
				//assign user input to username variable
				//call username class to save username
				System.out.println("Username successfully added.");
				currentPage = 3;
				changeCurrentPage(currentPage); //sends the user back to the signup page? or to p3?
				
				
			}
			else if(pageNum == 3){ //means that username does exist 
				// CALL P3
				System.out.println("Hello Mr. "+ username);
				currentPage = 5;
				changeCurrentPage(currentPage);
				
			}
			else if(pageNum == 4){ //means username does not exist
				// CALL P4
				System.out.println("No Access"); //no access and sends user back to P1
				currentPage = 1;
				changeCurrentPage(currentPage);
				
			}
			else if(pageNum == 5){
				// CALL P5
				System.out.println("1. View Items by Category");
				System.out.println("2. View Shopping Cart");
				System.out.println("3. Sign Out");
				System.out.println();
				System.out.println("Choose your option: ");
				// creates a scanner to get userChoice
				if(userChoice == 1){ //view items by category
					currentPage = 6;
					changeCurrentPage(currentPage);
					
				}
				else if(userChoice == 2){ //if they choose to view shopping cart
					currentPage = 7;
					changeCurrentPage(currentPage);
					
				}
				else if (userChoice == 3){ //if they want to sign out
					currentPage = 1;
					changeCurrentPage(currentPage);
					//reset the username variable??? or no?
				}
				
			}
			else if(pageNum == 6){ // view items by category page
				// CALL P6
				System.out.println();
				System.out.println("1. Readables");
				System.out.println("2. Audio");
				System.out.println();
				System.out.println("Choose your option: ");
				System.out.println();
				System.out.println("Press -1 to return to previous menu");
				// creates scanner to get inputs
				if(userChoice == -1){
					currentPage = 5;
					changeCurrentPage(currentPage);
				}
				else if(userChoice == 1){
					currentPage = 8;
					changeCurrentPage(currentPage);
				}
				else if(userChoice == 2){
					currentPage = 9;
					changeCurrentPage(currentPage);
					
				}
				
			}
			else if(pageNum == 7){
				// CALL P7
				//needs to display the items in the shopping cart from the shopping cart class
				
			}
			else if(pageNum == 8){
				// CALL P8
				//displays the Readables!
				System.out.println();
				System.out.println("Audio: ");
				System.out.println();
				System.out.println("S.No 	Name			Artist		Price($)	Quantity in Store	Type");
				getAudioProducts();
				showAudioProducts();
				System.out.println();
				System.out.println("Choose your option:");
				System.out.println("Press -1 to return to previous menu.");
				
				
				
			}
			else if(pageNum == 9){
				// CALL P9
				System.out.println();
				System.out.println("Readables: ");
				System.out.println();
				System.out.println("S.No	Name of the Book		Author		Price($)		Quantity in Store 	Type");
				getReadables();
				showReadables();
				System.out.println();
				System.out.println("Choose your option:");
				System.out.println("Press -1 to return to previous menu.");
				
			}
			else if (pageNum == 10) {	//page == 10
				// CALL P10
				
			}
		
		}
		public int getCurrentPage (int newPageNum) {// This method is for page navigation. It should change to current page and show the content.
			currentPage = newPageNum;
			return currentPage;
		}
		*/
		
		public void GetReadables() { // Fetches all readables from the files and places them in the Readables array
	       try{  
		        
				//File file1 = new File("Books.txt");
				//File file2 = new File("Ebooks.txt");
				
	    	    //BufferedReader booksIn = new BufferedReader(new FileReader("Books.txt")); //creates the readers to parse through the lines of products
		        //BufferedReader eBooksIn = new BufferedReader(new FileReader("Ebooks.txt")); //seperate one because Ebooks are stored in a seperate txt file
	    	    //FileReader file1 = new FileReader("Books.txt");
	    	    //FileReader file2 = new FileReader("eBooks.txt");
				BufferedReader booksIn = new BufferedReader(new FileReader("Books.txt")); //creates the readers to parse through the lines of products

				
		        
		         
		        
		     	String line; // = booksIn.readLine();
		     	while((line = booksIn.readLine()) != null) {
		     		Readables.add(line);
		     	}
		        booksIn.close();
		        System.out.println("readables size: " + Readables.size());
		        
		     	/*String line2; // = booksIn.readLine();
		     	while((line2 = eBooksIn.readLine()) != null) {
		     		Readables.add(line2);
		     	}
		        eBooksIn.close();
		        */
	       }
	       catch(IOException ioe){
	    	   System.out.println("Problem with the input files");
	       }
	              
		}
	         
		
		public void GetAudioProducts() { // Fetches all audio products from the files and places them in the Readables array
			try{

			 
			 BufferedReader cdIn = new BufferedReader(new FileReader("CDs.txt")); //creates the readers to parse through the lines of products
	         BufferedReader mp3In = new BufferedReader(new FileReader("MP3.txt")); //seperate one because Ebooks are stored in a seperate txt file
	         
			 
	         ArrayList<String> AudioProducts = new ArrayList<>(); //creates an arraylist of strings for readables
	         
	         while (true) {
	     	    String line = cdIn.readLine();
	     	    if (line == null) {
	     		break;
	     	    }
	     	    //append to arrayList here
	     	    AudioProducts.add(line);
	     	}
	        cdIn.close();
	        while (true) {
		     	String line = mp3In.readLine();
		     	if (line == null) {
		     	break;
		     	}
		     	//append to arrayList here
		     	AudioProducts.add(line);
		    }
	        mp3In.close();
			}
			catch(IOException ioe){
				System.out.println("error");
			}
		
		}
		
		
		public void ShowReadables(){
			// Displays all readables for browsing
			for(int i=0; i<(Readables.size()); i++){
				System.out.println(Readables.get(i));
				
				}
			
			}
		
		
		public void ShowAudioProducts(){
			// Displays all audioproducts for browsing
			for(int i=0; i < (AudioProducts.size()); i++){
				System.out.println(AudioProducts.get(i));
				
				}
		}
		
		public static void main(String []args){
			UserInterface UI = new UserInterface();
			UI.GetReadables();
			/*File here = new File(".");
			System.out.println(here.getAbsolutePath());
			for(int i =0;i<Readables.size();i++){
				System.out.println(Readables.get(i));
			}
			BufferedReader booksIn = new BufferedReader(new FileReader("Books.txt")); //creates the readers to parse through the lines of products
			
			String line;
			while((line = booksIn.readLine()) != null){
				System.out.println(line);
			}*/
			
			
		}
			
		

}
