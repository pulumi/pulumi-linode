// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVpcSubnetsFilter {
    /**
     * @return The method to match the field by. (`exact`, `regex`, `substring`; default `exact`)
     * 
     */
    private @Nullable String matchBy;
    /**
     * @return The name of the field to filter by. See the Filterable Fields section for a complete list of filterable fields.
     * 
     */
    private String name;
    /**
     * @return A list of values for the filter to allow. These values should all be in string form.
     * 
     */
    private List<String> values;

    private GetVpcSubnetsFilter() {}
    /**
     * @return The method to match the field by. (`exact`, `regex`, `substring`; default `exact`)
     * 
     */
    public Optional<String> matchBy() {
        return Optional.ofNullable(this.matchBy);
    }
    /**
     * @return The name of the field to filter by. See the Filterable Fields section for a complete list of filterable fields.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A list of values for the filter to allow. These values should all be in string form.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcSubnetsFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String matchBy;
        private String name;
        private List<String> values;
        public Builder() {}
        public Builder(GetVpcSubnetsFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchBy = defaults.matchBy;
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder matchBy(@Nullable String matchBy) {
            this.matchBy = matchBy;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public GetVpcSubnetsFilter build() {
            final var o = new GetVpcSubnetsFilter();
            o.matchBy = matchBy;
            o.name = name;
            o.values = values;
            return o;
        }
    }
}
