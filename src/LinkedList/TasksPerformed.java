package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class TasksPerformed {
    Scanner scanner = new Scanner(System.in);
    LinkedList<String> linkedList = new LinkedList<>();

    public void addContact(newLL linkedList1) {
        System.out.println(" Add new contact in contactlist: \n" +
                "enter the name of the Person");
        System.out.println("First Name : ");
        String firstName = scanner.nextLine().trim();
        while (true) {
            if (firstName.matches("[A-Za-z]+")) {
                break;
            } else {
                System.out.println("enter correct name");
            }
            firstName = scanner.nextLine().trim();
        }
        System.out.println("Last Name : ");
        String lastName = scanner.nextLine().trim();
        while (true) {
            if (lastName.matches("[A-Za-z]+")) {
                break;
            } else {
                System.out.println("enter correct name");
            }
            lastName = scanner.nextLine().trim();
        }
        System.out.println("Contact Number:");
        while (true) {
            String contact = scanner.nextLine().trim();
            if (contact.matches("[0-9]{10}")) {
                linkedList.add(contact);
                break;
            }
        }
        while (true) {
            System.out.println("Would you like to add another contact number? (y/n):");
            char choice = scanner.next().charAt(0);
            if (choice == 'y') {
                System.out.println("Conatct Number : ");
                String contactNumber1 = scanner.nextLine().trim();
                while (true) {
                    if (contactNumber1.matches("[0-9]{10}")) {
                        linkedList.add(contactNumber1);
                        break;
                    } else {
                        System.out.println("Add correct number");
                    }
                }
            } else {
                break;
            }
        }
        System.out.println("Enter your email address:");
        scanner.nextLine();
        while (true) {
            String temp = scanner.nextLine();
            if (temp.matches("^[a-z]+[0-9]*@[a-z]+\\.[a-z]+$")) {
                linkedList1.addLast(new Person(firstName, lastName, linkedList, temp));
                break;
            } else {
                System.out.println("invalid email address ! try again");
            }
        }
    }

    public void viewcontact(newLL linkedList1) {
        System.out.println("contacts available");
        if (!linkedList1.isEmpty()) {
            linkedList1.display();
        } else {
            System.out.println("no contact found!!!!");
        }
    }

    public void deleteContact(newLL linkedList1) {
        if (!linkedList1.isEmpty()) {
            System.out.println("all the contact:" +
                    " to delete the contact.");
            linkedList1.displayOne();
            int choice = scanner.nextInt();
            scanner.nextLine();
            linkedList1.deleteNode(choice);
            linkedList1.displayOne();
            System.out.println("deleted");
        } else {
            System.out.println("No Contacts && add contact before deleting it");
        }
    }

    public void searchContact(newLL linkedList1) {
        System.out.println("search via first names: ");
        String firstName = scanner.nextLine().trim();
        if (linkedList1.indexOf(firstName) >= 0) {
            System.out.println("Match found");
            linkedList1.getNode(linkedList1.indexOf(firstName));
        } else {
            System.out.println("No match found");
        }
    }
}
