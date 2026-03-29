package com.inventory.ui;

import javax.swing.*;
import java.awt.*;

import com.inventory.controller.ProductController;
import com.inventory.model.Product;

public class ProductPanel extends JFrame {
    private JTextField nameField, quantityField;

    public ProductPanel() {
        setTitle("Product Management");
        setSize(400, 250);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        panel.add(new JLabel("Product Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Quantity:"));
        quantityField = new JTextField();
        panel.add(quantityField);

        JButton addBtn = new JButton("Add Product");
        panel.add(new JLabel());
        panel.add(addBtn);

        add(panel);
        setVisible(true);

        addBtn.addActionListener(e -> addProduct());
    }

    private void addProduct() {
        try {
            String name = nameField.getText().trim();
            String qtyText = quantityField.getText().trim();

            if (name.isEmpty() || qtyText.isEmpty()) {
                throw new Exception("All fields are required!");
            }

            int quantity = Integer.parseInt(qtyText);

            if (quantity < 0) {
                throw new Exception("Quantity cannot be negative!");
            }

            Product product = new Product();
            product.setName(name);
            product.setQuantity(quantity);

            ProductController controller = new ProductController();
            controller.addProduct(product);

            JOptionPane.showMessageDialog(this, "Product Added Successfully!");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Quantity must be a number!", "Error", JOptionPane.ERROR_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
