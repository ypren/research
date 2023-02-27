package com.ypren.demo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

/**
 * New HttpClient.
 * The new HttpClient comes up from Java 9,
 * it's not a stable version, and released in Java 11.
 */
public class NewHttpClient {
    public static void main(String[] args) throws InterruptedException {
        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://127.0.0.1:8080"))
                .timeout(Duration.ofMinutes(2))
                .build();
        httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println);

        // 主线程不要立刻结束，否则CompletableFuture默认使用的线程池会立刻关闭
        Thread.sleep(2 * 1000);
        System.out.println("end");
    }
}
