// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatabaseEnginesEngine extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabaseEnginesEngine Empty = new GetDatabaseEnginesEngine();

    /**
     * The Managed Database engine type.
     * 
     */
    @Import(name="engine", required=true)
    private String engine;

    /**
     * @return The Managed Database engine type.
     * 
     */
    public String engine() {
        return this.engine;
    }

    /**
     * The Managed Database engine ID in engine/version format.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The Managed Database engine ID in engine/version format.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * The Managed Database engine version.
     * 
     */
    @Import(name="version", required=true)
    private String version;

    /**
     * @return The Managed Database engine version.
     * 
     */
    public String version() {
        return this.version;
    }

    private GetDatabaseEnginesEngine() {}

    private GetDatabaseEnginesEngine(GetDatabaseEnginesEngine $) {
        this.engine = $.engine;
        this.id = $.id;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseEnginesEngine defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseEnginesEngine $;

        public Builder() {
            $ = new GetDatabaseEnginesEngine();
        }

        public Builder(GetDatabaseEnginesEngine defaults) {
            $ = new GetDatabaseEnginesEngine(Objects.requireNonNull(defaults));
        }

        /**
         * @param engine The Managed Database engine type.
         * 
         * @return builder
         * 
         */
        public Builder engine(String engine) {
            $.engine = engine;
            return this;
        }

        /**
         * @param id The Managed Database engine ID in engine/version format.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param version The Managed Database engine version.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            $.version = version;
            return this;
        }

        public GetDatabaseEnginesEngine build() {
            $.engine = Objects.requireNonNull($.engine, "expected parameter 'engine' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
