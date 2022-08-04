// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstancesInstanceBackupSchedule {
    private final String day;
    private final String window;

    @CustomType.Constructor
    private GetInstancesInstanceBackupSchedule(
        @CustomType.Parameter("day") String day,
        @CustomType.Parameter("window") String window) {
        this.day = day;
        this.window = window;
    }

    public String day() {
        return this.day;
    }
    public String window() {
        return this.window;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesInstanceBackupSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String day;
        private String window;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstancesInstanceBackupSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.window = defaults.window;
        }

        public Builder day(String day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }
        public Builder window(String window) {
            this.window = Objects.requireNonNull(window);
            return this;
        }        public GetInstancesInstanceBackupSchedule build() {
            return new GetInstancesInstanceBackupSchedule(day, window);
        }
    }
}
