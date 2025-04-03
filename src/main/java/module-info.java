module com.example.minisudokutest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.minisudokutest to javafx.fxml;
    exports com.example.minisudokutest;
}