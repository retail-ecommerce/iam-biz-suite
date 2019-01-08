
package com.terapico.iam.userwhitelist;
import com.terapico.iam.EntityNotFoundException;
public class UserWhiteListNotFoundException extends EntityNotFoundException {
	private static final long serialVersionUID = 1L;
	public UserWhiteListNotFoundException(String string) {
		super(string);
	}

}

