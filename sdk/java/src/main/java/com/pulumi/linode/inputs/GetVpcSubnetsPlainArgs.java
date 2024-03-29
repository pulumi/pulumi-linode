// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetVpcSubnetsFilter;
import com.pulumi.linode.inputs.GetVpcSubnetsVpcSubnet;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcSubnetsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcSubnetsPlainArgs Empty = new GetVpcSubnetsPlainArgs();

    @Import(name="filters")
    private @Nullable List<GetVpcSubnetsFilter> filters;

    public Optional<List<GetVpcSubnetsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The id of the parent VPC for the list of VPCs.
     * 
     * * `filter` - (Optional) A set of filters used to select Linode VPC subnets that meet certain requirements.
     * 
     */
    @Import(name="vpcId", required=true)
    private Integer vpcId;

    /**
     * @return The id of the parent VPC for the list of VPCs.
     * 
     * * `filter` - (Optional) A set of filters used to select Linode VPC subnets that meet certain requirements.
     * 
     */
    public Integer vpcId() {
        return this.vpcId;
    }

    @Import(name="vpcSubnets")
    private @Nullable List<GetVpcSubnetsVpcSubnet> vpcSubnets;

    public Optional<List<GetVpcSubnetsVpcSubnet>> vpcSubnets() {
        return Optional.ofNullable(this.vpcSubnets);
    }

    private GetVpcSubnetsPlainArgs() {}

    private GetVpcSubnetsPlainArgs(GetVpcSubnetsPlainArgs $) {
        this.filters = $.filters;
        this.vpcId = $.vpcId;
        this.vpcSubnets = $.vpcSubnets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcSubnetsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcSubnetsPlainArgs $;

        public Builder() {
            $ = new GetVpcSubnetsPlainArgs();
        }

        public Builder(GetVpcSubnetsPlainArgs defaults) {
            $ = new GetVpcSubnetsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetVpcSubnetsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetVpcSubnetsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param vpcId The id of the parent VPC for the list of VPCs.
         * 
         * * `filter` - (Optional) A set of filters used to select Linode VPC subnets that meet certain requirements.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Integer vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        public Builder vpcSubnets(@Nullable List<GetVpcSubnetsVpcSubnet> vpcSubnets) {
            $.vpcSubnets = vpcSubnets;
            return this;
        }

        public Builder vpcSubnets(GetVpcSubnetsVpcSubnet... vpcSubnets) {
            return vpcSubnets(List.of(vpcSubnets));
        }

        public GetVpcSubnetsPlainArgs build() {
            if ($.vpcId == null) {
                throw new MissingRequiredPropertyException("GetVpcSubnetsPlainArgs", "vpcId");
            }
            return $;
        }
    }

}
