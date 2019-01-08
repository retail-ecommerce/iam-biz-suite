
package com.terapico.iam.formmessage;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import com.terapico.caf.DateTime;
import com.terapico.iam.IamUserContext;
import com.terapico.iam.BaseEntity;
import com.terapico.iam.SmartList;

public interface FormMessageManager{

		

	public FormMessage createFormMessage(IamUserContext userContext, String title, String formId, String level) throws Exception;	
	public FormMessage updateFormMessage(IamUserContext userContext,String formMessageId, int formMessageVersion, String property, String newValueExpr,String [] tokensExpr) throws Exception;
	public FormMessage loadFormMessage(IamUserContext userContext, String formMessageId, String [] tokensExpr) throws Exception;
	public FormMessage internalSaveFormMessage(IamUserContext userContext, FormMessage formMessage) throws Exception;
	public FormMessage internalSaveFormMessage(IamUserContext userContext, FormMessage formMessage,Map<String,Object>option) throws Exception;
	
	public FormMessage transferToAnotherForm(IamUserContext userContext, String formMessageId, String anotherFormId)  throws Exception;
 

	public void delete(IamUserContext userContext, String formMessageId, int version) throws Exception;
	public int deleteAll(IamUserContext userContext, String secureCode ) throws Exception;
	public void onNewInstanceCreated(IamUserContext userContext, FormMessage newCreated)throws Exception;

	/*======================================================DATA MAINTENANCE===========================================================*/
	



}


