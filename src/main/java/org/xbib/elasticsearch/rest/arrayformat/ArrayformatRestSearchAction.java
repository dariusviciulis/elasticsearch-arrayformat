package org.xbib.elasticsearch.rest.arrayformat;

import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.rest.BaseRestHandler;
import org.elasticsearch.rest.RestChannel;
import org.elasticsearch.rest.RestController;
import org.elasticsearch.rest.RestRequest;
import org.elasticsearch.rest.action.search.RestSearchAction;

import static org.elasticsearch.rest.RestRequest.Method.GET;
import static org.elasticsearch.rest.RestRequest.Method.POST;

public class ArrayformatRestSearchAction extends BaseRestHandler {

    @Inject
    public ArrayformatRestSearchAction(Settings settings, Client client, RestController controller) {
        super(settings, client);
        controller.registerHandler(GET, "/_search_arrayformat", this);
        controller.registerHandler(POST, "/_search_arrayformat", this);
        controller.registerHandler(GET, "/{index}/_search_arrayformat", this);
        controller.registerHandler(POST, "/{index}/_search_arrayformat", this);
        controller.registerHandler(GET, "/{index}/{type}/_search_arrayformat", this);
        controller.registerHandler(POST, "/{index}/{type}/_search_arrayformat", this);
        controller.registerHandler(GET, "/_search_arrayformat/template", this);
        controller.registerHandler(POST, "/_search_arrayformat/template", this);
        controller.registerHandler(GET, "/{index}/_search_arrayformat/template", this);
        controller.registerHandler(POST, "/{index}/_search_arrayformat/template", this);
        controller.registerHandler(GET, "/{index}/{type}/_search_arrayformat/template", this);
        controller.registerHandler(POST, "/{index}/{type}/_search_arrayformat/template", this);
    }

    @Override
    public void handleRequest(final RestRequest request, final RestChannel channel, Client client) {
        SearchRequest searchRequest;
        searchRequest = RestSearchAction.parseSearchRequest(request);
        searchRequest.listenerThreaded(false);
        client.search(searchRequest, new ArrayformatToXContentListener(channel));
    }

}
