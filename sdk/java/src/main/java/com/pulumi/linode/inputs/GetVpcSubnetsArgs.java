// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.GetVpcSubnetsFilterArgs;
import com.pulumi.linode.inputs.GetVpcSubnetsVpcSubnetArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcSubnetsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcSubnetsArgs Empty = new GetVpcSubnetsArgs();

    /**
     * `filter` - (Optional) A set of filters used to select Linode VPC subnets that meet certain requirements.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetVpcSubnetsFilterArgs>> filters;

    /**
     * @return `filter` - (Optional) A set of filters used to select Linode VPC subnets that meet certain requirements.
     * 
     */
    public Optional<Output<List<GetVpcSubnetsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The id of the parent VPC for the list of VPCs.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<Integer> vpcId;

    /**
     * @return The id of the parent VPC for the list of VPCs.
     * 
     */
    public Output<Integer> vpcId() {
        return this.vpcId;
    }

    @Import(name="vpcSubnets")
    private @Nullable Output<List<GetVpcSubnetsVpcSubnetArgs>> vpcSubnets;

    public Optional<Output<List<GetVpcSubnetsVpcSubnetArgs>>> vpcSubnets() {
        return Optional.ofNullable(this.vpcSubnets);
    }

    private GetVpcSubnetsArgs() {}

    private GetVpcSubnetsArgs(GetVpcSubnetsArgs $) {
        this.filters = $.filters;
        this.vpcId = $.vpcId;
        this.vpcSubnets = $.vpcSubnets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcSubnetsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcSubnetsArgs $;

        public Builder() {
            $ = new GetVpcSubnetsArgs();
        }

        public Builder(GetVpcSubnetsArgs defaults) {
            $ = new GetVpcSubnetsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters `filter` - (Optional) A set of filters used to select Linode VPC subnets that meet certain requirements.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetVpcSubnetsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters `filter` - (Optional) A set of filters used to select Linode VPC subnets that meet certain requirements.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetVpcSubnetsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters `filter` - (Optional) A set of filters used to select Linode VPC subnets that meet certain requirements.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetVpcSubnetsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param vpcId The id of the parent VPC for the list of VPCs.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<Integer> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The id of the parent VPC for the list of VPCs.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Integer vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public Builder vpcSubnets(@Nullable Output<List<GetVpcSubnetsVpcSubnetArgs>> vpcSubnets) {
            $.vpcSubnets = vpcSubnets;
            return this;
        }

        public Builder vpcSubnets(List<GetVpcSubnetsVpcSubnetArgs> vpcSubnets) {
            return vpcSubnets(Output.of(vpcSubnets));
        }

        public Builder vpcSubnets(GetVpcSubnetsVpcSubnetArgs... vpcSubnets) {
            return vpcSubnets(List.of(vpcSubnets));
        }

        public GetVpcSubnetsArgs build() {
            $.vpcId = Objects.requireNonNull($.vpcId, "expected parameter 'vpcId' to be non-null");
            return $;
        }
    }

}
