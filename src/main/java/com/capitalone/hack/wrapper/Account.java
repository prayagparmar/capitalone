package com.capitalone.hack.wrapper;

import java.util.HashMap;
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
"account-id",
"legacy-institution-id",
"institution-name",
"active",
"account-name",
"balance",
"account-type",
"last-digits"
})
public class Account {

@JsonProperty("account-id")
private String accountId;
@JsonProperty("legacy-institution-id")
private Integer legacyInstitutionId;
@JsonProperty("institution-name")
private String institutionName;
@JsonProperty("active")
private Boolean active;
@JsonProperty("account-name")
private String accountName;
@JsonProperty("balance")
private Integer balance;
@JsonProperty("account-type")
private String accountType;
@JsonProperty("last-digits")
private String lastDigits;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The accountId
*/
@JsonProperty("account-id")
public String getAccountId() {
return accountId;
}

/**
* 
* @param accountId
* The account-id
*/
@JsonProperty("account-id")
public void setAccountId(String accountId) {
this.accountId = accountId;
}

/**
* 
* @return
* The legacyInstitutionId
*/
@JsonProperty("legacy-institution-id")
public Integer getLegacyInstitutionId() {
return legacyInstitutionId;
}

/**
* 
* @param legacyInstitutionId
* The legacy-institution-id
*/
@JsonProperty("legacy-institution-id")
public void setLegacyInstitutionId(Integer legacyInstitutionId) {
this.legacyInstitutionId = legacyInstitutionId;
}

/**
* 
* @return
* The institutionName
*/
@JsonProperty("institution-name")
public String getInstitutionName() {
return institutionName;
}

/**
* 
* @param institutionName
* The institution-name
*/
@JsonProperty("institution-name")
public void setInstitutionName(String institutionName) {
this.institutionName = institutionName;
}

/**
* 
* @return
* The active
*/
@JsonProperty("active")
public Boolean getActive() {
return active;
}

/**
* 
* @param active
* The active
*/
@JsonProperty("active")
public void setActive(Boolean active) {
this.active = active;
}

/**
* 
* @return
* The accountName
*/
@JsonProperty("account-name")
public String getAccountName() {
return accountName;
}

/**
* 
* @param accountName
* The account-name
*/
@JsonProperty("account-name")
public void setAccountName(String accountName) {
this.accountName = accountName;
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

/**
* 
* @return
* The accountType
*/
@JsonProperty("account-type")
public String getAccountType() {
return accountType;
}

/**
* 
* @param accountType
* The account-type
*/
@JsonProperty("account-type")
public void setAccountType(String accountType) {
this.accountType = accountType;
}

/**
* 
* @return
* The lastDigits
*/
@JsonProperty("last-digits")
public String getLastDigits() {
return lastDigits;
}

/**
* 
* @param lastDigits
* The last-digits
*/
@JsonProperty("last-digits")
public void setLastDigits(String lastDigits) {
this.lastDigits = lastDigits;
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