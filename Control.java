import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Control {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Label lblCodigo;

    @FXML
    private Label lblDatosPersonales;

    @FXML
    private Label lblMail;

    @FXML
    private Label lblNombre;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtMail;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextArea txtResultados;
    
    //crear un objeto del modelo (Persona)
    private Persona persona;

    @FXML
    void guardarDatos(ActionEvent event) {
        
            txtResultados.setText("se guardo el nombre: " + txtNombre.toString() + "con un codigo: "
            + txtCodigo.toString() + "y un email: " + txtMail.toString());
    }

    @FXML
    void limpiarDatos(ActionEvent event) {

    }
    
    
    public void startUi(){
        String nombre = persona.getNombre(); 
        String mail = persona.getMail();
        String codigo = persona.getCodigo();
        
        txtNombre.setText(nombre);
        txtCodigo.setText(codigo);
        txtMail.setText(mail);
        
    }

    @FXML
    void initialize() {
        assert btnGuardar != null : "fx:id=\"btnGuardar\" was not injected: check your FXML file 'Untitled'.";
        assert btnLimpiar != null : "fx:id=\"btnLimpiar\" was not injected: check your FXML file 'Untitled'.";
        assert lblCodigo != null : "fx:id=\"lblCodigo\" was not injected: check your FXML file 'Untitled'.";
        assert lblDatosPersonales != null : "fx:id=\"lblDatosPersonales\" was not injected: check your FXML file 'Untitled'.";
        assert lblMail != null : "fx:id=\"lblMail\" was not injected: check your FXML file 'Untitled'.";
        assert lblNombre != null : "fx:id=\"lblNombre\" was not injected: check your FXML file 'Untitled'.";
        assert txtCodigo != null : "fx:id=\"txtCodigo\" was not injected: check your FXML file 'Untitled'.";
        assert txtMail != null : "fx:id=\"txtMail\" was not injected: check your FXML file 'Untitled'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'Untitled'.";
        assert txtResultados != null : "fx:id=\"txtResultados\" was not injected: check your FXML file 'Untitled'.";
        
        
        Persona persona = new Persona();
        
    }

}