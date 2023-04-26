/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionachat4.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Roma
 */
@Entity
@Table(name = "acheter")
@NamedQueries({
    @NamedQuery(name = "Acheter.findAll", query = "SELECT a FROM Acheter a"),
    @NamedQuery(name = "Acheter.findByCodeclient", query = "SELECT a FROM Acheter a WHERE a.acheterPK.codeclient = :codeclient"),
    @NamedQuery(name = "Acheter.findByCodeproduit", query = "SELECT a FROM Acheter a WHERE a.acheterPK.codeproduit = :codeproduit"),
    @NamedQuery(name = "Acheter.findByCodeachat", query = "SELECT a FROM Acheter a WHERE a.acheterPK.codeachat = :codeachat"),
    @NamedQuery(name = "Acheter.findByQte", query = "SELECT a FROM Acheter a WHERE a.qte = :qte"),
    @NamedQuery(name = "Acheter.findByDateachat", query = "SELECT a FROM Acheter a WHERE a.dateachat = :dateachat")})
public class Acheter implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AcheterPK acheterPK;
    @Basic(optional = false)
    @Column(name = "qte")
    private int qte;
    @Basic(optional = false)
    @Column(name = "dateachat")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateachat;
    @JoinColumn(name = "codeclient", referencedColumnName = "codeclient", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Client client;
    @JoinColumn(name = "codeproduit", referencedColumnName = "codeproduit", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Produit produit;

    public Acheter() {
    }

    public Acheter(AcheterPK acheterPK) {
        this.acheterPK = acheterPK;
    }

    public Acheter(AcheterPK acheterPK, int qte, Date dateachat) {
        this.acheterPK = acheterPK;
        this.qte = qte;
        this.dateachat = dateachat;
    }

    public Acheter(short codeclient, short codeproduit, int codeachat) {
        this.acheterPK = new AcheterPK(codeclient, codeproduit, codeachat);
    }

    public AcheterPK getAcheterPK() {
        return acheterPK;
    }

    public void setAcheterPK(AcheterPK acheterPK) {
        this.acheterPK = acheterPK;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public Date getDateachat() {
        return dateachat;
    }

    public void setDateachat(Date dateachat) {
        this.dateachat = dateachat;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acheterPK != null ? acheterPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Acheter)) {
            return false;
        }
        Acheter other = (Acheter) object;
        if ((this.acheterPK == null && other.acheterPK != null) || (this.acheterPK != null && !this.acheterPK.equals(other.acheterPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "generatecode.Acheter[ acheterPK=" + acheterPK + " ]";
    }
    
}
