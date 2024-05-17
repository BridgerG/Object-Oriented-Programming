# CookBook

## What does it do
This code makes a operational library that you can store recipes in while keeping them oraganized, accessable, and editable.

## How to run
To run the program you first have to put the location that you want the files to be saved at on your computer, for that you go into the CookBook.java file and copy your file path in between the "" to the right of the word place.
	private String place = "C:\\Users\\btgri\\OneDrive\\JAVA STUFF\\Cookbook\\src\\crustycookbook\\";
It currently looks like this so make sure you delete the text inside.

After that you run the file called CookBookAction.java and enter in the name of your account and follow the prompts and it will do the rest itself.

## Code That checks for a files existence and changes prompts for the lack of info in them
				if (account.getListLengthBase() == 0) {
				
					System.out.print("What would you like your first section of your cookbook to be called? ");
					name = scan.nextLine();
					account.additionBase(name);
					continue;
				
				}

## Credits
Bridger Griffiths
