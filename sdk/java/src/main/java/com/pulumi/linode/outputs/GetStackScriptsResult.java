// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.linode.outputs.GetStackScriptsFilter;
import com.pulumi.linode.outputs.GetStackScriptsStackscript;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetStackScriptsResult {
    private final @Nullable List<GetStackScriptsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable Boolean latest;
    private final @Nullable String order;
    private final @Nullable String orderBy;
    private final List<GetStackScriptsStackscript> stackscripts;

    @CustomType.Constructor
    private GetStackScriptsResult(
        @CustomType.Parameter("filters") @Nullable List<GetStackScriptsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("latest") @Nullable Boolean latest,
        @CustomType.Parameter("order") @Nullable String order,
        @CustomType.Parameter("orderBy") @Nullable String orderBy,
        @CustomType.Parameter("stackscripts") List<GetStackScriptsStackscript> stackscripts) {
        this.filters = filters;
        this.id = id;
        this.latest = latest;
        this.order = order;
        this.orderBy = orderBy;
        this.stackscripts = stackscripts;
    }

    public List<GetStackScriptsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
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
    public List<GetStackScriptsStackscript> stackscripts() {
        return this.stackscripts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStackScriptsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetStackScriptsFilter> filters;
        private String id;
        private @Nullable Boolean latest;
        private @Nullable String order;
        private @Nullable String orderBy;
        private List<GetStackScriptsStackscript> stackscripts;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStackScriptsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.latest = defaults.latest;
    	      this.order = defaults.order;
    	      this.orderBy = defaults.orderBy;
    	      this.stackscripts = defaults.stackscripts;
        }

        public Builder filters(@Nullable List<GetStackScriptsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetStackScriptsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder latest(@Nullable Boolean latest) {
            this.latest = latest;
            return this;
        }
        public Builder order(@Nullable String order) {
            this.order = order;
            return this;
        }
        public Builder orderBy(@Nullable String orderBy) {
            this.orderBy = orderBy;
            return this;
        }
        public Builder stackscripts(List<GetStackScriptsStackscript> stackscripts) {
            this.stackscripts = Objects.requireNonNull(stackscripts);
            return this;
        }
        public Builder stackscripts(GetStackScriptsStackscript... stackscripts) {
            return stackscripts(List.of(stackscripts));
        }        public GetStackScriptsResult build() {
            return new GetStackScriptsResult(filters, id, latest, order, orderBy, stackscripts);
        }
    }
}
