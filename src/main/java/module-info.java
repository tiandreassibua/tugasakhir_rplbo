module com.rentalmobil.rentalmobil {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rentalmobil.rentalmobil to javafx.fxml;
    exports com.rentalmobil.rentalmobil;
}