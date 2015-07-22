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
"transaction-id",
"account-id",
"raw-merchant",
"merchant",
"is-pending",
"transaction-time",
"amount"
})
public class Transaction {

@JsonProperty("transaction-id")
private String transactionId;
@JsonProperty("account-id")
private String accountId;
@JsonProperty("raw-merchant")
private String rawMerchant;
@JsonProperty("merchant")
private String merchant;
@JsonProperty("is-pending")
private Boolean isPending;
@JsonProperty("transaction-time")
private String transactionTime;
@JsonProperty("amount")
private Integer amount;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The transactionId
*/
@JsonProperty("transaction-id")
public String getTransactionId() {
return transactionId;
}

/**
* 
* @param transactionId
* The transaction-id
*/
@JsonProperty("transaction-id")
public void setTransactionId(String transactionId) {
this.transactionId = transactionId;
}

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
* The rawMerchant
*/
@JsonProperty("raw-merchant")
public String getRawMerchant() {
return rawMerchant;
}

/**
* 
* @param rawMerchant
* The raw-merchant
*/
@JsonProperty("raw-merchant")
public void setRawMerchant(String rawMerchant) {
this.rawMerchant = rawMerchant;
}

/**
* 
* @return
* The merchant
*/
@JsonProperty("merchant")
public String getMerchant() {
return merchant;
}

/**
* 
* @param merchant
* The merchant
*/
@JsonProperty("merchant")
public void setMerchant(String merchant) {
this.merchant = merchant;
}

/**
* 
* @return
* The isPending
*/
@JsonProperty("is-pending")
public Boolean getIsPending() {
return isPending;
}

/**
* 
* @param isPending
* The is-pending
*/
@JsonProperty("is-pending")
public void setIsPending(Boolean isPending) {
this.isPending = isPending;
}

/**
* 
* @return
* The transactionTime
*/
@JsonProperty("transaction-time")
public String getTransactionTime() {
return transactionTime;
}

/**
* 
* @param transactionTime
* The transaction-time
*/
@JsonProperty("transaction-time")
public void setTransactionTime(String transactionTime) {
this.transactionTime = transactionTime;
}

/**
* 
* @return
* The amount
*/
@JsonProperty("amount")
public Integer getAmount() {
return amount;
}

/**
* 
* @param amount
* The amount
*/
@JsonProperty("amount")
public void setAmount(Integer amount) {
this.amount = amount;
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
