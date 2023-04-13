module com.example.teamcitytest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.teamcitytest to javafx.fxml;
    exports com.example.teamcitytest;
}