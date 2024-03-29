// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


public final class GetVpcSubnetsVpcSubnetLinodeInterface extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcSubnetsVpcSubnetLinodeInterface Empty = new GetVpcSubnetsVpcSubnetLinodeInterface();

    @Import(name="active", required=true)
    private Boolean active;

    public Boolean active() {
        return this.active;
    }

    /**
     * The unique id of the VPC subnet.
     * 
     */
    @Import(name="id", required=true)
    private Integer id;

    /**
     * @return The unique id of the VPC subnet.
     * 
     */
    public Integer id() {
        return this.id;
    }

    private GetVpcSubnetsVpcSubnetLinodeInterface() {}

    private GetVpcSubnetsVpcSubnetLinodeInterface(GetVpcSubnetsVpcSubnetLinodeInterface $) {
        this.active = $.active;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcSubnetsVpcSubnetLinodeInterface defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcSubnetsVpcSubnetLinodeInterface $;

        public Builder() {
            $ = new GetVpcSubnetsVpcSubnetLinodeInterface();
        }

        public Builder(GetVpcSubnetsVpcSubnetLinodeInterface defaults) {
            $ = new GetVpcSubnetsVpcSubnetLinodeInterface(Objects.requireNonNull(defaults));
        }

        public Builder active(Boolean active) {
            $.active = active;
            return this;
        }

        /**
         * @param id The unique id of the VPC subnet.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            $.id = id;
            return this;
        }

        public GetVpcSubnetsVpcSubnetLinodeInterface build() {
            if ($.active == null) {
                throw new MissingRequiredPropertyException("GetVpcSubnetsVpcSubnetLinodeInterface", "active");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetVpcSubnetsVpcSubnetLinodeInterface", "id");
            }
            return $;
        }
    }

}
