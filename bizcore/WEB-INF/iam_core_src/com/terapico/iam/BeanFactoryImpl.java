
package com.terapico.iam;
import java.util.Map;

import com.terapico.iam.userdomain.UserDomain;
import com.terapico.iam.userwhitelist.UserWhiteList;
import com.terapico.iam.secuser.SecUser;
import com.terapico.iam.secuserblocking.SecUserBlocking;
import com.terapico.iam.userapp.UserApp;
import com.terapico.iam.listaccess.ListAccess;
import com.terapico.iam.objectaccess.ObjectAccess;
import com.terapico.iam.loginhistory.LoginHistory;
import com.terapico.iam.genericform.GenericForm;
import com.terapico.iam.formmessage.FormMessage;
import com.terapico.iam.formfieldmessage.FormFieldMessage;
import com.terapico.iam.formfield.FormField;
import com.terapico.iam.formaction.FormAction;

public class BeanFactoryImpl{


	public UserDomain createUserDomain(Map<String,Object> options){
		return new UserDomain();
	}


	public UserWhiteList createUserWhiteList(Map<String,Object> options){
		return new UserWhiteList();
	}


	public SecUser createSecUser(Map<String,Object> options){
		return new SecUser();
	}


	public SecUserBlocking createSecUserBlocking(Map<String,Object> options){
		return new SecUserBlocking();
	}


	public UserApp createUserApp(Map<String,Object> options){
		return new UserApp();
	}


	public ListAccess createListAccess(Map<String,Object> options){
		return new ListAccess();
	}


	public ObjectAccess createObjectAccess(Map<String,Object> options){
		return new ObjectAccess();
	}


	public LoginHistory createLoginHistory(Map<String,Object> options){
		return new LoginHistory();
	}


	public GenericForm createGenericForm(Map<String,Object> options){
		return new GenericForm();
	}


	public FormMessage createFormMessage(Map<String,Object> options){
		return new FormMessage();
	}


	public FormFieldMessage createFormFieldMessage(Map<String,Object> options){
		return new FormFieldMessage();
	}


	public FormField createFormField(Map<String,Object> options){
		return new FormField();
	}


	public FormAction createFormAction(Map<String,Object> options){
		return new FormAction();
	}





}










