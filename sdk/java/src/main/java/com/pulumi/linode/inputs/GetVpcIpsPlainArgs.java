// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.GetVpcIpsFilter;
import com.pulumi.linode.inputs.GetVpcIpsVpcIp;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcIpsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcIpsPlainArgs Empty = new GetVpcIpsPlainArgs();

    @Import(name="filters")
    private @Nullable List<GetVpcIpsFilter> filters;

    public Optional<List<GetVpcIpsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The id of the parent VPC for the list of VPC IPs.
     * 
     * * `filter` - (Optional) A set of filters used to select Linode VPC IPs that meet certain requirements.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Integer vpcId;

    /**
     * @return The id of the parent VPC for the list of VPC IPs.
     * 
     * * `filter` - (Optional) A set of filters used to select Linode VPC IPs that meet certain requirements.
     * 
     */
    public Optional<Integer> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    @Import(name="vpcIps")
    private @Nullable List<GetVpcIpsVpcIp> vpcIps;

    public Optional<List<GetVpcIpsVpcIp>> vpcIps() {
        return Optional.ofNullable(this.vpcIps);
    }

    private GetVpcIpsPlainArgs() {}

    private GetVpcIpsPlainArgs(GetVpcIpsPlainArgs $) {
        this.filters = $.filters;
        this.vpcId = $.vpcId;
        this.vpcIps = $.vpcIps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcIpsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcIpsPlainArgs $;

        public Builder() {
            $ = new GetVpcIpsPlainArgs();
        }

        public Builder(GetVpcIpsPlainArgs defaults) {
            $ = new GetVpcIpsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetVpcIpsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetVpcIpsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param vpcId The id of the parent VPC for the list of VPC IPs.
         * 
         * * `filter` - (Optional) A set of filters used to select Linode VPC IPs that meet certain requirements.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Integer vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        public Builder vpcIps(@Nullable List<GetVpcIpsVpcIp> vpcIps) {
            $.vpcIps = vpcIps;
            return this;
        }

        public Builder vpcIps(GetVpcIpsVpcIp... vpcIps) {
            return vpcIps(List.of(vpcIps));
        }

        public GetVpcIpsPlainArgs build() {
            return $;
        }
    }

}
