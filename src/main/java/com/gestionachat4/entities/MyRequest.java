package com.gestionachat4.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;

public class MyRequest {

	  private short codeclient ;
	  
	  private int codeachat ;
	  
	  private short codeproduit ;
	  
	 private  int qte ; 
	 
	 private String label;
	    
	    private int qtestock;

	    private int qteseuil;

	 private    Date dateachat ;
	    
	    
	    
	    
		public MyRequest() {
		
		}

		public MyRequest(short codeclient, int codeachat, short codeproduit, int qte, String label, int qtestock,
				int qteseuil) {
			super();
			this.codeclient = codeclient;
			this.codeachat = codeachat;
			this.codeproduit = codeproduit;
			this.qte = qte;
			this.label = label;
			this.qtestock = qtestock;
			this.qteseuil = qteseuil;
		}

		
		
		public Date getDateachat() {
			return dateachat;
		}

		public void setDateachat(Date dateachat) {
			this.dateachat = dateachat;
		}

		@Override
		public String toString() {
			return "MyRequest [codeclient=" + codeclient + ", codeachat=" + codeachat + ", codeproduit=" + codeproduit
					+ ", qte=" + qte + ", label=" + label + ", qtestock=" + qtestock + ", qteseuil=" + qteseuil + "]";
		}

		public short getCodeclient() {
			return codeclient;
		}

		public void setCodeclient(short codeclient) {
			this.codeclient = codeclient;
		}

		public int getCodeachat() {
			return codeachat;
		}

		public void setCodeachat(int codeachat) {
			this.codeachat = codeachat;
		}

		public short getCodeproduit() {
			return codeproduit;
		}

		public void setCodeproduit(short codeproduit) {
			this.codeproduit = codeproduit;
		}

		public int getQte() {
			return qte;
		}

		public void setQte(int qte) {
			this.qte = qte;
		}

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
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
	    
	    
	 
}
