
package com.terapico.iam.listaccess;
//import com.terapico.iam.EntityNotFoundException;
import com.terapico.iam.IamException;
import com.terapico.iam.Message;
import java.util.List;

public class ListAccessManagerException extends IamException {
	private static final long serialVersionUID = 1L;
	public ListAccessManagerException(String string) {
		super(string);
	}
	public ListAccessManagerException(Message message) {
		super(message);
	}
	public ListAccessManagerException(List<Message> messageList) {
		super(messageList);
	}

}


