package com.leaf.id.generator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.INTERNAL_SERVER_ERROR,reason="Key is none")
public class NoKeyException extends RuntimeException {
}
