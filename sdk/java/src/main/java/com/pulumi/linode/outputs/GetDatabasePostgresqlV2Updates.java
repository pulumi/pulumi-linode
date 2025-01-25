// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDatabasePostgresqlV2Updates {
    private Integer dayOfWeek;
    private Integer duration;
    private String frequency;
    private Integer hourOfDay;

    private GetDatabasePostgresqlV2Updates() {}
    public Integer dayOfWeek() {
        return this.dayOfWeek;
    }
    public Integer duration() {
        return this.duration;
    }
    public String frequency() {
        return this.frequency;
    }
    public Integer hourOfDay() {
        return this.hourOfDay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabasePostgresqlV2Updates defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer dayOfWeek;
        private Integer duration;
        private String frequency;
        private Integer hourOfDay;
        public Builder() {}
        public Builder(GetDatabasePostgresqlV2Updates defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.duration = defaults.duration;
    	      this.frequency = defaults.frequency;
    	      this.hourOfDay = defaults.hourOfDay;
        }

        @CustomType.Setter
        public Builder dayOfWeek(Integer dayOfWeek) {
            if (dayOfWeek == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Updates", "dayOfWeek");
            }
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        @CustomType.Setter
        public Builder duration(Integer duration) {
            if (duration == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Updates", "duration");
            }
            this.duration = duration;
            return this;
        }
        @CustomType.Setter
        public Builder frequency(String frequency) {
            if (frequency == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Updates", "frequency");
            }
            this.frequency = frequency;
            return this;
        }
        @CustomType.Setter
        public Builder hourOfDay(Integer hourOfDay) {
            if (hourOfDay == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Updates", "hourOfDay");
            }
            this.hourOfDay = hourOfDay;
            return this;
        }
        public GetDatabasePostgresqlV2Updates build() {
            final var _resultValue = new GetDatabasePostgresqlV2Updates();
            _resultValue.dayOfWeek = dayOfWeek;
            _resultValue.duration = duration;
            _resultValue.frequency = frequency;
            _resultValue.hourOfDay = hourOfDay;
            return _resultValue;
        }
    }
}
