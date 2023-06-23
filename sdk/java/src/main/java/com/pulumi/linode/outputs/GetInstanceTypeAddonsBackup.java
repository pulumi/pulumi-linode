// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.linode.outputs.GetInstanceTypeAddonsBackupPrice;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceTypeAddonsBackup {
    private List<GetInstanceTypeAddonsBackupPrice> prices;

    private GetInstanceTypeAddonsBackup() {}
    public List<GetInstanceTypeAddonsBackupPrice> prices() {
        return this.prices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypeAddonsBackup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetInstanceTypeAddonsBackupPrice> prices;
        public Builder() {}
        public Builder(GetInstanceTypeAddonsBackup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prices = defaults.prices;
        }

        @CustomType.Setter
        public Builder prices(List<GetInstanceTypeAddonsBackupPrice> prices) {
            this.prices = Objects.requireNonNull(prices);
            return this;
        }
        public Builder prices(GetInstanceTypeAddonsBackupPrice... prices) {
            return prices(List.of(prices));
        }
        public GetInstanceTypeAddonsBackup build() {
            final var o = new GetInstanceTypeAddonsBackup();
            o.prices = prices;
            return o;
        }
    }
}
