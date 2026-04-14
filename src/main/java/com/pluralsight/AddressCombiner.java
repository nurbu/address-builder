package com.pluralsight;

import java.util.Scanner;

public class AddressCombiner {
    public static void main(String[] args) {
        // Combines Billing and Shipping address using StringBuilder

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the following information: ");
        System.out.print("Full name: ");
        String fullName = scanner.nextLine();

        // Billing Address

        System.out.print("\nBilling Street: ");
        String billingStreet = scanner.nextLine();
        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();
        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();
        System.out.print("Billing Zip Code: ");
        String billingZipCode = scanner.nextLine();

        // Shipping Address

        System.out.print("\nShipping Street: ");
        String shippingStreet = scanner.nextLine();
        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();
        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();
        System.out.print("Shipping Zip Code: ");
        String shippingZipCode = scanner.nextLine();

        //Combined Billing city,state and zip code together

        StringBuilder billingCityStateZip = new StringBuilder(billingCity + ", ");
        billingCityStateZip.append(billingState + " ").append(billingZipCode);

        //Combined Shipping city,state and zip code together

        StringBuilder shippingCityStateZip = new StringBuilder(shippingCity + ", ");
        shippingCityStateZip.append(shippingState + " ").append(shippingZipCode);

        // Output

        System.out.println(fullName);
        System.out.println("\nBilling Street:");
        System.out.println(billingStreet);
        System.out.println(billingCityStateZip);
        System.out.println("\nShipping City:");
        System.out.println(shippingStreet);
        System.out.println(shippingCityStateZip);
    }
}
