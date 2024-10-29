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


public final class GetNetworkTransferPricesFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkTransferPricesFilter Empty = new GetNetworkTransferPricesFilter();

    /**
     * The type of comparison to use for this filter.
     * 
     */
    @Import(name="matchBy")
    private @Nullable String matchBy;

    /**
     * @return The type of comparison to use for this filter.
     * 
     */
    public Optional<String> matchBy() {
        return Optional.ofNullable(this.matchBy);
    }

    /**
     * The name of the attribute to filter on.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the attribute to filter on.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The value(s) to be used in the filter.
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    /**
     * @return The value(s) to be used in the filter.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    private GetNetworkTransferPricesFilter() {}

    private GetNetworkTransferPricesFilter(GetNetworkTransferPricesFilter $) {
        this.matchBy = $.matchBy;
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkTransferPricesFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkTransferPricesFilter $;

        public Builder() {
            $ = new GetNetworkTransferPricesFilter();
        }

        public Builder(GetNetworkTransferPricesFilter defaults) {
            $ = new GetNetworkTransferPricesFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param matchBy The type of comparison to use for this filter.
         * 
         * @return builder
         * 
         */
        public Builder matchBy(@Nullable String matchBy) {
            $.matchBy = matchBy;
            return this;
        }

        /**
         * @param name The name of the attribute to filter on.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param values The value(s) to be used in the filter.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The value(s) to be used in the filter.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetNetworkTransferPricesFilter build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetNetworkTransferPricesFilter", "name");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("GetNetworkTransferPricesFilter", "values");
            }
            return $;
        }
    }

}
