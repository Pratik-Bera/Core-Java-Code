class Bank {
    public static void main(String[] args) {

        // Initializing Static fields by accessing them using there class name common to
        // all objects.
        BankAccount.bankName = "PAYTM";
        BankAccount.branchName = "Noida";
        BankAccount.ifscCode = "PAYTM1234567";

        // Creating the Objects for the BankAccount;
        BankAccount user1 = new BankAccount();
        BankAccount user2 = new BankAccount();

        // Initializing Non-Static fields by accessing them using Object names which
        // isn't common to all objects.
        // user1
        user1.accountHolderName = "Pratik Bera";
        user1.accountNumber = "11111111";
        user1.address = "Bajkul";
        user1.balance = 20000000;
        //user2
        user2.accountHolderName = "Alok Bera";
        user2.accountNumber = "22222222";
        user2.address = "Kolkata";
        user2.balance = 5000000;



        // Displaing the details;
        System.out.println("Details for user1:" + user1.accountHolderName);
        System.out.println("Bank Name : " + user1.bankName);
        System.out.println("Branch Name : " + user1.branchName);
        System.out.println("IFSC Code : " + user1.ifscCode);
        System.out.println("Account number : " + user1.accountNumber);
        System.out.println("Address : " + user1.address);
        System.out.println("Your Balance : " + user1.balance);

        System.out.println("Details for user2:" + user2.accountHolderName);
        System.out.println("Bank Name : " + user2.bankName);
        System.out.println("Branch Name : " + user2.branchName);
        System.out.println("IFSC Code : " + user2.ifscCode);
        System.out.println("Account number : " + user2.accountNumber);
        System.out.println("Address : " + user2.address);
        System.out.println("Your Balance : " + user2.balance);

    }

}

