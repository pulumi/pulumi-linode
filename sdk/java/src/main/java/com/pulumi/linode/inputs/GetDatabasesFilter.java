// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatabasesFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabasesFilter Empty = new GetDatabasesFilter();

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
     * The name of the field to filter by.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the field to filter by.
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

    private GetDatabasesFilter() {}

    private GetDatabasesFilter(GetDatabasesFilter $) {
        this.matchBy = $.matchBy;
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabasesFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabasesFilter $;

        public Builder() {
            $ = new GetDatabasesFilter();
        }

        public Builder(GetDatabasesFilter defaults) {
            $ = new GetDatabasesFilter(Objects.requireNonNull(defaults));
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
         * @param name The name of the field to filter by.
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

        public GetDatabasesFilter build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetDatabasesFilter", "name");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("GetDatabasesFilter", "values");
            }
            return $;
        }
    }

}
