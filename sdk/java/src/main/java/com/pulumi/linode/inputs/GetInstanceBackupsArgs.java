// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class GetInstanceBackupsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceBackupsArgs Empty = new GetInstanceBackupsArgs();

    /**
     * The Linode instance&#39;s ID.
     * 
     */
    @Import(name="linodeId", required=true)
    private Output<Integer> linodeId;

    /**
     * @return The Linode instance&#39;s ID.
     * 
     */
    public Output<Integer> linodeId() {
        return this.linodeId;
    }

    private GetInstanceBackupsArgs() {}

    private GetInstanceBackupsArgs(GetInstanceBackupsArgs $) {
        this.linodeId = $.linodeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceBackupsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceBackupsArgs $;

        public Builder() {
            $ = new GetInstanceBackupsArgs();
        }

        public Builder(GetInstanceBackupsArgs defaults) {
            $ = new GetInstanceBackupsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param linodeId The Linode instance&#39;s ID.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(Output<Integer> linodeId) {
            $.linodeId = linodeId;
            return this;
        }

        /**
         * @param linodeId The Linode instance&#39;s ID.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(Integer linodeId) {
            return linodeId(Output.of(linodeId));
        }

        public GetInstanceBackupsArgs build() {
            $.linodeId = Objects.requireNonNull($.linodeId, "expected parameter 'linodeId' to be non-null");
            return $;
        }
    }

}
