
package com.terapico.iam.formfield;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import com.terapico.caf.DateTime;
import com.terapico.iam.IamUserContext;
import com.terapico.iam.BaseEntity;
import com.terapico.iam.SmartList;

public interface FormFieldManager{

		

	public FormField createFormField(IamUserContext userContext, String label, String localeKey, String parameterName, String type, String formId, String placeholder, String defaultValue, String description, String fieldGroup, String minimumValue, String maximumValue, boolean required, boolean disabled, boolean customRendering, String candidateValues, String suggestValues) throws Exception;	
	public FormField updateFormField(IamUserContext userContext,String formFieldId, int formFieldVersion, String property, String newValueExpr,String [] tokensExpr) throws Exception;
	public FormField loadFormField(IamUserContext userContext, String formFieldId, String [] tokensExpr) throws Exception;
	public FormField internalSaveFormField(IamUserContext userContext, FormField formField) throws Exception;
	public FormField internalSaveFormField(IamUserContext userContext, FormField formField,Map<String,Object>option) throws Exception;
	
	public FormField transferToAnotherForm(IamUserContext userContext, String formFieldId, String anotherFormId)  throws Exception;
 

	public void delete(IamUserContext userContext, String formFieldId, int version) throws Exception;
	public int deleteAll(IamUserContext userContext, String secureCode ) throws Exception;
	public void onNewInstanceCreated(IamUserContext userContext, FormField newCreated)throws Exception;

	/*======================================================DATA MAINTENANCE===========================================================*/
	



}


