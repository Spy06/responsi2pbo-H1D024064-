package pert4;

public class UjiCustomer {
    public static void main(String[] args) {
        Customer customerBudi = new Customer("Budi Santoso", "CST-001", 500000);

        Member memberSiti = new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");
        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        System.out.println("Status: Customer Biasa");
        customerBudi.tampilkanInfo();
        System.out.println(); // Jarak baris

        System.out.println("Status: Member");
        memberSiti.tampilkanInfo();
    }
}