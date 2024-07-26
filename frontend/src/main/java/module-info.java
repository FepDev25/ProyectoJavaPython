module org.cultodeportivo.frontend {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.cultodeportivo.frontend to javafx.fxml;
    exports org.cultodeportivo.frontend;
}