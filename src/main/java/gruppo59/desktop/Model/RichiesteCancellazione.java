package gruppo59.desktop.Model;

import javafx.beans.property.SimpleStringProperty;

public class RichiesteCancellazione  {

    private SimpleStringProperty Email;
    private SimpleStringProperty Motivazione;
    private SimpleStringProperty Username;

    public RichiesteCancellazione(String email, String motivazione, String username) {
        Email = new SimpleStringProperty(email);
        Motivazione =new SimpleStringProperty(motivazione);
        Username = new SimpleStringProperty(username);
    }

    public String getEmail() {
        return Email.get();
    }

    public SimpleStringProperty emailProperty() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email.set(email);
    }

    public String getMotivazione() {
        return Motivazione.get();
    }

    public SimpleStringProperty motivazioneProperty() {
        return Motivazione;
    }

    public void setMotivazione(String motivazione) {
        this.Motivazione.set(motivazione);
    }

    public String getUsername() {
        return Username.get();
    }

    public SimpleStringProperty usernameProperty() {
        return Username;
    }

    public void setUsername(String nickname) {
        this.Username.set(nickname);
    }
}
