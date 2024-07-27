package org.cultodeportivo.frontend;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button fetchButton;

    @FXML
    protected void onHelloButtonClick() {
        fetchButton.setOnAction(event -> {
            ApiClient.getNumeroAleatorio().thenAccept(response -> {
                Platform.runLater(() -> {
                    welcomeText.setText("Random number from api: " + response.getString( "random_number"));
                });
            }).exceptionally(ex -> {
                ex.printStackTrace();
                return null;
            });
        });
    }
}