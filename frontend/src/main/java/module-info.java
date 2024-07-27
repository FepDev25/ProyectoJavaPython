module org.cultodeportivo.frontend {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires org.json;

    requires org.kordamp.bootstrapfx.core;

    opens org.cultodeportivo.frontend to javafx.fxml;
    exports org.cultodeportivo.frontend;
}