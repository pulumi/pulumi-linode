// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class DatabasePostgresqlV2UpdatesArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabasePostgresqlV2UpdatesArgs Empty = new DatabasePostgresqlV2UpdatesArgs();

    @Import(name="dayOfWeek", required=true)
    private Output<Integer> dayOfWeek;

    public Output<Integer> dayOfWeek() {
        return this.dayOfWeek;
    }

    @Import(name="duration", required=true)
    private Output<Integer> duration;

    public Output<Integer> duration() {
        return this.duration;
    }

    @Import(name="frequency", required=true)
    private Output<String> frequency;

    public Output<String> frequency() {
        return this.frequency;
    }

    @Import(name="hourOfDay", required=true)
    private Output<Integer> hourOfDay;

    public Output<Integer> hourOfDay() {
        return this.hourOfDay;
    }

    private DatabasePostgresqlV2UpdatesArgs() {}

    private DatabasePostgresqlV2UpdatesArgs(DatabasePostgresqlV2UpdatesArgs $) {
        this.dayOfWeek = $.dayOfWeek;
        this.duration = $.duration;
        this.frequency = $.frequency;
        this.hourOfDay = $.hourOfDay;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabasePostgresqlV2UpdatesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabasePostgresqlV2UpdatesArgs $;

        public Builder() {
            $ = new DatabasePostgresqlV2UpdatesArgs();
        }

        public Builder(DatabasePostgresqlV2UpdatesArgs defaults) {
            $ = new DatabasePostgresqlV2UpdatesArgs(Objects.requireNonNull(defaults));
        }

        public Builder dayOfWeek(Output<Integer> dayOfWeek) {
            $.dayOfWeek = dayOfWeek;
            return this;
        }

        public Builder dayOfWeek(Integer dayOfWeek) {
            return dayOfWeek(Output.of(dayOfWeek));
        }

        public Builder duration(Output<Integer> duration) {
            $.duration = duration;
            return this;
        }

        public Builder duration(Integer duration) {
            return duration(Output.of(duration));
        }

        public Builder frequency(Output<String> frequency) {
            $.frequency = frequency;
            return this;
        }

        public Builder frequency(String frequency) {
            return frequency(Output.of(frequency));
        }

        public Builder hourOfDay(Output<Integer> hourOfDay) {
            $.hourOfDay = hourOfDay;
            return this;
        }

        public Builder hourOfDay(Integer hourOfDay) {
            return hourOfDay(Output.of(hourOfDay));
        }

        public DatabasePostgresqlV2UpdatesArgs build() {
            if ($.dayOfWeek == null) {
                throw new MissingRequiredPropertyException("DatabasePostgresqlV2UpdatesArgs", "dayOfWeek");
            }
            if ($.duration == null) {
                throw new MissingRequiredPropertyException("DatabasePostgresqlV2UpdatesArgs", "duration");
            }
            if ($.frequency == null) {
                throw new MissingRequiredPropertyException("DatabasePostgresqlV2UpdatesArgs", "frequency");
            }
            if ($.hourOfDay == null) {
                throw new MissingRequiredPropertyException("DatabasePostgresqlV2UpdatesArgs", "hourOfDay");
            }
            return $;
        }
    }

}
