// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetDatabasePostgresqlV2Args extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabasePostgresqlV2Args Empty = new GetDatabasePostgresqlV2Args();

    /**
     * The ID of the PostgreSQL database.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the PostgreSQL database.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetDatabasePostgresqlV2Args() {}

    private GetDatabasePostgresqlV2Args(GetDatabasePostgresqlV2Args $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabasePostgresqlV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabasePostgresqlV2Args $;

        public Builder() {
            $ = new GetDatabasePostgresqlV2Args();
        }

        public Builder(GetDatabasePostgresqlV2Args defaults) {
            $ = new GetDatabasePostgresqlV2Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the PostgreSQL database.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the PostgreSQL database.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetDatabasePostgresqlV2Args build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Args", "id");
            }
            return $;
        }
    }

}
