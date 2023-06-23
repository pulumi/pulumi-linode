// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.linode.outputs.GetAccountLoginsFilter;
import com.pulumi.linode.outputs.GetAccountLoginsLogin;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetAccountLoginsResult {
    private @Nullable List<GetAccountLoginsFilter> filters;
    /**
     * @return The unique ID of this login object.
     * 
     */
    private String id;
    private @Nullable List<GetAccountLoginsLogin> logins;

    private GetAccountLoginsResult() {}
    public List<GetAccountLoginsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The unique ID of this login object.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetAccountLoginsLogin> logins() {
        return this.logins == null ? List.of() : this.logins;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountLoginsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetAccountLoginsFilter> filters;
        private String id;
        private @Nullable List<GetAccountLoginsLogin> logins;
        public Builder() {}
        public Builder(GetAccountLoginsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.logins = defaults.logins;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetAccountLoginsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetAccountLoginsFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder logins(@Nullable List<GetAccountLoginsLogin> logins) {
            this.logins = logins;
            return this;
        }
        public Builder logins(GetAccountLoginsLogin... logins) {
            return logins(List.of(logins));
        }
        public GetAccountLoginsResult build() {
            final var o = new GetAccountLoginsResult();
            o.filters = filters;
            o.id = id;
            o.logins = logins;
            return o;
        }
    }
}
