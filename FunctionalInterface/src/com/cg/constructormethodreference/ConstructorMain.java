package com.cg.constructormethodreference;

public class ConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DBconnectio db = DBConnection::new;
		//System.out.println(db);
		db.getDBDetails("connecting to db");
		//System.out.println(db);

	}

}
