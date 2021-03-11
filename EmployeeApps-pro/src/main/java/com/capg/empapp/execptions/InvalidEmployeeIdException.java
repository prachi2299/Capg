package com.capg.empapp.execptions;

@SuppressWarnings("serial")
public class InvalidEmployeeIdException extends Exception {
int id;
public InvalidEmployeeIdException(int id) {
	this.id = id;
}


public String toString()
{
	return "Exception ID:- "+id;
}

}
