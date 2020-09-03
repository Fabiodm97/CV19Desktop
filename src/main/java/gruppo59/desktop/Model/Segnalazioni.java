package gruppo59.desktop.Model;

import javafx.beans.property.SimpleStringProperty;

public class Segnalazioni {

    private SimpleStringProperty Struttura;
    private SimpleStringProperty Testo;
    private SimpleStringProperty Username;

    public Segnalazioni(String username, String struttura, String testo) {
        Testo = new SimpleStringProperty(testo);
        Struttura = new SimpleStringProperty(struttura);
        Username = new SimpleStringProperty(username);
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if(o.getClass() != Segnalazioni.class) return false;
        Segnalazioni other = (Segnalazioni)o;

        return Username.get().equals(other.Username.get()) && Testo.get().equals(other.Testo.get()) && Struttura.get().equals(other.Struttura.get());

    }

    public String getStruttura() {
        return Struttura.get();
    }

    public SimpleStringProperty strutturaProperty() {
        return Struttura;
    }

    public void setStruttura(String struttura) {
        this.Struttura.set(struttura);
    }

    public String getTesto() {
        return Testo.get();
    }

    public SimpleStringProperty testoProperty() {
        return Testo;
    }

    public void setTesto(String testo) {
        this.Testo.set(testo);
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
