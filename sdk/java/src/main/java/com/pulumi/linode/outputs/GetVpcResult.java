// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVpcResult {
    /**
     * @return The date and time when the VPC was created.
     * 
     */
    private String created;
    /**
     * @return The user-defined description of this VPC.
     * 
     */
    private String description;
    private Integer id;
    /**
     * @return The label of the VPC.
     * 
     */
    private String label;
    /**
     * @return The region where the VPC is deployed.
     * 
     */
    private String region;
    /**
     * @return The date and time when the VPC was last updated.
     * 
     */
    private String updated;

    private GetVpcResult() {}
    /**
     * @return The date and time when the VPC was created.
     * 
     */
    public String created() {
        return this.created;
    }
    /**
     * @return The user-defined description of this VPC.
     * 
     */
    public String description() {
        return this.description;
    }
    public Integer id() {
        return this.id;
    }
    /**
     * @return The label of the VPC.
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return The region where the VPC is deployed.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The date and time when the VPC was last updated.
     * 
     */
    public String updated() {
        return this.updated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String created;
        private String description;
        private Integer id;
        private String label;
        private String region;
        private String updated;
        public Builder() {}
        public Builder(GetVpcResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.label = defaults.label;
    	      this.region = defaults.region;
    	      this.updated = defaults.updated;
        }

        @CustomType.Setter
        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder updated(String updated) {
            this.updated = Objects.requireNonNull(updated);
            return this;
        }
        public GetVpcResult build() {
            final var _resultValue = new GetVpcResult();
            _resultValue.created = created;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.label = label;
            _resultValue.region = region;
            _resultValue.updated = updated;
            return _resultValue;
        }
    }
}
