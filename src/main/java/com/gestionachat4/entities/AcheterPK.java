/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionachat4.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Roma
 */
@Embeddable
public class AcheterPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "codeclient")
    private short codeclient;
    @Basic(optional = false)
    @Column(name = "codeproduit")
    private short codeproduit;
    @Basic(optional = false)
    @Column(name = "codeachat")
    private int codeachat;

    public AcheterPK() {
    }

    public AcheterPK(short codeclient, short codeproduit, int codeachat) {
        this.codeclient = codeclient;
        this.codeproduit = codeproduit;
        this.codeachat = codeachat;
    }

    public short getCodeclient() {
        return codeclient;
    }

    public void setCodeclient(short codeclient) {
        this.codeclient = codeclient;
    }

    public short getCodeproduit() {
        return codeproduit;
    }

    public void setCodeproduit(short codeproduit) {
        this.codeproduit = codeproduit;
    }

    public int getCodeachat() {
        return codeachat;
    }

    public void setCodeachat(int codeachat) {
        this.codeachat = codeachat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codeclient;
        hash += (int) codeproduit;
        hash += (int) codeachat;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcheterPK)) {
            return false;
        }
        AcheterPK other = (AcheterPK) object;
        if (this.codeclient != other.codeclient) {
            return false;
        }
        if (this.codeproduit != other.codeproduit) {
            return false;
        }
        if (this.codeachat != other.codeachat) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "generatecode.AcheterPK[ codeclient=" + codeclient + ", codeproduit=" + codeproduit + ", codeachat=" + codeachat + " ]";
    }
    
}
