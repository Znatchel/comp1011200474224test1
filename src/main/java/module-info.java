module com.example.comp1011200474224test1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.comp1011200474224test1 to javafx.fxml;
    exports com.example.comp1011200474224test1;
}