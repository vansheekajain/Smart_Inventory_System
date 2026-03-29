package com.inventory.ui;

import javax.swing.*;
import java.awt.*;

public class ReportPanel extends JFrame {

    public ReportPanel() {
        setTitle("Reports");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JTextArea reportArea = new JTextArea();

        try {
            reportArea.setText("Reports will be shown here...");
        } catch (Exception e) {
            reportArea.setText("Error loading reports!");
        }

        add(new JScrollPane(reportArea), BorderLayout.CENTER);
        setVisible(true);
    }
}
