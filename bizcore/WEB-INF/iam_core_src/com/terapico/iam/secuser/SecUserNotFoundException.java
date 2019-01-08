
package com.terapico.iam.secuser;
import com.terapico.iam.EntityNotFoundException;
public class SecUserNotFoundException extends EntityNotFoundException {
	private static final long serialVersionUID = 1L;
	public SecUserNotFoundException(String string) {
		super(string);
	}

}

