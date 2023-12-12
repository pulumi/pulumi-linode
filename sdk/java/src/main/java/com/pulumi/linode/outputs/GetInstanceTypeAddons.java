// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.linode.outputs.GetInstanceTypeAddonsBackup;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceTypeAddons {
    private List<GetInstanceTypeAddonsBackup> backups;

    private GetInstanceTypeAddons() {}
    public List<GetInstanceTypeAddonsBackup> backups() {
        return this.backups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypeAddons defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetInstanceTypeAddonsBackup> backups;
        public Builder() {}
        public Builder(GetInstanceTypeAddons defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backups = defaults.backups;
        }

        @CustomType.Setter
        public Builder backups(List<GetInstanceTypeAddonsBackup> backups) {
            this.backups = Objects.requireNonNull(backups);
            return this;
        }
        public Builder backups(GetInstanceTypeAddonsBackup... backups) {
            return backups(List.of(backups));
        }
        public GetInstanceTypeAddons build() {
            final var _resultValue = new GetInstanceTypeAddons();
            _resultValue.backups = backups;
            return _resultValue;
        }
    }
}
