
package com.terapico.iam.formaction;
//import com.terapico.iam.EntityNotFoundException;
import com.terapico.iam.IamException;
import com.terapico.iam.Message;
import java.util.List;

public class FormActionManagerException extends IamException {
	private static final long serialVersionUID = 1L;
	public FormActionManagerException(String string) {
		super(string);
	}
	public FormActionManagerException(Message message) {
		super(message);
	}
	public FormActionManagerException(List<Message> messageList) {
		super(messageList);
	}

}












