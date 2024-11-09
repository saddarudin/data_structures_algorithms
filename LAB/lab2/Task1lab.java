package lab2;
import java.util.Objects;
import java.util.Scanner;
public class Task1lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContactApp app = new ContactApp();
        String[][] myContacts={{"Saddar","03480331849"},{"Kelash","03001280147"},{"Mehar Ali","03063488379"},{"Shahid Hussain","03248239454"},{"Zohaib","03151345921"}};
        String choice;
        do {
            System.out.println("***Contact App***\n Created By \"SDB\"\n\n");
            System.out.println("1->Display All Contacts");
            System.out.println("2->Search a contact");
            System.out.println("3->Add a new contact");
            System.out.println("4->Update the contact");
            System.out.println("5->Delete any contact");
            System.out.println("0->To exit");
            choice = scan.nextLine();
            for(int i=0;i<30;i++) System.out.println();
            switch (choice) {
                case "1" -> {
                    app.displayAllContacts(myContacts);
                    System.out.print("Press any key");
                    String temp=scan.nextLine();
                }
                case "2" -> {
                    System.out.print("Enter name or number to search: ");
                    String target=scan.nextLine();
                    int index= app.searchContact(myContacts,target);
                    if(index>=0) System.out.println("Name: "+myContacts[index][0]+"\nNumber: "+myContacts[index][1]);
                    else System.out.println("Contact not found!");
                    System.out.print("Press any key");
                    String temp=scan.nextLine();
                }
                case "3" -> {
                    System.out.print("Enter number to add: ");
                    String number = scan.nextLine();
                    System.out.print("Enter name to save this contact: ");
                    String name = scan.nextLine();
                    System.out.print("Enter position: ");
                    String position=scan.nextLine();
                    myContacts=app.addNewContact(myContacts,name, number,Integer.parseInt(position));
                    System.out.print("Press any key");
                    String temp=scan.nextLine();
                }
                case "4" -> {
                    System.out.println("1->Update Name\n2->Update Number");
                    String selection=scan.nextLine();
                    if(selection.equals("1")){
                        System.out.print("Enter name to be updated: ");
                        String name=scan.nextLine();
                        System.out.print("Enter new name: ");
                        String newName=scan.nextLine();
                        app.updateContactName(myContacts,name,newName);
                    }else if(selection.equals("2")){
                        System.out.print("Enter number to be updated: ");
                        String number=scan.nextLine();
                        System.out.print("Enter new number: ");
                        String newNumber=scan.nextLine();
                        app.updateContactNumber(myContacts,number,newNumber);
                    }
                    System.out.print("Press any key");
                    String temp = scan.nextLine();
                }
                case "5" -> {
                    System.out.print("Enter name or number to delete the contact: ");
                    String name = scan.nextLine();
                    myContacts=app.deleteContact(myContacts,name);
                    System.out.print("Press any key");
                    String temp = scan.nextLine();
                }
            }
            for (int i=0;i<50;i++) System.out.println();
        }while (!Objects.equals(choice, "0"));
    }
}
