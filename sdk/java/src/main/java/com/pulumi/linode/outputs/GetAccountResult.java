// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAccountResult {
    /**
     * @return First line of this Account&#39;s billing address.
     * 
     */
    private String address1;
    /**
     * @return Second line of this Account&#39;s billing address.
     * 
     */
    private String address2;
    /**
     * @return This Account&#39;s balance, in US dollars.
     * 
     */
    private Integer balance;
    /**
     * @return The city for this Account&#39;s billing address.
     * 
     */
    private String city;
    /**
     * @return The company name associated with this Account.
     * 
     */
    private String company;
    /**
     * @return The two-letter country code of this Account&#39;s billing address.
     * 
     */
    private String country;
    /**
     * @return The email address for this Account, for account management communications, and may be used for other communications as configured.
     * 
     */
    private String email;
    /**
     * @return The first name of the person associated with this Account.
     * 
     */
    private String firstName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The last name of the person associated with this Account.
     * 
     */
    private String lastName;
    /**
     * @return The phone number associated with this Account.
     * 
     */
    private String phone;
    /**
     * @return If billing address is in the United States, this is the State portion of the Account&#39;s billing address. If the address is outside the US, this is the Province associated with the Account&#39;s billing address.
     * 
     */
    private String state;
    /**
     * @return The zip code of this Account&#39;s billing address.
     * 
     */
    private String zip;

    private GetAccountResult() {}
    /**
     * @return First line of this Account&#39;s billing address.
     * 
     */
    public String address1() {
        return this.address1;
    }
    /**
     * @return Second line of this Account&#39;s billing address.
     * 
     */
    public String address2() {
        return this.address2;
    }
    /**
     * @return This Account&#39;s balance, in US dollars.
     * 
     */
    public Integer balance() {
        return this.balance;
    }
    /**
     * @return The city for this Account&#39;s billing address.
     * 
     */
    public String city() {
        return this.city;
    }
    /**
     * @return The company name associated with this Account.
     * 
     */
    public String company() {
        return this.company;
    }
    /**
     * @return The two-letter country code of this Account&#39;s billing address.
     * 
     */
    public String country() {
        return this.country;
    }
    /**
     * @return The email address for this Account, for account management communications, and may be used for other communications as configured.
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return The first name of the person associated with this Account.
     * 
     */
    public String firstName() {
        return this.firstName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The last name of the person associated with this Account.
     * 
     */
    public String lastName() {
        return this.lastName;
    }
    /**
     * @return The phone number associated with this Account.
     * 
     */
    public String phone() {
        return this.phone;
    }
    /**
     * @return If billing address is in the United States, this is the State portion of the Account&#39;s billing address. If the address is outside the US, this is the Province associated with the Account&#39;s billing address.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The zip code of this Account&#39;s billing address.
     * 
     */
    public String zip() {
        return this.zip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address1;
        private String address2;
        private Integer balance;
        private String city;
        private String company;
        private String country;
        private String email;
        private String firstName;
        private String id;
        private String lastName;
        private String phone;
        private String state;
        private String zip;
        public Builder() {}
        public Builder(GetAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address1 = defaults.address1;
    	      this.address2 = defaults.address2;
    	      this.balance = defaults.balance;
    	      this.city = defaults.city;
    	      this.company = defaults.company;
    	      this.country = defaults.country;
    	      this.email = defaults.email;
    	      this.firstName = defaults.firstName;
    	      this.id = defaults.id;
    	      this.lastName = defaults.lastName;
    	      this.phone = defaults.phone;
    	      this.state = defaults.state;
    	      this.zip = defaults.zip;
        }

        @CustomType.Setter
        public Builder address1(String address1) {
            this.address1 = Objects.requireNonNull(address1);
            return this;
        }
        @CustomType.Setter
        public Builder address2(String address2) {
            this.address2 = Objects.requireNonNull(address2);
            return this;
        }
        @CustomType.Setter
        public Builder balance(Integer balance) {
            this.balance = Objects.requireNonNull(balance);
            return this;
        }
        @CustomType.Setter
        public Builder city(String city) {
            this.city = Objects.requireNonNull(city);
            return this;
        }
        @CustomType.Setter
        public Builder company(String company) {
            this.company = Objects.requireNonNull(company);
            return this;
        }
        @CustomType.Setter
        public Builder country(String country) {
            this.country = Objects.requireNonNull(country);
            return this;
        }
        @CustomType.Setter
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        @CustomType.Setter
        public Builder firstName(String firstName) {
            this.firstName = Objects.requireNonNull(firstName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder lastName(String lastName) {
            this.lastName = Objects.requireNonNull(lastName);
            return this;
        }
        @CustomType.Setter
        public Builder phone(String phone) {
            this.phone = Objects.requireNonNull(phone);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder zip(String zip) {
            this.zip = Objects.requireNonNull(zip);
            return this;
        }
        public GetAccountResult build() {
            final var o = new GetAccountResult();
            o.address1 = address1;
            o.address2 = address2;
            o.balance = balance;
            o.city = city;
            o.company = company;
            o.country = country;
            o.email = email;
            o.firstName = firstName;
            o.id = id;
            o.lastName = lastName;
            o.phone = phone;
            o.state = state;
            o.zip = zip;
            return o;
        }
    }
}
