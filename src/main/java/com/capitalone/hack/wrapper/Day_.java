package com.capitalone.hack.wrapper;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"year",
"month",
"day"
})
public class Day_ {

@JsonProperty("year")
private Integer year;
@JsonProperty("month")
private Integer month;
@JsonProperty("day")
private Integer day;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The year
*/
@JsonProperty("year")
public Integer getYear() {
return year;
}

/**
* 
* @param year
* The year
*/
@JsonProperty("year")
public void setYear(Integer year) {
this.year = year;
}

/**
* 
* @return
* The month
*/
@JsonProperty("month")
public Integer getMonth() {
return month;
}

/**
* 
* @param month
* The month
*/
@JsonProperty("month")
public void setMonth(Integer month) {
this.month = month;
}

/**
* 
* @return
* The day
*/
@JsonProperty("day")
public Integer getDay() {
return day;
}

/**
* 
* @param day
* The day
*/
@JsonProperty("day")
public void setDay(Integer day) {
this.day = day;
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