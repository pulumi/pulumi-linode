// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetChildAccountsFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetChildAccountsFilterArgs Empty = new GetChildAccountsFilterArgs();

    /**
     * The method to match the field by. (`exact`, `regex`, `substring`; default `exact`)
     * 
     */
    @Import(name="matchBy")
    private @Nullable Output<String> matchBy;

    /**
     * @return The method to match the field by. (`exact`, `regex`, `substring`; default `exact`)
     * 
     */
    public Optional<Output<String>> matchBy() {
        return Optional.ofNullable(this.matchBy);
    }

    /**
     * The name of the field to filter by. See the Filterable Fields section for a complete list of filterable fields.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the field to filter by. See the Filterable Fields section for a complete list of filterable fields.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * A list of values for the filter to allow. These values should all be in string form.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return A list of values for the filter to allow. These values should all be in string form.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private GetChildAccountsFilterArgs() {}

    private GetChildAccountsFilterArgs(GetChildAccountsFilterArgs $) {
        this.matchBy = $.matchBy;
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetChildAccountsFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetChildAccountsFilterArgs $;

        public Builder() {
            $ = new GetChildAccountsFilterArgs();
        }

        public Builder(GetChildAccountsFilterArgs defaults) {
            $ = new GetChildAccountsFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param matchBy The method to match the field by. (`exact`, `regex`, `substring`; default `exact`)
         * 
         * @return builder
         * 
         */
        public Builder matchBy(@Nullable Output<String> matchBy) {
            $.matchBy = matchBy;
            return this;
        }

        /**
         * @param matchBy The method to match the field by. (`exact`, `regex`, `substring`; default `exact`)
         * 
         * @return builder
         * 
         */
        public Builder matchBy(String matchBy) {
            return matchBy(Output.of(matchBy));
        }

        /**
         * @param name The name of the field to filter by. See the Filterable Fields section for a complete list of filterable fields.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the field to filter by. See the Filterable Fields section for a complete list of filterable fields.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param values A list of values for the filter to allow. These values should all be in string form.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values A list of values for the filter to allow. These values should all be in string form.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
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

        public GetChildAccountsFilterArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetChildAccountsFilterArgs", "name");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("GetChildAccountsFilterArgs", "values");
            }
            return $;
        }
    }

}
