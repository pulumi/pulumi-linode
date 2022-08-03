// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceBackupsScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceBackupsScheduleArgs Empty = new InstanceBackupsScheduleArgs();

    @Import(name="day")
    private @Nullable Output<String> day;

    public Optional<Output<String>> day() {
        return Optional.ofNullable(this.day);
    }

    @Import(name="window")
    private @Nullable Output<String> window;

    public Optional<Output<String>> window() {
        return Optional.ofNullable(this.window);
    }

    private InstanceBackupsScheduleArgs() {}

    private InstanceBackupsScheduleArgs(InstanceBackupsScheduleArgs $) {
        this.day = $.day;
        this.window = $.window;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceBackupsScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceBackupsScheduleArgs $;

        public Builder() {
            $ = new InstanceBackupsScheduleArgs();
        }

        public Builder(InstanceBackupsScheduleArgs defaults) {
            $ = new InstanceBackupsScheduleArgs(Objects.requireNonNull(defaults));
        }

        public Builder day(@Nullable Output<String> day) {
            $.day = day;
            return this;
        }

        public Builder day(String day) {
            return day(Output.of(day));
        }

        public Builder window(@Nullable Output<String> window) {
            $.window = window;
            return this;
        }

        public Builder window(String window) {
            return window(Output.of(window));
        }

        public InstanceBackupsScheduleArgs build() {
            return $;
        }
    }

}
