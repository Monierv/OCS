package fr.unice.polytech.ocs.entity;

public class ReadRequest {

    private String lang;
    private String text;

    public ReadRequest() {
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
