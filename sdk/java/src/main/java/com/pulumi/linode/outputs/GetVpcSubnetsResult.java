// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.outputs.GetVpcSubnetsFilter;
import com.pulumi.linode.outputs.GetVpcSubnetsVpcSubnet;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetVpcSubnetsResult {
    private @Nullable List<GetVpcSubnetsFilter> filters;
    /**
     * @return The unique id of the VPC subnet.
     * 
     */
    private String id;
    private Integer vpcId;
    private @Nullable List<GetVpcSubnetsVpcSubnet> vpcSubnets;

    private GetVpcSubnetsResult() {}
    public List<GetVpcSubnetsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The unique id of the VPC subnet.
     * 
     */
    public String id() {
        return this.id;
    }
    public Integer vpcId() {
        return this.vpcId;
    }
    public List<GetVpcSubnetsVpcSubnet> vpcSubnets() {
        return this.vpcSubnets == null ? List.of() : this.vpcSubnets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcSubnetsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetVpcSubnetsFilter> filters;
        private String id;
        private Integer vpcId;
        private @Nullable List<GetVpcSubnetsVpcSubnet> vpcSubnets;
        public Builder() {}
        public Builder(GetVpcSubnetsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.vpcId = defaults.vpcId;
    	      this.vpcSubnets = defaults.vpcSubnets;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetVpcSubnetsFilter> filters) {

            this.filters = filters;
            return this;
        }
        public Builder filters(GetVpcSubnetsFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetVpcSubnetsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(Integer vpcId) {
            if (vpcId == null) {
              throw new MissingRequiredPropertyException("GetVpcSubnetsResult", "vpcId");
            }
            this.vpcId = vpcId;
            return this;
        }
        @CustomType.Setter
        public Builder vpcSubnets(@Nullable List<GetVpcSubnetsVpcSubnet> vpcSubnets) {

            this.vpcSubnets = vpcSubnets;
            return this;
        }
        public Builder vpcSubnets(GetVpcSubnetsVpcSubnet... vpcSubnets) {
            return vpcSubnets(List.of(vpcSubnets));
        }
        public GetVpcSubnetsResult build() {
            final var _resultValue = new GetVpcSubnetsResult();
            _resultValue.filters = filters;
            _resultValue.id = id;
            _resultValue.vpcId = vpcId;
            _resultValue.vpcSubnets = vpcSubnets;
            return _resultValue;
        }
    }
}
