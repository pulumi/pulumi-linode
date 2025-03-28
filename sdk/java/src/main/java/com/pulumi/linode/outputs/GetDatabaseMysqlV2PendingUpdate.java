// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDatabaseMysqlV2PendingUpdate {
    private String deadline;
    private String description;
    private String plannedFor;

    private GetDatabaseMysqlV2PendingUpdate() {}
    public String deadline() {
        return this.deadline;
    }
    public String description() {
        return this.description;
    }
    public String plannedFor() {
        return this.plannedFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseMysqlV2PendingUpdate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String deadline;
        private String description;
        private String plannedFor;
        public Builder() {}
        public Builder(GetDatabaseMysqlV2PendingUpdate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deadline = defaults.deadline;
    	      this.description = defaults.description;
    	      this.plannedFor = defaults.plannedFor;
        }

        @CustomType.Setter
        public Builder deadline(String deadline) {
            if (deadline == null) {
              throw new MissingRequiredPropertyException("GetDatabaseMysqlV2PendingUpdate", "deadline");
            }
            this.deadline = deadline;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetDatabaseMysqlV2PendingUpdate", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder plannedFor(String plannedFor) {
            if (plannedFor == null) {
              throw new MissingRequiredPropertyException("GetDatabaseMysqlV2PendingUpdate", "plannedFor");
            }
            this.plannedFor = plannedFor;
            return this;
        }
        public GetDatabaseMysqlV2PendingUpdate build() {
            final var _resultValue = new GetDatabaseMysqlV2PendingUpdate();
            _resultValue.deadline = deadline;
            _resultValue.description = description;
            _resultValue.plannedFor = plannedFor;
            return _resultValue;
        }
    }
}
