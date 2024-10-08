// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetImageReplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImageReplicationArgs Empty = new GetImageReplicationArgs();

    /**
     * The region of an image replica.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return The region of an image replica.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    /**
     * The status of an image replica.
     * 
     */
    @Import(name="status", required=true)
    private Output<String> status;

    /**
     * @return The status of an image replica.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    private GetImageReplicationArgs() {}

    private GetImageReplicationArgs(GetImageReplicationArgs $) {
        this.region = $.region;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImageReplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImageReplicationArgs $;

        public Builder() {
            $ = new GetImageReplicationArgs();
        }

        public Builder(GetImageReplicationArgs defaults) {
            $ = new GetImageReplicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param region The region of an image replica.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region of an image replica.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param status The status of an image replica.
         * 
         * @return builder
         * 
         */
        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of an image replica.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetImageReplicationArgs build() {
            if ($.region == null) {
                throw new MissingRequiredPropertyException("GetImageReplicationArgs", "region");
            }
            if ($.status == null) {
                throw new MissingRequiredPropertyException("GetImageReplicationArgs", "status");
            }
            return $;
        }
    }

}
