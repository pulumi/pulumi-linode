// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSshKeyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSshKeyPlainArgs Empty = new GetSshKeyPlainArgs();

    /**
     * The label of the SSH Key to select.
     * 
     */
    @Import(name="label", required=true)
    private String label;

    /**
     * @return The label of the SSH Key to select.
     * 
     */
    public String label() {
        return this.label;
    }

    private GetSshKeyPlainArgs() {}

    private GetSshKeyPlainArgs(GetSshKeyPlainArgs $) {
        this.label = $.label;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSshKeyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSshKeyPlainArgs $;

        public Builder() {
            $ = new GetSshKeyPlainArgs();
        }

        public Builder(GetSshKeyPlainArgs defaults) {
            $ = new GetSshKeyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param label The label of the SSH Key to select.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            $.label = label;
            return this;
        }

        public GetSshKeyPlainArgs build() {
            $.label = Objects.requireNonNull($.label, "expected parameter 'label' to be non-null");
            return $;
        }
    }

}
