package dev.bayeng.restfull_with_relation.run;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RunNotFoundExeption extends RuntimeException {

    public RunNotFoundExeption(String message) {
        super("Run not found: " + message);
    }
}
