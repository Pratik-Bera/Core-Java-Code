class BankAccount{

    // Thats are Static fields. cause they are same for all account Holder.
    // so they will create when instance are created. they share same memory for all instaince.
    static String bankName;
    static String branchName;
    static String ifscCode;

    // They are non-Static fields. cause they aren't same for all account Holder. THey need to initialize.
    String accountNumber;
    String accountHolderName;
    String address;
    double balance;
}