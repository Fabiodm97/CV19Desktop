package gruppo59.desktop.Model;

import javafx.beans.property.SimpleStringProperty;

public class Iscritti {
    private SimpleStringProperty Nome;
    private SimpleStringProperty Cognome;
    private SimpleStringProperty Username;
    private SimpleStringProperty Status;

    public Iscritti(String nome,String cognome,String username,String status){
        Nome = new SimpleStringProperty(nome);
        Cognome = new SimpleStringProperty(cognome);
        Username = new SimpleStringProperty(username);
        Status = new SimpleStringProperty(status);
    }

    public String getStatus() {
        return Status.get();
    }

    public SimpleStringProperty statusProperty() {
        return Status;
    }

    public void setStatus(String status) {
        this.Status.set(status);
    }

    public String getNome() {
        return Nome.get();
    }

    public SimpleStringProperty nomeProperty() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome.set(nome);
    }

    public String getCognome() {
        return Cognome.get();
    }

    public SimpleStringProperty cognomeProperty() {
        return Cognome;
    }

    public void setCognome(String cognome) {
        this.Cognome.set(cognome);
    }

    public String getNickname() {
        return Username.get();
    }

    public SimpleStringProperty nicknameProperty() {
        return Username;
    }

    public void setNickname(String nickname) {
        this.Username.set(nickname);
    }
}
