package gruppo59.desktop.Controller;

import gruppo59.desktop.ApplicationClass.GestioneVisitatori;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class FXMLGestioneVisitatoriController {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btniscritti;

    @FXML
    private Button btnsegnalazioni;

    @FXML
    private Button btncancellazioni;

    @FXML
    void clickRichiestaCancellazione(ActionEvent event) {
        GestioneVisitatori.clickRichiesteCancellazione();
    }

    @FXML
    void clickIscritti(ActionEvent event) {
        GestioneVisitatori.clickiscritti();
    }

    @FXML
    void clickSegnalazioni(ActionEvent event) {
        GestioneVisitatori.clicksegnalazioni();

    }


}
