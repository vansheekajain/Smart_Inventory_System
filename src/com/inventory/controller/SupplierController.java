package com.inventory.controller;

import com.inventory.model.Supplier;

public class SupplierController {

    public void addSupplier(Supplier supplier) {
        try {
            if (supplier.getName() == null || supplier.getName().isEmpty()) {
                throw new Exception("Supplier name cannot be empty");
            }

            if (supplier.getContact() == null || supplier.getContact().isEmpty()) {
                throw new Exception("Contact cannot be empty");
            }

            // Dummy logic
            System.out.println("Supplier Added Successfully:");
            System.out.println("Name: " + supplier.getName());
            System.out.println("Contact: " + supplier.getContact());

        } catch (Exception e) {
            System.out.println("Supplier Error: " + e.getMessage());
        }
    }
}
