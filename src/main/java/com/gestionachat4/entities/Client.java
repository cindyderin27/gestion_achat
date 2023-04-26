/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionachat4.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Roma
 */
@Entity
@Table(name = "client")
@NamedQueries({
    @NamedQuery(name = "Client.findAll", query = "SELECT c FROM Client c"),
    @NamedQuery(name = "Client.findByCodeclient", query = "SELECT c FROM Client c WHERE c.codeclient = :codeclient"),
    @NamedQuery(name = "Client.findByNom", query = "SELECT c FROM Client c WHERE c.nom = :nom"),
    @NamedQuery(name = "Client.findByEmail", query = "SELECT c FROM Client c WHERE c.email = :email"),
    @NamedQuery(name = "Client.findBySexe", query = "SELECT c FROM Client c WHERE c.sexe = :sexe"),
    @NamedQuery(name = "Client.findByLogin", query = "SELECT c FROM Client c WHERE c.login = :login"),
    @NamedQuery(name = "Client.findByPassword", query = "SELECT c FROM Client c WHERE c.password = :password"),
    @NamedQuery(name = "Client.findByDatenaiss", query = "SELECT c FROM Client c WHERE c.datenaiss = :datenaiss")})
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codeclient")
    private Short codeclient;
    @Basic(optional = false)
    @Column(name = "nom")
    private String nom;
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "sexe")
    private String sexe;
    @Basic(optional = false)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Column(name = "datenaiss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datenaiss;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
    private List<Acheter> acheterList;

    public Client() {
    }

    public Client(Short codeclient) {
        this.codeclient = codeclient;
    }

    public Client(String nom, String sexe, String login, String password) {
        this.codeclient = codeclient;
        this.nom = nom;
        this.sexe = sexe;
        this.login = login;
        this.password = password;
    }

    public Short getCodeclient() {
        return codeclient;
    }

    public void setCodeclient(Short codeclient) {
        this.codeclient = codeclient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDatenaiss() {
        return datenaiss;
    }

    public void setDatenaiss(Date datenaiss) {
        this.datenaiss = datenaiss;
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
        hash += (codeclient != null ? codeclient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.codeclient == null && other.codeclient != null) || (this.codeclient != null && !this.codeclient.equals(other.codeclient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "generatecode.Client[ codeclient=" + codeclient + " nom "  + nom + " login " + login + " ]";
    }
    
}
