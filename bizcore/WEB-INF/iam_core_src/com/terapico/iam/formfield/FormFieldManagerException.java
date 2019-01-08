
package com.terapico.iam.formfield;
//import com.terapico.iam.EntityNotFoundException;
import com.terapico.iam.IamException;
import com.terapico.iam.Message;
import java.util.List;

public class FormFieldManagerException extends IamException {
	private static final long serialVersionUID = 1L;
	public FormFieldManagerException(String string) {
		super(string);
	}
	public FormFieldManagerException(Message message) {
		super(message);
	}
	public FormFieldManagerException(List<Message> messageList) {
		super(messageList);
	}

}


