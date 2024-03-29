package com.terapico.iam.formmessage;
import com.terapico.iam.BaseForm;
import com.terapico.iam.genericform.GenericForm;
import com.terapico.iam.formfield.FormField;
import com.terapico.iam.formaction.FormAction;
import com.terapico.iam.formmessage.FormMessage;
import com.terapico.iam.formfieldmessage.FormFieldMessage;



public class FormMessageForm extends BaseForm {
	
	
	public FormMessageForm withTitle(String title){
		this.setId(System.currentTimeMillis()+"");
		this.setTitle(title);
		return this;
	}
	
	
	

	public FormMessageForm formMessageIdField(String parameterName, String initValue){
		FormField field = idFromFormMessage(parameterName, initValue);		
		this.addFormField(field);
		return this;
	}
	
	public FormMessageForm formMessageIdField(String initValue){
		return formMessageIdField("formMessageId",initValue);
	}
	public FormMessageForm formMessageIdField(){
		return formMessageIdField("formMessageId","");
	}


	public FormMessageForm titleField(String parameterName, String initValue){
		FormField field = titleFromFormMessage(parameterName, initValue);		
		this.addFormField(field);
		return this;
	}
	
	public FormMessageForm titleField(String initValue){
		return titleField("title",initValue);
	}
	public FormMessageForm titleField(){
		return titleField("title","");
	}


	public FormMessageForm formIdField(String parameterName, String initValue){
		FormField field = formIdFromFormMessage(parameterName, initValue);		
		this.addFormField(field);
		return this;
	}
	
	public FormMessageForm formIdField(String initValue){
		return formIdField("formId",initValue);
	}
	public FormMessageForm formIdField(){
		return formIdField("formId","");
	}


	public FormMessageForm levelField(String parameterName, String initValue){
		FormField field = levelFromFormMessage(parameterName, initValue);		
		this.addFormField(field);
		return this;
	}
	
	public FormMessageForm levelField(String initValue){
		return levelField("level",initValue);
	}
	public FormMessageForm levelField(){
		return levelField("level","");
	}

	
	


	public FormMessageForm genericFormIdFieldOfGenericForm(String parameterName, String initValue){
		FormField field =  idFromGenericForm(parameterName, initValue);
		this.addFormField(field);	
		return this;
	}
	
	public FormMessageForm genericFormIdFieldOfGenericForm(String initValue){
		return genericFormIdFieldOfGenericForm("genericFormId",initValue);
	}
	public FormMessageForm genericFormIdFieldOfGenericForm(){
		return genericFormIdFieldOfGenericForm("genericFormId","");
	}


	public FormMessageForm titleFieldOfGenericForm(String parameterName, String initValue){
		FormField field =  titleFromGenericForm(parameterName, initValue);
		this.addFormField(field);	
		return this;
	}
	
	public FormMessageForm titleFieldOfGenericForm(String initValue){
		return titleFieldOfGenericForm("title",initValue);
	}
	public FormMessageForm titleFieldOfGenericForm(){
		return titleFieldOfGenericForm("title","");
	}


	public FormMessageForm descriptionFieldOfGenericForm(String parameterName, String initValue){
		FormField field =  descriptionFromGenericForm(parameterName, initValue);
		this.addFormField(field);	
		return this;
	}
	
	public FormMessageForm descriptionFieldOfGenericForm(String initValue){
		return descriptionFieldOfGenericForm("description",initValue);
	}
	public FormMessageForm descriptionFieldOfGenericForm(){
		return descriptionFieldOfGenericForm("description","");
	}

	


	

	
 	public FormMessageForm transferToAnotherFormAction(){
		FormAction action = new FormAction();
		action.setLabel("显示");
		action.setLocaleKey("show");
		action.setUrl("transferToAnotherForm/formMessageId/");
		this.addFormAction(action);
		return this;
	}

 

	public FormMessageForm showAction(){
		FormAction action = new FormAction();
		action.setLabel("显示");
		action.setLocaleKey("show");
		action.setUrl("genericFormManager/show/title/desc/");
		this.addFormAction(action);
		return this;
	}
	
	
}


