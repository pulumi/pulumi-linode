// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetVpcSubnetLinodeInterface {
    private Boolean active;
    /**
     * @return The unique id of this VPC subnet.
     * 
     */
    private Integer id;

    private GetVpcSubnetLinodeInterface() {}
    public Boolean active() {
        return this.active;
    }
    /**
     * @return The unique id of this VPC subnet.
     * 
     */
    public Integer id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcSubnetLinodeInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean active;
        private Integer id;
        public Builder() {}
        public Builder(GetVpcSubnetLinodeInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder active(Boolean active) {
            this.active = Objects.requireNonNull(active);
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetVpcSubnetLinodeInterface build() {
            final var _resultValue = new GetVpcSubnetLinodeInterface();
            _resultValue.active = active;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
