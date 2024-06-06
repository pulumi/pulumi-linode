// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetChildAccountResult {
    /**
     * @return When this account was first activated.
     * 
     */
    private String activeSince;
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
    private Double balance;
    /**
     * @return A set containing all the capabilities of this Account.
     * 
     */
    private List<String> capabilities;
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
    private String euuid;
    /**
     * @return The first name of the person associated with this Account.
     * 
     */
    private String firstName;
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

    private GetChildAccountResult() {}
    /**
     * @return When this account was first activated.
     * 
     */
    public String activeSince() {
        return this.activeSince;
    }
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
    public Double balance() {
        return this.balance;
    }
    /**
     * @return A set containing all the capabilities of this Account.
     * 
     */
    public List<String> capabilities() {
        return this.capabilities;
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
    public String euuid() {
        return this.euuid;
    }
    /**
     * @return The first name of the person associated with this Account.
     * 
     */
    public String firstName() {
        return this.firstName;
    }
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

    public static Builder builder(GetChildAccountResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String activeSince;
        private String address1;
        private String address2;
        private Double balance;
        private List<String> capabilities;
        private String city;
        private String company;
        private String country;
        private String email;
        private String euuid;
        private String firstName;
        private String id;
        private String lastName;
        private String phone;
        private String state;
        private String zip;
        public Builder() {}
        public Builder(GetChildAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeSince = defaults.activeSince;
    	      this.address1 = defaults.address1;
    	      this.address2 = defaults.address2;
    	      this.balance = defaults.balance;
    	      this.capabilities = defaults.capabilities;
    	      this.city = defaults.city;
    	      this.company = defaults.company;
    	      this.country = defaults.country;
    	      this.email = defaults.email;
    	      this.euuid = defaults.euuid;
    	      this.firstName = defaults.firstName;
    	      this.id = defaults.id;
    	      this.lastName = defaults.lastName;
    	      this.phone = defaults.phone;
    	      this.state = defaults.state;
    	      this.zip = defaults.zip;
        }

        @CustomType.Setter
        public Builder activeSince(String activeSince) {
            if (activeSince == null) {
              throw new MissingRequiredPropertyException("GetChildAccountResult", "activeSince");
            }
            this.activeSince = activeSince;
            return this;
        }
        @CustomType.Setter
        public Builder address1(String address1) {
            if (address1 == null) {
              throw new MissingRequiredPropertyException("GetChildAccountResult", "address1");
            }
            this.address1 = address1;
            return this;
        }
        @CustomType.Setter
        public Builder address2(String address2) {
            if (address2 == null) {
              throw new MissingRequiredPropertyException("GetChildAccountResult", "address2");
            }
            this.address2 = address2;
            return this;
        }
        @CustomType.Setter
        public Builder balance(Double balance) {
            if (balance == null) {
              throw new MissingRequiredPropertyException("GetChildAccountResult", "balance");
            }
            this.balance = balance;
            return this;
        }
        @CustomType.Setter
        public Builder capabilities(List<String> capabilities) {
            if (capabilities == null) {
              throw new MissingRequiredPropertyException("GetChildAccountResult", "capabilities");
            }
            this.capabilities = capabilities;
            return this;
        }
        public Builder capabilities(String... capabilities) {
            return capabilities(List.of(capabilities));
        }
        @CustomType.Setter
        public Builder city(String city) {
            if (city == null) {
              throw new MissingRequiredPropertyException("GetChildAccountResult", "city");
            }
            this.city = city;
            return this;
        }
        @CustomType.Setter
        public Builder company(String company) {
            if (company == null) {
              throw new MissingRequiredPropertyException("GetChildAccountResult", "company");
            }
            this.company = company;
            return this;
        }
        @CustomType.Setter
        public Builder country(String country) {
            if (country == null) {
              throw new MissingRequiredPropertyException("GetChildAccountResult", "country");
            }
            this.country = country;
            return this;
        }
        @CustomType.Setter
        public Builder email(String email) {
            if (email == null) {
              throw new MissingRequiredPropertyException("GetChildAccountResult", "email");
            }
            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder euuid(String euuid) {
            if (euuid == null) {
              throw new MissingRequiredPropertyException("GetChildAccountResult", "euuid");
            }
            this.euuid = euuid;
            return this;
        }
        @CustomType.Setter
        public Builder firstName(String firstName) {
            if (firstName == null) {
              throw new MissingRequiredPropertyException("GetChildAccountResult", "firstName");
            }
            this.firstName = firstName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetChildAccountResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder lastName(String lastName) {
            if (lastName == null) {
              throw new MissingRequiredPropertyException("GetChildAccountResult", "lastName");
            }
            this.lastName = lastName;
            return this;
        }
        @CustomType.Setter
        public Builder phone(String phone) {
            if (phone == null) {
              throw new MissingRequiredPropertyException("GetChildAccountResult", "phone");
            }
            this.phone = phone;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetChildAccountResult", "state");
            }
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder zip(String zip) {
            if (zip == null) {
              throw new MissingRequiredPropertyException("GetChildAccountResult", "zip");
            }
            this.zip = zip;
            return this;
        }
        public GetChildAccountResult build() {
            final var _resultValue = new GetChildAccountResult();
            _resultValue.activeSince = activeSince;
            _resultValue.address1 = address1;
            _resultValue.address2 = address2;
            _resultValue.balance = balance;
            _resultValue.capabilities = capabilities;
            _resultValue.city = city;
            _resultValue.company = company;
            _resultValue.country = country;
            _resultValue.email = email;
            _resultValue.euuid = euuid;
            _resultValue.firstName = firstName;
            _resultValue.id = id;
            _resultValue.lastName = lastName;
            _resultValue.phone = phone;
            _resultValue.state = state;
            _resultValue.zip = zip;
            return _resultValue;
        }
    }
}
