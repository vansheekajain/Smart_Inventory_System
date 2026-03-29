package com.inventory.ui;

import javax.swing.*;
import java.awt.*;

import com.inventory.controller.OrderController;
import com.inventory.model.Order;

public class OrderPanel extends JFrame {
    private JTextField productIdField, quantityField;

    public OrderPanel() {
        setTitle("Order Management");
        setSize(400, 250);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        panel.add(new JLabel("Product ID:"));
        productIdField = new JTextField();
        panel.add(productIdField);

        panel.add(new JLabel("Quantity:"));
        quantityField = new JTextField();
        panel.add(quantityField);

        JButton orderBtn = new JButton("Place Order");
        panel.add(new JLabel());
        panel.add(orderBtn);

        add(panel);
        setVisible(true);

        orderBtn.addActionListener(e -> placeOrder());
    }

    private void placeOrder() {
        try {
            int productId = Integer.parseInt(productIdField.getText().trim());
            int quantity = Integer.parseInt(quantityField.getText().trim());

            if (quantity <= 0) {
                throw new Exception("Quantity must be greater than 0!");
            }

            Order order = new Order();
            order.setProductId(productId);
            order.setQuantity(quantity);

            new OrderController().placeOrder(order);

            JOptionPane.showMessageDialog(this, "Order Placed Successfully!");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid number format!", "Error", JOptionPane.ERROR_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
