
package com.terapico.iam.userwhitelist;
//import com.terapico.iam.EntityNotFoundException;
import com.terapico.iam.IamException;
import com.terapico.iam.Message;
import java.util.List;

public class UserWhiteListManagerException extends IamException {
	private static final long serialVersionUID = 1L;
	public UserWhiteListManagerException(String string) {
		super(string);
	}
	public UserWhiteListManagerException(Message message) {
		super(message);
	}
	public UserWhiteListManagerException(List<Message> messageList) {
		super(messageList);
	}

}


