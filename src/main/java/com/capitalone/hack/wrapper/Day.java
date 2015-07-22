package com.capitalone.hack.wrapper;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"day",
"balance"
})
public class Day {

@JsonProperty("day")
private Day_ day;
@JsonProperty("balance")
private Integer balance;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The day
*/
@JsonProperty("day")
public Day_ getDay() {
return day;
}

/**
* 
* @param day
* The day
*/
@JsonProperty("day")
public void setDay(Day_ day) {
this.day = day;
}

/**
* 
* @return
* The balance
*/
@JsonProperty("balance")
public Integer getBalance() {
return balance;
}

/**
* 
* @param balance
* The balance
*/
@JsonProperty("balance")
public void setBalance(Integer balance) {
this.balance = balance;
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