// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.linode.outputs.InstanceBackupsSchedule;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceBackups {
    private @Nullable Boolean available;
    /**
     * @return If this Linode has the Backup service enabled.
     * 
     */
    private @Nullable Boolean enabled;
    private @Nullable InstanceBackupsSchedule schedule;

    private InstanceBackups() {}
    public Optional<Boolean> available() {
        return Optional.ofNullable(this.available);
    }
    /**
     * @return If this Linode has the Backup service enabled.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<InstanceBackupsSchedule> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceBackups defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean available;
        private @Nullable Boolean enabled;
        private @Nullable InstanceBackupsSchedule schedule;
        public Builder() {}
        public Builder(InstanceBackups defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.available = defaults.available;
    	      this.enabled = defaults.enabled;
    	      this.schedule = defaults.schedule;
        }

        @CustomType.Setter
        public Builder available(@Nullable Boolean available) {
            this.available = available;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder schedule(@Nullable InstanceBackupsSchedule schedule) {
            this.schedule = schedule;
            return this;
        }
        public InstanceBackups build() {
            final var _resultValue = new InstanceBackups();
            _resultValue.available = available;
            _resultValue.enabled = enabled;
            _resultValue.schedule = schedule;
            return _resultValue;
        }
    }
}
