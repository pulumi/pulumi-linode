// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.outputs.GetDatabaseBackupsBackup;
import com.pulumi.linode.outputs.GetDatabaseBackupsFilter;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDatabaseBackupsResult {
    private @Nullable List<GetDatabaseBackupsBackup> backups;
    private Integer databaseId;
    private String databaseType;
    private @Nullable List<GetDatabaseBackupsFilter> filters;
    /**
     * @return The ID of the database backup object.
     * 
     */
    private Integer id;
    private @Nullable Boolean latest;
    private @Nullable String order;
    private @Nullable String orderBy;

    private GetDatabaseBackupsResult() {}
    public List<GetDatabaseBackupsBackup> backups() {
        return this.backups == null ? List.of() : this.backups;
    }
    public Integer databaseId() {
        return this.databaseId;
    }
    public String databaseType() {
        return this.databaseType;
    }
    public List<GetDatabaseBackupsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The ID of the database backup object.
     * 
     */
    public Integer id() {
        return this.id;
    }
    public Optional<Boolean> latest() {
        return Optional.ofNullable(this.latest);
    }
    public Optional<String> order() {
        return Optional.ofNullable(this.order);
    }
    public Optional<String> orderBy() {
        return Optional.ofNullable(this.orderBy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseBackupsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetDatabaseBackupsBackup> backups;
        private Integer databaseId;
        private String databaseType;
        private @Nullable List<GetDatabaseBackupsFilter> filters;
        private Integer id;
        private @Nullable Boolean latest;
        private @Nullable String order;
        private @Nullable String orderBy;
        public Builder() {}
        public Builder(GetDatabaseBackupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backups = defaults.backups;
    	      this.databaseId = defaults.databaseId;
    	      this.databaseType = defaults.databaseType;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.latest = defaults.latest;
    	      this.order = defaults.order;
    	      this.orderBy = defaults.orderBy;
        }

        @CustomType.Setter
        public Builder backups(@Nullable List<GetDatabaseBackupsBackup> backups) {

            this.backups = backups;
            return this;
        }
        public Builder backups(GetDatabaseBackupsBackup... backups) {
            return backups(List.of(backups));
        }
        @CustomType.Setter
        public Builder databaseId(Integer databaseId) {
            if (databaseId == null) {
              throw new MissingRequiredPropertyException("GetDatabaseBackupsResult", "databaseId");
            }
            this.databaseId = databaseId;
            return this;
        }
        @CustomType.Setter
        public Builder databaseType(String databaseType) {
            if (databaseType == null) {
              throw new MissingRequiredPropertyException("GetDatabaseBackupsResult", "databaseType");
            }
            this.databaseType = databaseType;
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetDatabaseBackupsFilter> filters) {

            this.filters = filters;
            return this;
        }
        public Builder filters(GetDatabaseBackupsFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDatabaseBackupsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder latest(@Nullable Boolean latest) {

            this.latest = latest;
            return this;
        }
        @CustomType.Setter
        public Builder order(@Nullable String order) {

            this.order = order;
            return this;
        }
        @CustomType.Setter
        public Builder orderBy(@Nullable String orderBy) {

            this.orderBy = orderBy;
            return this;
        }
        public GetDatabaseBackupsResult build() {
            final var _resultValue = new GetDatabaseBackupsResult();
            _resultValue.backups = backups;
            _resultValue.databaseId = databaseId;
            _resultValue.databaseType = databaseType;
            _resultValue.filters = filters;
            _resultValue.id = id;
            _resultValue.latest = latest;
            _resultValue.order = order;
            _resultValue.orderBy = orderBy;
            return _resultValue;
        }
    }
}
