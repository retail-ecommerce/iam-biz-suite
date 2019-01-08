package com.terapico.iam;

public interface IamUserContext extends UserContext{
    //define the domain specific user model
	String getLocaleKey(String subject);
	void setChecker(IamChecker checker);
	IamChecker getChecker();
}

