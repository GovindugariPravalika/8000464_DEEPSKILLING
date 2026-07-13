package com.cognizant;

public class MyService {

    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void fetchData() {

        api.connect();

        api.getData();

        api.disconnect();

    }
}