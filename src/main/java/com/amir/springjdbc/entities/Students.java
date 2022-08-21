package com.amir.springjdbc.entities;

public class Students {
private int ID;
private String NAME;
private int AGE;
private String ADDRESS;
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getNAME() {
	return NAME;
}
public void setNAME(String nAME) {
	NAME = nAME;
}
public int getAGE() {
	return AGE;
}
public void setAGE(int aGE) {
	AGE = aGE;
}
public String getADDRESS() {
	return ADDRESS;
}
public void setADDRESS(String ADDRESS) {
	this.ADDRESS = ADDRESS;
}
public Students() {
	super();
	// TODO Auto-generated constructor stub
}
public Students(int iD, String nAME, int aGE, String vILLAGE) {
	super();
	ID = iD;
	NAME = nAME;
	AGE = aGE;
	ADDRESS = vILLAGE;
}
@Override
public String toString() {
	return "Students [ID=" + ID + ", NAME=" + NAME + ", AGE=" + AGE + ", ADDRESS=" + ADDRESS + "]";
}

}
