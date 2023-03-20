package com.spring.practice.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<JsonResponse> handleMethodException(MethodArgumentNotValidException e) {
        JsonResponse jsonResponse = new JsonResponse();
        jsonResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        List<JsonResponse.Error> listErrors = new ArrayList<>();
        e.getBindingResult().getFieldErrors().forEach(error -> {
            JsonResponse.Error errorInfo = new JsonResponse.Error();
            errorInfo.setPointer(error.getField());
            errorInfo.setMessage(error.getDefaultMessage());
            listErrors.add(errorInfo);
        });

        jsonResponse.setErrors(listErrors);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(jsonResponse);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class JsonResponse {
        private int status;
        private List<Error> errors;

        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        public static class Error {
            private String pointer;
            private String message;
        }
    }
}
