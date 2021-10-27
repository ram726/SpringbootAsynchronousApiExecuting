package com.example.SpringbootAsyncApiCall.AsyncApiCall;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/all")
@Slf4j
public class AsyncApiController
{
    @Autowired
    private AsyncApiService asyncApiService;
    @GetMapping
    public CompletableFuture<List<Object>> callAllApi()
    {
        log.info("Calling--> All Api");
        List<String> apiAddress=new ArrayList<>();
        apiAddress.add("http://localhost:8080/api/user");
        apiAddress.add("http://localhost:8080/api/emp");

        CompletableFuture<List<Object>> cf=asyncApiService.loadAllApiAddress(apiAddress);
        return cf;
    }
}