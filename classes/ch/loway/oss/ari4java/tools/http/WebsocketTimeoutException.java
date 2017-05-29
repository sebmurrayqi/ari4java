package ch.loway.oss.ari4java.tools.http;

import java.lang.RuntimeException;

public class WebsocketTimeoutException extends RuntimeException {
    public WebsocketTimeoutException() {
    }

    public WebsocketTimeoutException(String message) {
        super(message);
    }
}