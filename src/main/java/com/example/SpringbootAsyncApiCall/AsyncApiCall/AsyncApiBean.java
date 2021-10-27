package com.example.SpringbootAsyncApiCall.AsyncApiCall;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AsyncApiBean
{
    private List<String> apiResult;
}
