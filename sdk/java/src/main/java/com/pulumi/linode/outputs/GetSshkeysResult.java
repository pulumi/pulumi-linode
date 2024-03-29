// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.outputs.GetSshkeysFilter;
import com.pulumi.linode.outputs.GetSshkeysSshkey;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSshkeysResult {
    private @Nullable List<GetSshkeysFilter> filters;
    /**
     * @return The ID of the SSH Key.
     * 
     */
    private String id;
    private @Nullable String order;
    private @Nullable String orderBy;
    private @Nullable List<GetSshkeysSshkey> sshkeys;

    private GetSshkeysResult() {}
    public List<GetSshkeysFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The ID of the SSH Key.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> order() {
        return Optional.ofNullable(this.order);
    }
    public Optional<String> orderBy() {
        return Optional.ofNullable(this.orderBy);
    }
    public List<GetSshkeysSshkey> sshkeys() {
        return this.sshkeys == null ? List.of() : this.sshkeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSshkeysResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetSshkeysFilter> filters;
        private String id;
        private @Nullable String order;
        private @Nullable String orderBy;
        private @Nullable List<GetSshkeysSshkey> sshkeys;
        public Builder() {}
        public Builder(GetSshkeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.order = defaults.order;
    	      this.orderBy = defaults.orderBy;
    	      this.sshkeys = defaults.sshkeys;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetSshkeysFilter> filters) {

            this.filters = filters;
            return this;
        }
        public Builder filters(GetSshkeysFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSshkeysResult", "id");
            }
            this.id = id;
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
        @CustomType.Setter
        public Builder sshkeys(@Nullable List<GetSshkeysSshkey> sshkeys) {

            this.sshkeys = sshkeys;
            return this;
        }
        public Builder sshkeys(GetSshkeysSshkey... sshkeys) {
            return sshkeys(List.of(sshkeys));
        }
        public GetSshkeysResult build() {
            final var _resultValue = new GetSshkeysResult();
            _resultValue.filters = filters;
            _resultValue.id = id;
            _resultValue.order = order;
            _resultValue.orderBy = orderBy;
            _resultValue.sshkeys = sshkeys;
            return _resultValue;
        }
    }
}
