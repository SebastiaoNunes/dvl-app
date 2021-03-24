package com.dvlcube.utils;

import java.util.Map;

public class RequestHelper {

    private Map<String, String> params;

    public static RequestHelper create(Map<String, String> params) {
        RequestHelper requestHelper = new RequestHelper();
        requestHelper.params = params;
        return requestHelper;
    }

    public String getParamater(String name) {
        return params.get(name);
    }

    public boolean hasFilter() {
        return params != null && !params.isEmpty();
    }
}
