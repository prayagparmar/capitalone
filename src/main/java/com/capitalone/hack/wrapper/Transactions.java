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
"transactions",
"error"
})
public class Transactions {

@JsonProperty("transactions")
private List<Transaction> transactions = new ArrayList<Transaction>();
@JsonProperty("error")
private String error;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The transactions
*/
@JsonProperty("transactions")
public List<Transaction> getTransactions() {
return transactions;
}

/**
* 
* @param transactions
* The transactions
*/
@JsonProperty("transactions")
public void setTransactions(List<Transaction> transactions) {
this.transactions = transactions;
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
