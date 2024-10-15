module org.example.myjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.myjavafx to javafx.fxml;
    exports org.example.myjavafx;
}