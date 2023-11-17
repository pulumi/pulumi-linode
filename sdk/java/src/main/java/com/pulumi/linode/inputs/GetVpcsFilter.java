// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcsFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcsFilter Empty = new GetVpcsFilter();

    /**
     * The method to match the field by. (`exact`, `regex`, `substring`; default `exact`)
     * 
     */
    @Import(name="matchBy")
    private @Nullable String matchBy;

    /**
     * @return The method to match the field by. (`exact`, `regex`, `substring`; default `exact`)
     * 
     */
    public Optional<String> matchBy() {
        return Optional.ofNullable(this.matchBy);
    }

    /**
     * The name of the field to filter by. See the Filterable Fields section for a complete list of filterable fields.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the field to filter by. See the Filterable Fields section for a complete list of filterable fields.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * A list of values for the filter to allow. These values should all be in string form.
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    /**
     * @return A list of values for the filter to allow. These values should all be in string form.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    private GetVpcsFilter() {}

    private GetVpcsFilter(GetVpcsFilter $) {
        this.matchBy = $.matchBy;
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcsFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcsFilter $;

        public Builder() {
            $ = new GetVpcsFilter();
        }

        public Builder(GetVpcsFilter defaults) {
            $ = new GetVpcsFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param matchBy The method to match the field by. (`exact`, `regex`, `substring`; default `exact`)
         * 
         * @return builder
         * 
         */
        public Builder matchBy(@Nullable String matchBy) {
            $.matchBy = matchBy;
            return this;
        }

        /**
         * @param name The name of the field to filter by. See the Filterable Fields section for a complete list of filterable fields.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param values A list of values for the filter to allow. These values should all be in string form.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values A list of values for the filter to allow. These values should all be in string form.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetVpcsFilter build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
