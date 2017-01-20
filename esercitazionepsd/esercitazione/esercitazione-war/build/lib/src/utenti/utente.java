/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utenti;

/**
 *
 * @author Daniele
 */
public class utente {
    private String nome;
    private String cognome;
    private String sesso;
    private String indirizzo;
    private String mail;
    private String codice_fiscale;
    private String numero_carta_d_identita;
    private String numero_patente;

    public utente(String nome, String cognome, String sesso, String indirizzo, String mail, String codice_fiscale, String numero_carta_d_identita, String numero_patente) {
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso;
        this.indirizzo = indirizzo;
        this.mail = mail;
        this.codice_fiscale = codice_fiscale;
        this.numero_carta_d_identita = numero_carta_d_identita;
        this.numero_patente = numero_patente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCodice_fiscale() {
        return codice_fiscale;
    }

    public void setCodice_fiscale(String codice_fiscale) {
        this.codice_fiscale = codice_fiscale;
    }

    public String getNumero_carta_d_identita() {
        return numero_carta_d_identita;
    }

    public void setNumero_carta_d_identita(String numero_carta_d_identita) {
        this.numero_carta_d_identita = numero_carta_d_identita;
    }

    public String getNumero_patente() {
        return numero_patente;
    }

    public void setNumero_patente(String numero_patente) {
        this.numero_patente = numero_patente;
    }

    @Override
    public String toString() {
        return "utente{" + "nome=" + nome + ", cognome=" + cognome + ", sesso=" + sesso + ", indirizzo=" + indirizzo + ", mail=" + mail + ", codice_fiscale=" + codice_fiscale + ", numero_carta_d_identita=" + numero_carta_d_identita + ", numero_patente=" + numero_patente + '}';
    }
    
    
}
