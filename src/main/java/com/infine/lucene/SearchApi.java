package com.infine.lucene;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Nullable;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by aramponi032414 on 15/08/2015.
 */
@Slf4j
@Api(name="searchapi", version="v1", description="search api")
public class SearchApi {
    public SearchApi() {

    }
    @ApiMethod(
            name="search",
            path="search",
            httpMethod = ApiMethod.HttpMethod.GET
    )
    public Long [] search(Long id, String [] terms, @Nullable String location) {
        return new Long[] {1L,2L,3L,4L,5L};
    }

    public void index(Long id, String [] terms, @Nullable String location) {

    }
}
