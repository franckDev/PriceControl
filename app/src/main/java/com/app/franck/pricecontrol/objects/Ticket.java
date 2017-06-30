package com.app.franck.pricecontrol.objects;

import java.util.Date;

/**
 * Created by Franck on 30/06/2017.
 */

public class Ticket {

    private int idTicket;
    private int numero;
    private String libelle;
    private float prix;
    private Date date;

    public Ticket(int idTicket,int numero, String libelle, float prix, Date date) {
        this.idTicket = idTicket;
        this.numero = numero;
        this.libelle = libelle;
        this.prix = prix;
        this.date = date;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public int getNumero() {

        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
