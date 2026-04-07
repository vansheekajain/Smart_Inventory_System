# Smart_Inventory_System  
📦 SmartStock — Smart Inventory & Supply Chain Management System 
 
A fully-featured Java desktop application for managing inventory, orders, suppliers, and shipments. 
 
Built as an academic project to demonstrate core Java concepts including OOP, Swing (JFC), AWT, JDBC, JavaBeans, and Event-Based Programming. 
 
--- 
 
## 🎓 Java Concepts Demonstrated 
 
| Concept | Implementation | 
|--------|--------------| 
| Encapsulation | Model classes use private fields with getters/setters | 
| Inheritance | UI components extend JPanel, dialogs extend JDialog | 
| Polymorphism | Controllers implement ActionListener differently | 
| Abstraction | Service layer hides business logic | 
| Composition | Controllers → Services → DAOs | 
| JavaBeans | Serializable classes with no-arg constructors | 
| JDBC | DB connection, PreparedStatement, ResultSet | 
| JFC/Swing | JFrame, JTable, JDialog, JScrollPane | 
| AWT | Graphics2D, Layouts, Colors, Fonts | 
| Event-Based Tech | ActionListener, MouseListener, KeyAdapter | 
--- 
 
## 🏗️ Project Architecture 
 
| Layer | Responsibility | 
|--------------------|---------------| 
| Presentation Layer | UI using Swing & AWT | 
| Controller Layer   | Handles events (ActionListener) | 
| Service Layer      | Business logic | 
| DAO Layer          | Database access using JDBC | 
| Model Layer        | JavaBeans (data representation) | 
| Database           | MySQL storage | 
---  
📁 Project Structure 
 
Smart_Inventory_System/ 
│ 
├── src/ 
│   └── com/ 
│       └── inventory/ 
│ 
│           ├── model/ # JavaBeans (Encapsulation) 
│           │ ├── ProductBean.java 
│           │ ├── OrderBean.java 
│           │ ├── SupplierBean.java 
│           │ ├── ShipmentBean.java 
│           │ └── UserBean.java 
│ 
│           ├── backend/ # DAO Layer (JDBC) 
│           │ ├── DBConnection.java 
│           │ ├── ProductDAO.java 
│           │ ├── OrderDAO.java 
│           │ ├── SupplierDAO.java 
│           │ ├── ShipmentDAO.java 
│           │ └── UserDAO.java 
│ 
│           ├── service/ # Business Logic 
│           │ ├── InventoryService.java 
│           │ ├── OrderService.java 
│           │ └── SupplierService.java 
│ 
│           ├── controller/ # Event Handling 
│           │ ├── ProductController.java 
│           │ ├── OrderController.java 
│           │ └── SupplierController.java 
│ 
│           ├── ui/ 
│           │   ├── theme/ # Colors & Fonts 
│           │   │   ├── AppColors.java 
│           │   │   ├── AppFonts.java 
│           │   │   └── UIFactory.java 
│           │   │ 
│           │   ├── panels/ # Reusable Panels 
│           │   │   ├── SidebarPanel.java 
│           │   │   ├── HeaderPanel.java 
│           │   │   ├── StatCardPanel.java 
│           │   │   └── AlertPanel.java 
│           │   │ 
│           │   ├── dialogs/ # Popup Forms 
│           │   │   ├── AddProductDialog.java 
│           │   │   ├── AddOrderDialog.java 
│           │   │   ├── AddSupplierDialog.java 
│           │   │   └── ConfirmDialog.java 
│           │   │ 
│           │   └── frames/    # Main Screens 
│           │       ├── LoginFrame.java 
│           │       ├── MainFrame.java 
│           │       ├── DashboardFrame.java 
│           │       ├── InventoryFrame.java 
│           │       ├── OrderFrame.java 
│           │       ├── SupplierFrame.java 
│           │       ├── ShipmentFrame.java 
│           │       └── ReportFrame.java 
│ 
│           └── main/ 
│               └── MainApp.java  # Entry Point 
│ 
├── database/ 
│   └── schema.sql                # Database Schema 
│ 
├── lib/ 
│   └── mysql-connector-j-8.x.jar # JDBC Driver 
 
