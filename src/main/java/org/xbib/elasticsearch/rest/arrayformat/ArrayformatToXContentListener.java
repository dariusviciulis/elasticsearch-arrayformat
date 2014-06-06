
package org.xbib.elasticsearch.rest.arrayformat;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.rest.BytesRestResponse;
import org.elasticsearch.rest.RestChannel;
import org.elasticsearch.rest.RestResponse;
import org.elasticsearch.rest.action.support.RestResponseListener;
import org.elasticsearch.search.SearchHit;

import java.util.Map;

public class ArrayformatToXContentListener extends RestResponseListener<SearchResponse> {

    public ArrayformatToXContentListener(RestChannel channel) {
        super(channel);
    }

    @Override
    public final RestResponse buildResponse(SearchResponse response) throws Exception {
        return buildResponse(response, channel.newBuilder());
    }

    public final RestResponse buildResponse(SearchResponse response, XContentBuilder builder) throws Exception {
        if (response.getHits() == null || response.getHits().getHits().length == 0) {
            builder.startArray().endArray();
        } else {
            builder.startArray();
            for (SearchHit hit : response.getHits().getHits()) {
                builder.map(hit.getSource());
            }
            builder.endArray();
        }
        return new BytesRestResponse(response.status(), builder);
    }

}
