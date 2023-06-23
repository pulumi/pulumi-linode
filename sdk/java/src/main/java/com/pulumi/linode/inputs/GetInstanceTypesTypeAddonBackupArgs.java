// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.GetInstanceTypesTypeAddonBackupPriceArgs;
import java.util.List;
import java.util.Objects;


public final class GetInstanceTypesTypeAddonBackupArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetInstanceTypesTypeAddonBackupArgs Empty = new GetInstanceTypesTypeAddonBackupArgs();

    @Import(name="prices", required=true)
    private Output<List<GetInstanceTypesTypeAddonBackupPriceArgs>> prices;

    public Output<List<GetInstanceTypesTypeAddonBackupPriceArgs>> prices() {
        return this.prices;
    }

    private GetInstanceTypesTypeAddonBackupArgs() {}

    private GetInstanceTypesTypeAddonBackupArgs(GetInstanceTypesTypeAddonBackupArgs $) {
        this.prices = $.prices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceTypesTypeAddonBackupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceTypesTypeAddonBackupArgs $;

        public Builder() {
            $ = new GetInstanceTypesTypeAddonBackupArgs();
        }

        public Builder(GetInstanceTypesTypeAddonBackupArgs defaults) {
            $ = new GetInstanceTypesTypeAddonBackupArgs(Objects.requireNonNull(defaults));
        }

        public Builder prices(Output<List<GetInstanceTypesTypeAddonBackupPriceArgs>> prices) {
            $.prices = prices;
            return this;
        }

        public Builder prices(List<GetInstanceTypesTypeAddonBackupPriceArgs> prices) {
            return prices(Output.of(prices));
        }

        public Builder prices(GetInstanceTypesTypeAddonBackupPriceArgs... prices) {
            return prices(List.of(prices));
        }

        public GetInstanceTypesTypeAddonBackupArgs build() {
            $.prices = Objects.requireNonNull($.prices, "expected parameter 'prices' to be non-null");
            return $;
        }
    }

}
