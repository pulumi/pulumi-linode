// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetVpcSubnetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcSubnetArgs Empty = new GetVpcSubnetArgs();

    /**
     * The unique id of this VPC subnet.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The unique id of this VPC subnet.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * The id of the parent VPC for this VPC Subnet.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<Integer> vpcId;

    /**
     * @return The id of the parent VPC for this VPC Subnet.
     * 
     */
    public Output<Integer> vpcId() {
        return this.vpcId;
    }

    private GetVpcSubnetArgs() {}

    private GetVpcSubnetArgs(GetVpcSubnetArgs $) {
        this.id = $.id;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcSubnetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcSubnetArgs $;

        public Builder() {
            $ = new GetVpcSubnetArgs();
        }

        public Builder(GetVpcSubnetArgs defaults) {
            $ = new GetVpcSubnetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The unique id of this VPC subnet.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The unique id of this VPC subnet.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param vpcId The id of the parent VPC for this VPC Subnet.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<Integer> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The id of the parent VPC for this VPC Subnet.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Integer vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public GetVpcSubnetArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetVpcSubnetArgs", "id");
            }
            if ($.vpcId == null) {
                throw new MissingRequiredPropertyException("GetVpcSubnetArgs", "vpcId");
            }
            return $;
        }
    }

}
