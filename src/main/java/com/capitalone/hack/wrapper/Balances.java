package com.capitalone.hack.wrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"days",
"error"
})
public class Balances {

@JsonProperty("days")
private List<Day> days = new ArrayList<Day>();
@JsonProperty("error")
private String error;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The days
*/
@JsonProperty("days")
public List<Day> getDays() {
return days;
}

/**
* 
* @param days
* The days
*/
@JsonProperty("days")
public void setDays(List<Day> days) {
this.days = days;
}

/**
* 
* @return
* The error
*/
@JsonProperty("error")
public String getError() {
return error;
}

/**
* 
* @param error
* The error
*/
@JsonProperty("error")
public void setError(String error) {
this.error = error;
}

@Override
public String toString() {
return ToStringBuilder.reflectionToString(this);
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}