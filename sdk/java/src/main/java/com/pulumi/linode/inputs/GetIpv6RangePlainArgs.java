// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIpv6RangePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIpv6RangePlainArgs Empty = new GetIpv6RangePlainArgs();

    /**
     * The IPv6 range to retrieve information about.
     * 
     */
    @Import(name="range", required=true)
    private String range;

    /**
     * @return The IPv6 range to retrieve information about.
     * 
     */
    public String range() {
        return this.range;
    }

    private GetIpv6RangePlainArgs() {}

    private GetIpv6RangePlainArgs(GetIpv6RangePlainArgs $) {
        this.range = $.range;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIpv6RangePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIpv6RangePlainArgs $;

        public Builder() {
            $ = new GetIpv6RangePlainArgs();
        }

        public Builder(GetIpv6RangePlainArgs defaults) {
            $ = new GetIpv6RangePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param range The IPv6 range to retrieve information about.
         * 
         * @return builder
         * 
         */
        public Builder range(String range) {
            $.range = range;
            return this;
        }

        public GetIpv6RangePlainArgs build() {
            $.range = Objects.requireNonNull($.range, "expected parameter 'range' to be non-null");
            return $;
        }
    }

}
