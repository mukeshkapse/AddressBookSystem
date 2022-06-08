package com.bridgelabz.addressbook;

public class AddressMain {
    public void handleUserSelection() {
        ContactControler contactController = new ContactControler();
        UserMenu userInterface = new UserMenu();
        int x = 1;
        do {
            int choice = userInterface.showMainMenu();
            switch (choice) {
                case 1:
                    contactController.addNewContact();
                    break;
                case 2:
                    contactController.editByName(ScannerUtil.getString("Enter contact name to edit"));
                    break;
                case 3:
                    contactController.deleteContact(ScannerUtil.getString("Enter contact name to delete"));
                    break;
                default:
                    break;
            }
            x = ScannerUtil.getInt("Do you want to continue...press 1");
        } while (x == 1);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressMain main = new AddressMain();
        main.handleUserSelection();

        public void handleUserSelection ( int choice){
            ContactControler contactController = new ContactControler();
            switch (choice) {
                case 1:
                    contactController.addNewContact();
                    break;
            }
        }

        public static void main (String[]args){
            System.out.println("Welcome to Address Book Program");
        }
    }
}