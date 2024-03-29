// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDatabaseMysqlUpdate {
    private String dayOfWeek;
    private Integer duration;
    private String frequency;
    private Integer hourOfDay;
    private Integer weekOfMonth;

    private GetDatabaseMysqlUpdate() {}
    public String dayOfWeek() {
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
    public Integer weekOfMonth() {
        return this.weekOfMonth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseMysqlUpdate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dayOfWeek;
        private Integer duration;
        private String frequency;
        private Integer hourOfDay;
        private Integer weekOfMonth;
        public Builder() {}
        public Builder(GetDatabaseMysqlUpdate defaults) {
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
              throw new MissingRequiredPropertyException("GetDatabaseMysqlUpdate", "dayOfWeek");
            }
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        @CustomType.Setter
        public Builder duration(Integer duration) {
            if (duration == null) {
              throw new MissingRequiredPropertyException("GetDatabaseMysqlUpdate", "duration");
            }
            this.duration = duration;
            return this;
        }
        @CustomType.Setter
        public Builder frequency(String frequency) {
            if (frequency == null) {
              throw new MissingRequiredPropertyException("GetDatabaseMysqlUpdate", "frequency");
            }
            this.frequency = frequency;
            return this;
        }
        @CustomType.Setter
        public Builder hourOfDay(Integer hourOfDay) {
            if (hourOfDay == null) {
              throw new MissingRequiredPropertyException("GetDatabaseMysqlUpdate", "hourOfDay");
            }
            this.hourOfDay = hourOfDay;
            return this;
        }
        @CustomType.Setter
        public Builder weekOfMonth(Integer weekOfMonth) {
            if (weekOfMonth == null) {
              throw new MissingRequiredPropertyException("GetDatabaseMysqlUpdate", "weekOfMonth");
            }
            this.weekOfMonth = weekOfMonth;
            return this;
        }
        public GetDatabaseMysqlUpdate build() {
            final var _resultValue = new GetDatabaseMysqlUpdate();
            _resultValue.dayOfWeek = dayOfWeek;
            _resultValue.duration = duration;
            _resultValue.frequency = frequency;
            _resultValue.hourOfDay = hourOfDay;
            _resultValue.weekOfMonth = weekOfMonth;
            return _resultValue;
        }
    }
}
