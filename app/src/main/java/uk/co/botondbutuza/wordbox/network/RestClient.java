package uk.co.botondbutuza.wordbox.network;

import com.google.gson.JsonObject;

import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.Rest;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

/**
 * Created by Ted Eriksson on 30/03/15.
 */
@Rest(rootUrl = "http://private-328f8-wordbox.apiary-mock.com", converters = { GsonHttpMessageConverter.class })
public interface RestClient {
    @Get("/users/{userId}")
    JsonObject getUser(int userId);
}
