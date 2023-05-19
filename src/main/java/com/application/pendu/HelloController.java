package com.application.pendu;

import com.application.pendu.modele.ModelePendu1;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
private ModelePendu1 modele;
    @FXML
    private VBox boite;

    @FXML
    private ImageView image;

    @FXML
    private TextField lettre;

    @FXML
    private Label motAffiche;

    @FXML
    void NouveauMot(ActionEvent event) {
        this.modele.reset();
        URL urlIm=getClass().getResource("pendu"+ this.modele.getNbErreur() +".gif");
        Image im= new Image(String.valueOf(urlIm));
        this.image.setImage(im);
        this.image.setVisible(true);
        this.motAffiche.setText(motEnCours());
    }

    public String motEnCours(){
        String s = "";
        for(int i=0; i<modele.getMotAtrouver().length(); i++){
            if(Character.isUpperCase(modele.getMotAtrouver().charAt(i))){
                s=s+modele.getMotAtrouver().charAt(i);
            }
            else {
                s = s + '_';
            }
        }
        return s;
    }

    @FXML
    void essayerLettre(ActionEvent event) {
        if(!(modele.perdu() || modele.gagne())) {
            String s = this.lettre.getText();
            boolean ok = this.modele.essayerLette(s);
            if (ok) {
                this.motAffiche.setText(motEnCours());
            } else {
                URL urlIm = getClass().getResource("pendu" + this.modele.getNbErreur() + ".gif");
                Image im = new Image(String.valueOf(urlIm));
                this.image.setImage(im);
                this.image.setVisible(true);
            }
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        modele= new ModelePendu1();
    }
}
