
package com.terapico.iam.genericform;
//import com.terapico.iam.EntityNotFoundException;
import com.terapico.iam.IamException;
import com.terapico.iam.Message;
import java.util.List;

public class GenericFormManagerException extends IamException {
	private static final long serialVersionUID = 1L;
	public GenericFormManagerException(String string) {
		super(string);
	}
	public GenericFormManagerException(Message message) {
		super(message);
	}
	public GenericFormManagerException(List<Message> messageList) {
		super(messageList);
	}

}


