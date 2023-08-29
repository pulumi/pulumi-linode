// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFirewallsFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetFirewallsFilterArgs Empty = new GetFirewallsFilterArgs();

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

    private GetFirewallsFilterArgs() {}

    private GetFirewallsFilterArgs(GetFirewallsFilterArgs $) {
        this.matchBy = $.matchBy;
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallsFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallsFilterArgs $;

        public Builder() {
            $ = new GetFirewallsFilterArgs();
        }

        public Builder(GetFirewallsFilterArgs defaults) {
            $ = new GetFirewallsFilterArgs(Objects.requireNonNull(defaults));
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

        public GetFirewallsFilterArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
