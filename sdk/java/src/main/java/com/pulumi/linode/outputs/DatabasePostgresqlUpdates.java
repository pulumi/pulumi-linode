// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatabasePostgresqlUpdates {
    /**
     * @return The day to perform maintenance.
     * 
     */
    private String dayOfWeek;
    /**
     * @return The maximum maintenance window time in hours.
     * 
     */
    private Integer duration;
    /**
     * @return Whether maintenance occurs on a weekly or monthly basis.
     * 
     */
    private String frequency;
    /**
     * @return The hour to begin maintenance based in UTC time.
     * 
     */
    private Integer hourOfDay;
    /**
     * @return The week of the month to perform monthly frequency updates. Required for monthly frequency updates.
     * 
     */
    private @Nullable Integer weekOfMonth;

    private DatabasePostgresqlUpdates() {}
    /**
     * @return The day to perform maintenance.
     * 
     */
    public String dayOfWeek() {
        return this.dayOfWeek;
    }
    /**
     * @return The maximum maintenance window time in hours.
     * 
     */
    public Integer duration() {
        return this.duration;
    }
    /**
     * @return Whether maintenance occurs on a weekly or monthly basis.
     * 
     */
    public String frequency() {
        return this.frequency;
    }
    /**
     * @return The hour to begin maintenance based in UTC time.
     * 
     */
    public Integer hourOfDay() {
        return this.hourOfDay;
    }
    /**
     * @return The week of the month to perform monthly frequency updates. Required for monthly frequency updates.
     * 
     */
    public Optional<Integer> weekOfMonth() {
        return Optional.ofNullable(this.weekOfMonth);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabasePostgresqlUpdates defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dayOfWeek;
        private Integer duration;
        private String frequency;
        private Integer hourOfDay;
        private @Nullable Integer weekOfMonth;
        public Builder() {}
        public Builder(DatabasePostgresqlUpdates defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.duration = defaults.duration;
    	      this.frequency = defaults.frequency;
    	      this.hourOfDay = defaults.hourOfDay;
    	      this.weekOfMonth = defaults.weekOfMonth;
        }

        @CustomType.Setter
        public Builder dayOfWeek(String dayOfWeek) {
            if (dayOfWeek == null) {
              throw new MissingRequiredPropertyException("DatabasePostgresqlUpdates", "dayOfWeek");
            }
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        @CustomType.Setter
        public Builder duration(Integer duration) {
            if (duration == null) {
              throw new MissingRequiredPropertyException("DatabasePostgresqlUpdates", "duration");
            }
            this.duration = duration;
            return this;
        }
        @CustomType.Setter
        public Builder frequency(String frequency) {
            if (frequency == null) {
              throw new MissingRequiredPropertyException("DatabasePostgresqlUpdates", "frequency");
            }
            this.frequency = frequency;
            return this;
        }
        @CustomType.Setter
        public Builder hourOfDay(Integer hourOfDay) {
            if (hourOfDay == null) {
              throw new MissingRequiredPropertyException("DatabasePostgresqlUpdates", "hourOfDay");
            }
            this.hourOfDay = hourOfDay;
            return this;
        }
        @CustomType.Setter
        public Builder weekOfMonth(@Nullable Integer weekOfMonth) {

            this.weekOfMonth = weekOfMonth;
            return this;
        }
        public DatabasePostgresqlUpdates build() {
            final var _resultValue = new DatabasePostgresqlUpdates();
            _resultValue.dayOfWeek = dayOfWeek;
            _resultValue.duration = duration;
            _resultValue.frequency = frequency;
            _resultValue.hourOfDay = hourOfDay;
            _resultValue.weekOfMonth = weekOfMonth;
            return _resultValue;
        }
    }
}