--- 
 
🚀 Getting Started 
 
Prerequisites 
 
-	Java JDK 8+ 
-	MySQL Server / XAMPP 
-	MySQL Connector/J 
 
--- 
 
Setup Steps 
 
1.	Setup Database 
 
Run in MySQL: 
source path/to/database/schema.sql; 
 
--- 
 
2.	Configure Database 
 
Edit: 
src/com/inventory/backend/DBConnection.java 
 
Update: private static final String URL = "jdbc:mysql://localhost:3306/smart_inventory"; private static final String USERNAME = "root"; private static final String PASSWORD = "your_password"; 
 
--- 
 
3.	Add JDBC Driver 
 
Place the JAR file inside: 
lib/mysql-connector-j-8.x.jar 
 
--- 
 
4.	Compile 
 
javac -cp "lib/mysql-connector-j-8.x.jar" -d . $(find src -name "*.java") 
 
--- 
 
5.	Run 
 
java -cp ".:lib/mysql-connector-j-8.x.jar" com.inventory.main.MainApp 
 
--- 
 
## 🔐 Demo Login 
 
| Field    | Value    |  
|----------|----------| 
| Username | admin    | 
| Password | admin123 | 
Note: Works without database using sample data. 
 
--- 
 
✨ Features 
 
Dashboard 
 
-	KPI cards (Products, Orders, Revenue) 
-	AWT charts 
-	Low stock alerts 
-	Recent orders table 
 
Inventory Management 
 
-	Searchable JTable 
-	Add/Edit/Delete products 
-	Stock indicators 
-	JDBC persistence 
 
Order Management 
 
-	Status filters 
-	Create & cancel orders 
-	Order detail popup 
 
Supplier Management 
 
-	Add/search/delete suppliers 
-	Email & phone validation 
 
Shipment Tracking 
 
-	Track shipments with status 
-	Linked with orders 
 
Reports & Analytics 
 
-	Revenue trends 
-	Category charts 
-	Quick reports 
 
--- 
 
## 🗄️ Database Tables 
 
| Table Name | Description | 
|------------|-------------| 
| Users      | Stores login credentials and user roles | 
| Products   | Contains product details and stock levels | 
| Suppliers  | Stores supplier information and contact details |
| Orders     | Manages purchase orders linked to products and   suppliers | 
| Shipments  | Tracks shipment details and delivery status | 
 
--- 
 
## 🛠️ Tech Stack 
 
| Category         | Technology | 
|------------------|-----------| 
| Language         | Java 8+ | 
| GUI Framework    | Swing (JFC) + AWT | 
| Database         | MySQL 8.x | 
| Database Access  | JDBC | 
| Driver           | MySQL Connector/J | 
| Architecture     | MVC | 
| Build Tool       | javac | 
 
--- 
 
## 👨‍💻 Team 

| Name              | GitHub                         | Contribution |
|-------------------|--------------------------------|--------------|
| Vansheeka Jain    | [@vansheekajain](https://github.com/vansheekajain) | Designed and developed the user interface screens of the project, including dashboard, inventory, supplier, order, shipment, and report modules. |
| Avnish Singh      | [@Avnish2005Singh](https://github.com/Avnish2005Singh) | Implemented the controller and service layer for handling application flow, event processing, and core business logic. |
| Ishita Gautam     | [@ishitagautam298-droid](https://github.com/ishitagautam298-droid) | Developed the DAO layer and database connection using JDBC and MySQL, enabling backend data storage and retrieval operations. |
| Abhay Singh       | [@ABHAY240704](https://github.com/ABHAY240704) | Contributed to project documentation, including preparation of the README content and support in organizing technical details of the project. |
| Jit Bhattacharya  | [@jit23bce11480-dot](https://github.com/jit23bce11480-dot) | Contributed to formatting, compiling, and preparing the final project report and submission materials. |

---
 
📄 License 
 
This project is an academic submission. 
All code is written for educational purposes. 
 
--- 
 
⭐ Support 
 
If you like this project, give it a star ⭐ on GitHub! 
