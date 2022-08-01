package VirtualKey;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;


public class Lockedme {
	public static void main(String[] args)  {
        File folder = new File("D://virtualkey");
        folder.mkdirs(); 
        Scanner scan = new Scanner(System.in);

        while(true){

            System.out.println("Prototype of the Application LockedMe.com \n");
            System.out.println("The following functions are :-    \n");
            System.out.println("1.Re-arrange the files in the current directory in ascending order\n");
            System.out.println("2. To perform user interface enabled operations  \n");
            System.out.println("3. Program Termination\n");
            System.out.println("What choice do you want to perform \n");

            int choice = scan.nextInt();
            switch(choice)
            {
                case 1:

                    File arr[] = folder.listFiles();
                    Arrays.sort(arr);

                    for(int i=0;i<arr.length;i++)
                        System.out.println(arr[i]);
                        break;


                case 2:
                    Boolean temp = true;
                    while(temp) {
                        System.out.println("Option 1 :- To Add a file in the existing Directory");
                        System.out.println("Option 2 :- To Delete a file from the existing Directory. ");
                        System.out.println("Option 3 :- To Search a user specified file from the Directory");
                        System.out.println("Option 4 :- Back to the previous menu");
                        System.out.println("Option 5 :- Terminate The Program");


                        int choice2 = scan.nextInt();

                        switch (choice2) {
                            case 1:
                               
                                System.out.println("Enter a file name you want");
                                String name = scan.next();
                                if(new File(folder,name).exists()){
                                    System.out.println("file already exist");
                                }else {
                                    File folder1 = new File(folder, name);
                                    folder1.mkdir();
                                    if (new File(folder, name).exists()) {
                                        System.out.println("file added successfully");
                                    }
                                }

                                break;


                            case 2:
                                System.out.println("Enter a file name");
                                String name1 = scan.next();
                                boolean folder2 = new File(folder, name1).exists();
                                System.out.println(folder2);
                                if (folder2 == true) {
                                    File folder3 = new File(folder, name1);
                                    folder3.delete();
                                    System.out.println("File successfully deleted");
                                } else {
                                    System.out.println("file does not exist");
                                }
                              
                                break;


                            case 3:
                                System.out.println("Enter a keyword to search");
                                String search = scan.next();

                                File arr1[] = folder.listFiles();
                                for(int a=0;a<arr1.length;a++){
                                    if(arr1[a].getName().startsWith(search)){
                                        System.out.println(arr1[a]);
                                    }else{
                                        System.out.println("No file found");
                                    }
                                }
                                break;

                            case 4:

                                temp = false;
                                break;

                            case 5:

                                System.out.println("Program Terminated Successfully");
                                System.exit(0);
                            default:
                                System.out.println("Input correct value and retry");

                        }

                    }
                    break;

                case 3:
                    System.out.println("Program Terminated Successfully");
                    System.exit(0);

                default:
                    System.out.println("Input correct value and retry");
                    break;

            }
        }
    }


}
