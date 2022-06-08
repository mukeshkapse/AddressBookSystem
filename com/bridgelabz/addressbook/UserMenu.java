package com.bridgelabz.addressbook;

public class UserMenu {
    Scanner sc = new Scanner(System.in);

    public int showMainMenu() {
        System.out.println("Select \n 1.Add Contact \n 2.Edit Contact \n 3.Delete Contact");
        int choice = sc.nextInt();
        return choice;

}
