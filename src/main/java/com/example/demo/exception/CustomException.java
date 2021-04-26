package com.example.demo.exception;

import java.io.Serializable;

public class CustomException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = -7076827527892833602L;

    private String code=null;

    public CustomException(String code) {
        super();
        this.code = code;
    }

    public CustomException(String message, Throwable cause, String code) {
        super(message, cause);
        this.code = code;
    }

    public CustomException(String message, String code) {
        super(message);
        this.code = code;
    }

    public CustomException(Throwable cause, String code) {
        super(cause);
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}
