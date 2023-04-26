/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionachat4.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Roma
 */
@Entity
@Table(name = "produit")
@NamedQueries({
    @NamedQuery(name = "Produit.findAll", query = "SELECT p FROM Produit p"),
    @NamedQuery(name = "Produit.findByCodeproduit", query = "SELECT p FROM Produit p WHERE p.codeproduit = :codeproduit"),
    @NamedQuery(name = "Produit.findByLabel", query = "SELECT p FROM Produit p WHERE p.label = :label"),
    @NamedQuery(name = "Produit.findByPu", query = "SELECT p FROM Produit p WHERE p.pu = :pu"),
    @NamedQuery(name = "Produit.findByQtestock", query = "SELECT p FROM Produit p WHERE p.qtestock = :qtestock"),
    @NamedQuery(name = "Produit.findByQteseuil", query = "SELECT p FROM Produit p WHERE p.qteseuil = :qteseuil")})
public class Produit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codeproduit")
    private Short codeproduit;
    @Basic(optional = false)
    @Column(name = "label")
    private String label;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "pu")
    private BigDecimal pu;
    @Basic(optional = false)
    @Column(name = "qtestock")
    private int qtestock;
    @Basic(optional = false)
    @Column(name = "qteseuil")
    private int qteseuil;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produit")
    private List<Acheter> acheterList;

    public Produit() {
    }

    public Produit(Short codeproduit) {
        this.codeproduit = codeproduit;
    }

    public Produit(Short codeproduit, String label, BigDecimal pu, int qtestock, int qteseuil) {
        this.codeproduit = codeproduit;
        this.label = label;
        this.pu = pu;
        this.qtestock = qtestock;
        this.qteseuil = qteseuil;
    }

    public Short getCodeproduit() {
        return codeproduit;
    }

    public void setCodeproduit(Short codeproduit) {
        this.codeproduit = codeproduit;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public BigDecimal getPu() {
        return pu;
    }

    public void setPu(BigDecimal pu) {
        this.pu = pu;
    }

    public int getQtestock() {
        return qtestock;
    }

    public void setQtestock(int qtestock) {
        this.qtestock = qtestock;
    }

    public int getQteseuil() {
        return qteseuil;
    }

    public void setQteseuil(int qteseuil) {
        this.qteseuil = qteseuil;
    }

    public List<Acheter> getAcheterList() {
        return acheterList;
    }

    public void setAcheterList(List<Acheter> acheterList) {
        this.acheterList = acheterList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeproduit != null ? codeproduit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.codeproduit == null && other.codeproduit != null) || (this.codeproduit != null && !this.codeproduit.equals(other.codeproduit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "generatecode.Produit[ codeproduit=" + codeproduit + " ]";
    }
    
}
