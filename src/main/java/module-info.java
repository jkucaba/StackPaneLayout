module com.jakubku.stackpane.stackpanelayut {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jakubku.stackpane.stackpanelayut to javafx.fxml;
    exports com.jakubku.stackpane.stackpanelayut;
}