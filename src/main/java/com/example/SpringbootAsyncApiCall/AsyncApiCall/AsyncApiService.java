package com.example.SpringbootAsyncApiCall.AsyncApiCall;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@Service
public class AsyncApiService
{
    private static RestTemplate restTemplate = new RestTemplate();

    public CompletableFuture<List<Object>> loadAllApiAddress(List<String> apiAddress)
    {
        List collect = (List) apiAddress
                .stream()
                .map(site -> CompletableFuture.supplyAsync(() -> downloadContentOfApi(site)))
                .collect(Collectors.toList());
        CompletableFuture<List<Object>> allCompletedFuture=
                sequence((List<CompletableFuture<Object>>) collect);
        return allCompletedFuture;
    }


    private static <T> CompletableFuture<List<Object>> sequence(List<CompletableFuture<Object>> futures) {
        CompletableFuture<Void> allDoneFuture =
                CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()]));
        return allDoneFuture.thenApply(v ->
                futures.stream().
                        map(future -> future.join()).
                        collect(Collectors.<Object>toList())
        );
    }

    private List<AsyncApiBean> downloadContentOfApi(String api) {
        List<AsyncApiBean>response=restTemplate.getForObject(api,List.class);
        System.out.println("downloading content of api-> "+api+"-->"+response);
        return response;
    }
}
