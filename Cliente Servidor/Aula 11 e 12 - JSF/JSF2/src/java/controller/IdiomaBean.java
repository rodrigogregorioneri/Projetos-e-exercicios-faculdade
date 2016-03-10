package controller;

import java.util.Locale;
import javax.faces.context.FacesContext;

public class IdiomaBean {

    public void mudarIdioma(Locale locale) {
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.getViewRoot().setLocale(locale);
    }

    public String ingles() {
        Locale locale = new Locale("en", "US");
        mudarIdioma(locale);
        return null;
    }

    public String portugues() {
        Locale locale = new Locale("pt", "BR");
        mudarIdioma(locale);
        return null;
    }
}
