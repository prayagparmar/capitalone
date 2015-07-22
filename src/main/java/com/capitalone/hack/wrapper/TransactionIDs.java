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
"transaction-ids",
"error"
})
public class TransactionIDs {

@JsonProperty("transaction-ids")
private List<String> transactionIds = new ArrayList<String>();
@JsonProperty("error")
private String error;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The transactionIds
*/
@JsonProperty("transaction-ids")
public List<String> getTransactionIds() {
return transactionIds;
}

/**
* 
* @param transactionIds
* The transaction-ids
*/
@JsonProperty("transaction-ids")
public void setTransactionIds(List<String> transactionIds) {
this.transactionIds = transactionIds;
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